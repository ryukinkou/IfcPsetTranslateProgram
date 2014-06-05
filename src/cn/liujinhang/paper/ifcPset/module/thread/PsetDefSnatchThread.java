package cn.liujinhang.paper.ifcPset.module.thread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import cn.liujinhang.paper.ifcPset.entity.PropertySetDef;
import cn.liujinhang.paper.ifcPset.system.Constant;
import cn.liujinhang.paper.ifcPset.system.GobalContext;

public class PsetDefSnatchThread extends BaseThread {

	private String guid;

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	@Override
	public PropertySetDef call() throws Exception {

		InputStreamReader isr = null;

		try {

			JAXBContext context = JAXBContext.newInstance(PropertySetDef.class);
			Unmarshaller marshaller = context.createUnmarshaller();

			marshaller.setSchema(SchemaFactory.newInstance(
					XMLConstants.W3C_XML_SCHEMA_NS_URI).newSchema(
					new File(Constant.PSET_DEFINITION_FILE_PATH)));

			SAXParserFactory sax = SAXParserFactory.newInstance();
			sax.setNamespaceAware(true);
			XMLReader xmlReader = sax.newSAXParser().getXMLReader();

			if (GobalContext.isReadFromLocalCache == true) {

				String filePath = Constant.CACHED_FILE_DIR_PATH + this.guid
						+ ".xml";
				FileInputStream fis = new FileInputStream(filePath);
				isr = new InputStreamReader(fis, Charset.forName("UTF-8"));

			} else {

				String url = Constant.BSDD_BASE_URL + "/IfdPSet/" + this.guid
						+ "/ifcVersion/2x4/XML";
				isr = new InputStreamReader(new URL(url).openStream(),
						Charset.forName("UTF-8"));
			}

			Source source = new SAXSource(xmlReader, new InputSource(isr));

			PropertySetDef propertySetDef = marshaller.unmarshal(source,
					PropertySetDef.class).getValue();

			return propertySetDef;

		} catch (FileNotFoundException e) {
			System.out.println("not found : " + this.guid);
			throw e;
		} finally {
			if (null != isr) {
				isr.close();
			}
		}

	}
}
