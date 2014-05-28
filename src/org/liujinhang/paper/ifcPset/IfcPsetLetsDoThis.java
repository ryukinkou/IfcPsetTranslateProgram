package org.liujinhang.paper.ifcPset;

import org.liujinhang.paper.ifcPset.module.PsetDefinitionPuller;
import org.liujinhang.paper.ifcPset.module.PsetDefinitionReader;

public class IfcPsetLetsDoThis {

	public static void main(String[] args) {

		new PsetDefinitionPuller().pull();

		new PsetDefinitionReader().read();

	}
}
