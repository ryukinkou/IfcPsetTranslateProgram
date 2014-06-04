package cn.liujinhang.paper.ifcPset.module.thread;

import java.io.File;
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

public class IFCPsetDefinitionPullingThread extends BaseThread {

	private String guid;

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	@Override
	public IFCPsetDefinitionPullingResult call() throws Exception {

		JAXBContext context = JAXBContext.newInstance(PropertySetDef.class);
		Unmarshaller shaller = context.createUnmarshaller();
		shaller.setSchema(SchemaFactory.newInstance(
				XMLConstants.W3C_XML_SCHEMA_NS_URI).newSchema(
				new File(Constant.PSET_DEFINITION_FILE_PATH)));

		SAXParserFactory sax = SAXParserFactory.newInstance();
		sax.setNamespaceAware(true);
		XMLReader xmlReader = sax.newSAXParser().getXMLReader();

		String url = Constant.BSDD_BASE_URL + "/IfdPSet/" + this.guid
				+ "/ifcVersion/2x4/XML";

		IFCPsetDefinitionPullingResult result = new IFCPsetDefinitionPullingResult();

		try {
			
			System.out.println(url);
			
			Source source = new SAXSource(xmlReader, new InputSource(
					new InputStreamReader(new URL(url).openStream(),
							Charset.forName("UTF-8"))));

			System.out.println("aaaaaa");
			
			PropertySetDef propertySetDef = shaller.unmarshal(source,
					PropertySetDef.class).getValue();

			result.setGuid(guid);
			result.setPropertySetDef(propertySetDef);
			result.setSucceed(true);

			return result;

		} catch (Exception e) {

			e.printStackTrace();
			
			result.setGuid(guid);
			result.setException(e);
			result.setSucceed(false);

			return result;
		}

	}

}
