package cn.liujinhang.paper.ifcPset.module;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.filters.AndFilter;
import org.htmlparser.filters.HasAttributeFilter;
import org.htmlparser.filters.TagNameFilter;
import org.htmlparser.tags.Div;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.tags.TableRow;
import org.htmlparser.util.NodeList;

import cn.liujinhang.paper.ifcPset.system.Constant;
import cn.liujinhang.paper.ifcPset.system.GobalContext;

public class PsetDefinitionPuller {

	public void pullFromIFCDocument() {

		try {

			URL indexPage = new URL(Constant.PSET_FILE_DIR_URL);
			Parser parser = new Parser(
					(HttpURLConnection) (indexPage.openConnection()));

			NodeFilter filter = new AndFilter(new TagNameFilter("a"),
					new HasAttributeFilter("href"));
			NodeList list = parser.extractAllNodesThatMatch(filter);

			for (int i = 0; i < list.size(); i++) {

				Node node = list.elementAt(i);

				if (node instanceof LinkTag) {

					LinkTag linkTag = (LinkTag) node;
					String link = linkTag.getLink();

					if (link.indexOf(Constant.PSET_FILE_DIR_URL) != -1
							&& link.indexOf(".xml") != -1) {

						GobalContext.PsetFileLocation.add(link);

					}

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void pullFromIFDLibrary() {

		try {

			// URL sourcePage = new URL(Constant.PSET_BROWSE_VIEW_URL);
			//
			// Parser parser = new Parser(
			// (HttpURLConnection) (sourcePage.openConnection()));

			// load file from local start
			StringBuffer content = new StringBuffer();
			BufferedReader reader = new BufferedReader(
					new FileReader(
							new File(
									"/Users/RYU/git/IfcPsetTranslateProgram/ifcPset/BrowseView.html")));
			String strLine = "";
			while ((strLine = reader.readLine()) != null) {
				content.append(strLine);
				content.append("\r\n");
			}
			reader.close();

			Parser parser = Parser.createParser(content.toString(), "UTF-8");
			// load file from local end

			NodeFilter filter = new AndFilter(new TagNameFilter("tr"),
					new HasAttributeFilter("data-guid"));
			NodeList list = parser.extractAllNodesThatMatch(filter);

			for (int i = 0; i < list.size(); i++) {

				Node node = list.elementAt(i);

				if (node instanceof TableRow) {

					TableRow trPset = (TableRow) node;

					if (trPset.getParent().getParent().getParent().getParent() instanceof Div) {

						Div divPset = (Div) trPset.getParent().getParent()
								.getParent();

						if (divPset.getAttribute("id").equals("collapseFour")) {

							GobalContext.PsetGuid.add(trPset
									.getAttribute("data-guid"));

						}

					}

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
