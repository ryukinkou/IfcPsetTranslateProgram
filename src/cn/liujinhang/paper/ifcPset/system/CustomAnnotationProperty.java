package cn.liujinhang.paper.ifcPset.system;

import com.hp.hpl.jena.rdf.model.Property;

public class CustomAnnotationProperty {

	public static Property GUID = GobalContext.IFCOntology.getProperty(ToolKit
			.getFullName("guid"));

	public static Property DEFINITION = GobalContext.IFCOntology
			.getProperty(ToolKit.getFullName("definition"));

	public static Property FULL_NAME = GobalContext.IFCOntology
			.getProperty(ToolKit.getFullName("fullName"));

	public static Property SHORT_NAME = GobalContext.IFCOntology
			.getProperty(ToolKit.getFullName("shortName"));

	public static Property STATUS = GobalContext.IFCOntology
			.getProperty(ToolKit.getFullName("status"));

	public static Property VERSION_ID = GobalContext.IFCOntology
			.getProperty(ToolKit.getFullName("versionId"));

	public static Property VERSION_DATE = GobalContext.IFCOntology
			.getProperty(ToolKit.getFullName("versionDate"));

	public static Property LEXEME = GobalContext.IFCOntology
			.getProperty(ToolKit.getFullName("lexeme"));

	public static Property BLOB_STORE_KEY = GobalContext.IFCOntology
			.getProperty(ToolKit.getFullName("blobstoreKey"));

	public static Property ILLUSTRATION_URL = GobalContext.IFCOntology
			.getProperty(ToolKit.getFullName("illustrationUrl"));

}
