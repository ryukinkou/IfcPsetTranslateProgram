package org.liujinhang.paper.ifcPset;

import org.liujinhang.paper.ifcPset.module.PsetDefinitionPuller;
import org.liujinhang.paper.ifcPset.module.PsetDefinitionReader;
import org.liujinhang.paper.ifcPset.module.PsetDefinitionWriter;

public class LetsDoThis {

	public static void main(String[] args) {

		new PsetDefinitionPuller().pullFromIFDLibrary();

		new PsetDefinitionReader().read();

		new PsetDefinitionWriter().lanuch();

	}
}
