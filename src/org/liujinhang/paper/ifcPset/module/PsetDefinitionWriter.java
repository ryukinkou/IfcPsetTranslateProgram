package org.liujinhang.paper.ifcPset.module;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.concurrent.Future;

import javax.xml.bind.JAXBElement;

import org.liujinhang.paper.ifcPset.entity.PropertyDef;
import org.liujinhang.paper.ifcPset.entity.PropertyDef.DefinitionAliases.DefinitionAlias;
import org.liujinhang.paper.ifcPset.entity.PropertyDef.NameAliases.NameAlias;
import org.liujinhang.paper.ifcPset.entity.PropertySetDef;
import org.liujinhang.paper.ifcPset.entity.PropertyType;
import org.liujinhang.paper.ifcPset.module.thread.IFCPsetDefinitionPullingResult;
import org.liujinhang.paper.ifcPset.system.Constant;
import org.liujinhang.paper.ifcPset.system.CustomAnnotationProperty;
import org.liujinhang.paper.ifcPset.system.GobalContext;
import org.liujinhang.paper.ifcPset.system.ToolKit;

import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.ontology.AllValuesFromRestriction;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntProperty;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;

public class PsetDefinitionWriter {

	public PsetDefinitionWriter() {
		GobalContext.IFCOntology = ModelFactory.createOntologyModel();
		GobalContext.IFCOntology.read(Constant.INPUT_IFC_OWL_FILE_PATH);

		GobalContext.IFCOntologyNamespace = GobalContext.IFCOntology
				.getNsPrefixMap().get("base");

	}

	public void lanuch() {

		int capacity = 20;
		int cached = 0;

		for (Future<IFCPsetDefinitionPullingResult> future : GobalContext.IFCPsetDefinitionPullingResults) {

			try {

				IFCPsetDefinitionPullingResult result = future.get();

				if (result.isSucceed() == true) {

					this.write(result.getPropertySetDef());

					cached++;

					// temp saving
					if (cached >= capacity) {

						GobalContext.IFCOntology.write(new FileOutputStream(
								new File(Constant.OUTPUT_IFC_OWL_FILE_PATH)),
								"RDF/XML-ABBREV");

						GobalContext.IFCOntology.close();

						GobalContext.IFCOntology = ModelFactory
								.createOntologyModel();
						GobalContext.IFCOntology
								.read(Constant.OUTPUT_IFC_OWL_FILE_PATH);

						cached = 0;

					}

				} else if (result.isSucceed() == false) {

				}

			} catch (Exception e) {

				e.printStackTrace();

			}

		}

		try {

			GobalContext.IFCOntology.write(new FileOutputStream(new File(
					Constant.OUTPUT_IFC_OWL_FILE_PATH)), "RDF/XML-ABBREV");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void write(PropertySetDef pSetDef) {

		OntClass pSetClazz = GobalContext.IFCOntology
				.createClass(GobalContext.IFCOntologyNamespace + "#"
						+ pSetDef.getName());
		
		
		pSetClazz.addLiteral(CustomAnnotationProperty.GUID,
							GobalContext.IFCOntology.createLiteral(
									pSetDef.getIfdguid(),
									"en"));
		
		pSetClazz.setLabel(pSetDef.getName(), pSetDef.getIfcVersion().getVersion());
		
		System.out.println("-----------------------------------------");
		System.out.println(pSetDef.getApplicableTypeValue());
		System.out.println(pSetDef.getApplicability());
		System.out.println(pSetDef.getApplicableClasses().toString());
		System.out.println("-----------------------------------------");

		for (PropertyDef propertyDef : pSetDef.getPropertyDefs()
				.getPropertyDef()) {

			String propertyName = null;
			String propertyType = null;
			PropertyDef.NameAliases nameAliases = null;
			PropertyDef.DefinitionAliases definitionAliases = null;
			OntProperty property = null;
			Resource type = null;
			AllValuesFromRestriction avf = null;

			for (@SuppressWarnings("rawtypes")
			JAXBElement element : propertyDef.getNameOrValueDefOrDefinition()) {

				// PropertyName
				if (element.getDeclaredType().equals(String.class)
						&& element.getName().getLocalPart().equals("Name")) {
					propertyName = (String) element.getValue();
				}

				// PropertyType
				if (element.getDeclaredType().equals(PropertyType.class)) {
					propertyType = this
							.getNonEmptyFieldSimpleName((PropertyType) element
									.getValue());
				}

				if (element.getDeclaredType().equals(
						PropertyDef.NameAliases.class)) {
					nameAliases = (PropertyDef.NameAliases) element.getValue();
				}

				if (element.getDeclaredType().equals(
						PropertyDef.DefinitionAliases.class)) {
					definitionAliases = (PropertyDef.DefinitionAliases) element
							.getValue();
				}

				// deprecated by ifc standard.
				if (element.getDeclaredType()
						.equals(PropertyDef.ValueDef.class)) {

					@SuppressWarnings("unused")
					PropertyDef.ValueDef valueDef = (PropertyDef.ValueDef) element
							.getValue();

				}

			}

			if (propertyType != null && propertyType.trim().equals("") == false) {

				property = GobalContext.IFCOntology
						.createObjectProperty(ToolKit
								.getObjectPredicate(propertyName));

				type = GobalContext.IFCOntology.createClass(ToolKit
						.getLocalFullName(propertyType));

			} else {

				property = GobalContext.IFCOntology
						.createDatatypeProperty(ToolKit
								.getDatatypePredicate(propertyName));

				type = GobalContext.IFCOntology
						.createResource(XSDDatatype.XSDstring.getURI());

			}

			if (null != property && null != nameAliases
					&& nameAliases.getNameAlias().size() > 0) {
				for (NameAlias nameAlias : nameAliases.getNameAlias()) {
					property.addLabel(nameAlias.getValue(), nameAlias.getLang());
				}
			}

			if (null != property && null != definitionAliases
					&& definitionAliases.getDefinitionAlias().size() > 0) {
				for (DefinitionAlias definitionAlias : definitionAliases
						.getDefinitionAlias()) {

					property.addLiteral(CustomAnnotationProperty.DEFINITION,
							GobalContext.IFCOntology.createLiteral(
									definitionAlias.getValue(),
									definitionAlias.getLang()));

				}
			}

			property.addLiteral(
					CustomAnnotationProperty.GUID,
					GobalContext.IFCOntology.createLiteral(
							propertyDef.getIfdguid(), "en"));

			avf = GobalContext.IFCOntology.createAllValuesFromRestriction(null,
					property, type);

			pSetClazz.addSuperClass(avf);

			System.out
					.println(propertyName + " -> " + propertyType != null ? propertyType
							: "string");

		}

	}

	@SuppressWarnings("rawtypes")
	public String getNonEmptyFieldSimpleName(PropertyType type) {
		String simpleName = null;
		Class clazz = (Class) type.getClass();
		for (Field field : clazz.getDeclaredFields()) {
			try {
				field.setAccessible(true);
				Object value = field.get(type);
				if (null != value) {
					simpleName = value.getClass().getSimpleName();
					break;
				}
			} catch (Exception e) {
			}
		}

		return simpleName;

	}
}
