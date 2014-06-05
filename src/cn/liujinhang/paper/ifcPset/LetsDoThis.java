package cn.liujinhang.paper.ifcPset;

import java.util.List;
import java.util.concurrent.Future;

import cn.liujinhang.paper.ifcPset.entity.PropertySetDef;
import cn.liujinhang.paper.ifcPset.module.PsetDefGUIDSnatcher;
import cn.liujinhang.paper.ifcPset.module.PsetDefSnatcher;
import cn.liujinhang.paper.ifcPset.module.PsetDefOntologyGenerator;

public class LetsDoThis {

	public static void main(String[] args) {

		List<String> pSetGUID = new PsetDefGUIDSnatcher().lanuch();

		List<Future<PropertySetDef>> futures = new PsetDefSnatcher(pSetGUID)
				.lanuch();

		new PsetDefOntologyGenerator(futures).lanuch();

	}
}
