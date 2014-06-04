package cn.liujinhang.paper.ifcPset.module;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import cn.liujinhang.paper.ifcPset.entity.PropertySetDef;
import cn.liujinhang.paper.ifcPset.module.thread.IFCPsetDefinitionPullingResult;
import cn.liujinhang.paper.ifcPset.module.thread.IFCPsetDefinitionPullingThread;
import cn.liujinhang.paper.ifcPset.system.GobalContext;

public class PsetDefinitionReader {

	private ExecutorService threadPool;

	public PsetDefinitionReader() {
		threadPool = Executors.newFixedThreadPool(20);
	}

	@SuppressWarnings("unchecked")
	public void read() {

		try {

			for (String guid : GobalContext.PsetGuid) {

				IFCPsetDefinitionPullingThread thread = new IFCPsetDefinitionPullingThread();

				thread.setGuid(guid);

				Future<PropertySetDef> future = threadPool
						.submit(thread);
				GobalContext.IFCPsetDefinitionPullingResults.add(future);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.threadPool.shutdown();
		}

	}
}
