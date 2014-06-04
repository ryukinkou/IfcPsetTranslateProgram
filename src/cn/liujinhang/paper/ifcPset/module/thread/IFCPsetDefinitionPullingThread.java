package cn.liujinhang.paper.ifcPset.module.thread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
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

public class IFCPsetDefinitionPullingThread extends BaseThread {

	private String guid;

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public boolean saveAs(String strUrl, String fileName) {
		try {
			URL url = new URL(strUrl);
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			DataInputStream in = new DataInputStream(
					connection.getInputStream());
			DataOutputStream out = new DataOutputStream(new FileOutputStream(
					fileName));
			byte[] buffer = new byte[4096];
			int count = 0;
			while ((count = in.read(buffer)) > 0) {
				out.write(buffer, 0, count);
			}
			out.close();
			in.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public PropertySetDef call() throws Exception {

		JAXBContext context = JAXBContext.newInstance(PropertySetDef.class);
		Unmarshaller marshaller = context.createUnmarshaller();
		marshaller.setSchema(SchemaFactory.newInstance(
				XMLConstants.W3C_XML_SCHEMA_NS_URI).newSchema(
				new File(Constant.PSET_DEFINITION_FILE_PATH)));

		SAXParserFactory sax = SAXParserFactory.newInstance();
		sax.setNamespaceAware(true);
		XMLReader xmlReader = sax.newSAXParser().getXMLReader();

		InputStreamReader isr = null;

		try {

			if (GobalContext.isReadFromLocal == true) {

				String filePath = Constant.CACHE_FILE_DIR_PATH + this.guid
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

		} catch (Exception e) {
			System.out.println(this.guid);
			throw e;
		} finally {
			if (null != isr) {
				isr.close();
			}
		}

	}
}
