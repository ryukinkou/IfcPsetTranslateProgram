package cn.liujinhang.paper.ifcPset.module.thread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.validation.SchemaFactory;

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

			System.out.println("Fetching : " + url);
			String fileName = Constant.CACHE_FILE_DIR_PATH + this.guid + ".xml";
			new File(fileName).delete();
			this.saveAs(url, fileName);
			System.out.println("Finish : " + url);

			// Source source = new SAXSource(xmlReader, new InputSource(
			// new InputStreamReader(new URL(url).openStream(),
			// Charset.forName("UTF-8"))));

			// PropertySetDef propertySetDef = shaller.unmarshal(source,
			// PropertySetDef.class).getValue();

			// result.setGuid(guid);
			// result.setPropertySetDef(propertySetDef);
			// result.setSucceed(true);

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
