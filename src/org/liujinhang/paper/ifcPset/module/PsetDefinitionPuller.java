package org.liujinhang.paper.ifcPset.module;

import java.net.HttpURLConnection;
import java.net.URL;

import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.filters.AndFilter;
import org.htmlparser.filters.HasAttributeFilter;
import org.htmlparser.filters.TagNameFilter;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.util.NodeList;
import org.liujinhang.paper.ifcPset.system.Constant;
import org.liujinhang.paper.ifcPset.system.GobalContext;

public class PsetDefinitionPuller {

	public void pull() {

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
}
