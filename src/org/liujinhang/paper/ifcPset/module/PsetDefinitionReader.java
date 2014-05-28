package org.liujinhang.paper.ifcPset.module;

import java.io.File;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;
import javax.xml.validation.SchemaFactory;

import org.liujinhang.paper.ifcPset.entity.PropertySetDef;
import org.liujinhang.paper.ifcPset.system.Constant;
import org.liujinhang.paper.ifcPset.system.GobalContext;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

public class PsetDefinitionReader {

	public void read() {

		try {

			JAXBContext context = JAXBContext.newInstance(PropertySetDef.class);
			Unmarshaller shaller = context.createUnmarshaller();
			shaller.setSchema(SchemaFactory.newInstance(
					XMLConstants.W3C_XML_SCHEMA_NS_URI).newSchema(
					new File(Constant.PSET_DEFINITION_FILE_PATH)));

			SAXParserFactory sax = SAXParserFactory.newInstance();
			sax.setNamespaceAware(false);
			XMLReader xmlReader = sax.newSAXParser().getXMLReader();

			for (String pSetFileUrl : GobalContext.PsetFileLocation) {

				System.out.println(pSetFileUrl);
				
				Source source = new SAXSource(xmlReader, new InputSource(
						new URL(pSetFileUrl).openStream()));

				JAXBElement<PropertySetDef> root = shaller.unmarshal(source,
						PropertySetDef.class);

				// TEST
				PropertySetDef def = root.getValue();

				System.out.println(def.getName());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
