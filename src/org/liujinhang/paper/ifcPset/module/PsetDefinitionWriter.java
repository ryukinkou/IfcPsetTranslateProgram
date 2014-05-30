package org.liujinhang.paper.ifcPset.module;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.Future;

import javax.xml.bind.JAXBElement;

import org.liujinhang.paper.ifcPset.entity.PropertyDef;
import org.liujinhang.paper.ifcPset.entity.PropertySetDef;
import org.liujinhang.paper.ifcPset.module.thread.IFCPsetDefinitionPullingResult;
import org.liujinhang.paper.ifcPset.system.Constant;
import org.liujinhang.paper.ifcPset.system.GobalContext;

import com.hp.hpl.jena.rdf.model.ModelFactory;

public class PsetDefinitionWriter {

	public PsetDefinitionWriter() {
		GobalContext.IFCOntology = ModelFactory.createOntologyModel();
		GobalContext.IFCOntology.read(Constant.INPUT_IFC_OWL_FILE_PATH);

		GobalContext.IFCOntologyNamespace = GobalContext.IFCOntology
				.getNsPrefixMap().get("base");

	}

	public void lanuch() {

		for (Future<IFCPsetDefinitionPullingResult> future : GobalContext.IFCPsetDefinitionPullingResults) {

			try {

				IFCPsetDefinitionPullingResult result = future.get();

				if (result.isSucceed() == true) {
					// System.out.println(result.getGuid() + " | ¡ð | "
					// + result.getPropertySetDef().getName());

					this.write(result.getPropertySetDef());

				} else if (result.isSucceed() == false) {
					// System.out.println(result.getGuid() + " | ¡Á | "
					// + result.getException().toString());
				}

			} catch (Exception e) {

				e.printStackTrace();

			}

		}

		File file = new File(Constant.OUTPUT_IFC_OWL_FILE_PATH);
		file.delete();

		try {
			GobalContext.IFCOntology.write(new FileOutputStream(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void write(PropertySetDef pSetDef) {

		GobalContext.IFCOntology.createClass(GobalContext.IFCOntologyNamespace
				+ "#" + pSetDef.getName());

		System.out.println("-----------------------------");

		System.out.println("guid : " + pSetDef.getIfdguid());
		System.out.println(pSetDef.getName() + " -> "
				+ pSetDef.getApplicableClasses().getClassName().toString());

		for (PropertyDef pDef : pSetDef.getPropertyDefs().getPropertyDef()) {

			for (JAXBElement element : pDef.getNameOrValueDefOrDefinition()) {

				if (element.getDeclaredType().equals(String.class)) {

					String str = (String) element.getValue();
					System.out.println("1");

				}

				if (element.getDeclaredType().equals(
						PropertyDef.NameAliases.class)) {

					PropertyDef.NameAliases nameAliases = (PropertyDef.NameAliases) element
							.getValue();

					System.out.println("2");
				}

				if (element.getDeclaredType().equals(
						PropertyDef.DefinitionAliases.class)) {

					PropertyDef.DefinitionAliases definitionAliases = (PropertyDef.DefinitionAliases) element
							.getValue();

					System.out.println("3");

				}

				if (element.getDeclaredType()
						.equals(PropertyDef.ValueDef.class)) {

					PropertyDef.ValueDef valueDef = (PropertyDef.ValueDef) element
							.getValue();

					System.out.println("4");

				}

			}

		}

		System.out.println("-----------------------------");

	}

}
