package cn.liujinhang.paper.ifcPset.module;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

import javax.xml.bind.JAXBElement;

import cn.liujinhang.paper.ifcPset.entity.PropertyDef;
import cn.liujinhang.paper.ifcPset.entity.PropertyDef.DefinitionAliases.DefinitionAlias;
import cn.liujinhang.paper.ifcPset.entity.PropertyDef.NameAliases.NameAlias;
import cn.liujinhang.paper.ifcPset.entity.PropertySetDef;
import cn.liujinhang.paper.ifcPset.entity.PropertyType;
import cn.liujinhang.paper.ifcPset.system.Constant;
import cn.liujinhang.paper.ifcPset.system.CustomAnnotationProperty;
import cn.liujinhang.paper.ifcPset.system.GobalContext;
import cn.liujinhang.paper.ifcPset.system.ToolKit;

import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.ontology.AllValuesFromRestriction;
import com.hp.hpl.jena.ontology.ObjectProperty;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntProperty;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;

public class PsetDefOntologyGenerator {

	private int capacity;

	private int buffer;

	private Map<String, List<String>> relations;

	private List<Future<PropertySetDef>> futures;

	public PsetDefOntologyGenerator(List<Future<PropertySetDef>> futures) {

		this.futures = futures;

		this.capacity = 20;
		this.buffer = 0;

		relations = new HashMap<String, List<String>>();

		GobalContext.IFCOntology = ModelFactory.createOntologyModel();
		GobalContext.IFCOntology.read(Constant.INPUT_IFC_OWL_FILE_PATH);
		GobalContext.IFCOntologyNamespace = GobalContext.IFCOntology
				.getNsPrefixMap().get("base");

	}

	public void lanuch() {

		for (Future<PropertySetDef> future : this.futures) {
			try {

				PropertySetDef pSetDef = future.get();

				this.queryPredicateLogic(pSetDef);
				this.generateClassDefinition(pSetDef);

				this.buffer++;
				if (this.buffer >= this.capacity) {

					this.saveCurrentOntology();
					this.loadCurrentOntology();

					this.buffer = 0;
				}

			} catch (Exception e) {
			}

		}
		this.saveCurrentOntology();

		this.buffer = 0;
		this.loadCurrentOntology();
		for (String className : this.relations.keySet()) {

			try {

				this.generatePredicateLogic(className);

				this.buffer++;

				if (this.buffer >= this.capacity) {

					this.saveCurrentOntology();
					this.loadCurrentOntology();

					this.buffer = 0;
				}

			} catch (Exception e) {
			}

		}
		this.saveCurrentOntology();

	}

	private void generateClassDefinition(PropertySetDef pSetDef) {

		OntClass pSetClazz = GobalContext.IFCOntology.createClass(ToolKit
				.getFullName(pSetDef.getName()));

		pSetClazz.addLiteral(CustomAnnotationProperty.GUID,
				GobalContext.IFCOntology.createLiteral(pSetDef.getIfdguid(),
						"en"));

		pSetClazz.setLabel(pSetDef.getName(), "IFC "
				+ pSetDef.getIfcVersion().getVersion());

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

				// deprecated by IFC standard.
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

				type = GobalContext.IFCOntology.getOntClass(ToolKit
						.getFullName(propertyType));

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

		}

	}
	

	@SuppressWarnings("rawtypes")
	private String getNonEmptyFieldSimpleName(PropertyType type) {
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
	

	private void loadCurrentOntology() {
		GobalContext.IFCOntology = ModelFactory.createOntologyModel();
		GobalContext.IFCOntology.read(Constant.OUTPUT_IFC_OWL_FILE_PATH);
	}

	private void saveCurrentOntology() {
		try {
			if (null != GobalContext.IFCOntology
					&& GobalContext.IFCOntology.isClosed() == false) {
				GobalContext.IFCOntology.write(new FileOutputStream(new File(
						Constant.OUTPUT_IFC_OWL_FILE_PATH)), "RDF/XML-ABBREV");
				GobalContext.IFCOntology.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void queryPredicateLogic(PropertySetDef pSetDef) {

		List<String> relation = null;
		for (String className : pSetDef.getApplicableClasses().getClassName()) {

			String pureClassName = className.split("/")[0];

			if (this.relations.containsKey(pureClassName)) {
				relation = this.relations.get(pureClassName);
			} else {
				relation = new ArrayList<String>();
				this.relations.put(pureClassName, relation);
			}

			relation.add(pSetDef.getName());

		}

	}

	private void generatePredicateLogic(String className) {

		OntClass clazz = GobalContext.IFCOntology.getOntClass(ToolKit
				.getFullName(className));

		for (String predicate : this.relations.get(className)) {

			ObjectProperty property = GobalContext.IFCOntology
					.createObjectProperty(ToolKit.getObjectPredicate(predicate));

			Resource type = GobalContext.IFCOntology.getOntClass(ToolKit
					.getFullName(predicate));

			AllValuesFromRestriction avf = GobalContext.IFCOntology
					.createAllValuesFromRestriction(null, property, type);

			clazz.addSuperClass(avf);

		}

	}

}
