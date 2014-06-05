package cn.liujinhang.paper.ifcPset.system;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

public class ToolKit {

	public static String getFullName(String localName) {

		if (GobalContext.IFCOntologyNamespace.endsWith("#")) {
			return GobalContext.IFCOntologyNamespace + localName;
		} else {
			return GobalContext.IFCOntologyNamespace + "#" + localName;
		}

	}

	public static String getDatatypePredicate(String localName) {

		return ToolKit.getFullName(localName);

	}

	public static String getObjectPredicate(String localName) {

		if (GobalContext.IFCOntologyNamespace.endsWith("#")) {
			return GobalContext.IFCOntologyNamespace
					+ Constant.PREDICATE_PERFIX
					+ localName.substring(0, 1).toUpperCase()
					+ localName.substring(1);
		} else {
			return GobalContext.IFCOntologyNamespace + "#"
					+ Constant.PREDICATE_PERFIX
					+ localName.substring(0, 1).toUpperCase()
					+ localName.substring(1);
		}

	}

	public static boolean urlSaveAs(String strUrl, String fileName) {
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

	public static String decodeInputStreamToString(InputStream inputStream,
			Charset charset) {

		String currentLine = "";
		String outputString = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				inputStream, charset));
		try {
			while ((currentLine = reader.readLine()) != null) {
				outputString += currentLine + "\r\n";
			}
			return outputString;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}

}
