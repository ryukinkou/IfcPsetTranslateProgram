package cn.liujinhang.paper.ifcPset.module;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

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

public class PsetDefGUIDSnatcher {

	public List<String> launch() {

		return this.snatchFromIFDLibrary();

	}

	public List<String> snatchFromIFCDocument() {

		List<String> pSetDefFileLocation = null;

		try {

			pSetDefFileLocation = new ArrayList<String>();

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

						pSetDefFileLocation.add(link);

					}

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return pSetDefFileLocation;

	}

	public List<String> snatchFromIFDLibrary() {

		Parser parser = null;
		List<String> pSetDefGUID = null;

		try {

			pSetDefGUID = new ArrayList<String>();

			if (GobalContext.isReadFromLocalCache == true) {

				StringBuffer content = new StringBuffer();
				BufferedReader reader = new BufferedReader(new FileReader(
						new File(Constant.CACHED_BROWSE_VIEW_FILE_PATH)));

				String strLine = "";
				while ((strLine = reader.readLine()) != null) {
					content.append(strLine);
					content.append("\r\n");
				}
				reader.close();

				parser = Parser.createParser(content.toString(), "UTF-8");

			} else {
				URL sourcePage = new URL(Constant.PSET_BROWSE_VIEW_URL);
				parser = new Parser(
						(HttpURLConnection) (sourcePage.openConnection()));
			}

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

							pSetDefGUID.add(trPset.getAttribute("data-guid"));

						}

					}

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return pSetDefGUID;

	}
}
