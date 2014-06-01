package org.liujinhang.paper.ifcPset.system;

import com.hp.hpl.jena.rdf.model.Property;

public class CustomAnnotationProperty {

	public static Property GUID = GobalContext.IFCOntology.getProperty(ToolKit
			.getLocalFullName("guid"));

	public static Property DEFINITION = GobalContext.IFCOntology
			.getProperty(ToolKit.getLocalFullName("definition"));

	public static Property FULL_NAME = GobalContext.IFCOntology
			.getProperty(ToolKit.getLocalFullName("fullName"));

	public static Property SHORT_NAME = GobalContext.IFCOntology
			.getProperty(ToolKit.getLocalFullName("shortName"));

	public static Property STATUS = GobalContext.IFCOntology
			.getProperty(ToolKit.getLocalFullName("status"));

	public static Property VERSION_ID = GobalContext.IFCOntology
			.getProperty(ToolKit.getLocalFullName("versionId"));

	public static Property VERSION_DATE = GobalContext.IFCOntology
			.getProperty(ToolKit.getLocalFullName("versionDate"));

	public static Property LEXEME = GobalContext.IFCOntology
			.getProperty(ToolKit.getLocalFullName("lexeme"));

	public static Property BLOB_STORE_KEY = GobalContext.IFCOntology
			.getProperty(ToolKit.getLocalFullName("blobstoreKey"));

	public static Property ILLUSTRATION_URL = GobalContext.IFCOntology
			.getProperty(ToolKit.getLocalFullName("illustrationUrl"));

}
