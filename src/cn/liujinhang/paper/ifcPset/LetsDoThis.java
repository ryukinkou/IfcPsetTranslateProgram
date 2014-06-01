package cn.liujinhang.paper.ifcPset;

import cn.liujinhang.paper.ifcPset.module.PsetDefinitionPuller;
import cn.liujinhang.paper.ifcPset.module.PsetDefinitionReader;
import cn.liujinhang.paper.ifcPset.module.PsetDefinitionWriter;

public class LetsDoThis {

	public static void main(String[] args) {

		new PsetDefinitionPuller().pullFromIFDLibrary();

		new PsetDefinitionReader().read();

		new PsetDefinitionWriter().lanuch();

	}
}
