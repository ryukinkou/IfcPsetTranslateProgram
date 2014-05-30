package org.liujinhang.paper.ifcPset.module.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

@SuppressWarnings("rawtypes")
public abstract class BaseThread implements Callable {

	public String decodeInputStreamToString(InputStream inputStream, Charset charset) {

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
