package org.liujinhang.paper.ifcPset.module;

import java.util.concurrent.Future;

import org.liujinhang.paper.ifcPset.module.thread.IFCPsetDefinitionPullingResult;
import org.liujinhang.paper.ifcPset.system.GobalContext;

public class PsetDefinitionWriter {

	public void write() {

		for (Future<IFCPsetDefinitionPullingResult> future : GobalContext.IFCPsetDefinitionPullingResults) {

			try {

				IFCPsetDefinitionPullingResult result = future.get();

				if (result.isSucceed() == true) {
					System.out.println(result.getGuid() + " | ¡ð | "
							+ result.getPropertySetDef().getName());
				} else if (result.isSucceed() == false) {
					System.out.println(result.getGuid() + " | ¡Á | "
							+ result.getException().toString());
				}

			} catch (Exception e) {

				e.printStackTrace();

			}

		}

	}
}
