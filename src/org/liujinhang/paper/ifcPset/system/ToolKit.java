package org.liujinhang.paper.ifcPset.system;

public class ToolKit {

	public static String getLocalFullName(String localName) {

		if (GobalContext.IFCOntologyNamespace.endsWith("#")) {
			return GobalContext.IFCOntologyNamespace + localName;
		} else {
			return GobalContext.IFCOntologyNamespace + "#" + localName;
		}

	}

	public static String getDatatypePredicate(String localName) {

		return ToolKit.getLocalFullName(localName);

	}

	public static String getObjectPredicate(String localName) {

		if (GobalContext.IFCOntologyNamespace.endsWith("#")) {
			return GobalContext.IFCOntologyNamespace
					+ Constant.PREDICATE_PERFIX
					+ localName.substring(0, 1).toUpperCase()
					+ localName.substring(1);
		} else {
			return GobalContext.IFCOntologyNamespace + "#"
					+ Constant.PREDICATE_PERFIX
					+ localName.substring(0, 1).toUpperCase()
					+ localName.substring(1);
		}

	}

}
