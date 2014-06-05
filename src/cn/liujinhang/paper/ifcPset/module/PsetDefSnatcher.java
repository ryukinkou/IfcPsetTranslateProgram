package cn.liujinhang.paper.ifcPset.module;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import cn.liujinhang.paper.ifcPset.entity.PropertySetDef;
import cn.liujinhang.paper.ifcPset.module.thread.PsetDefSnatchThread;

public class PsetDefSnatcher {

	private ExecutorService threadPool;

	private List<String> pSetGUID;

	public PsetDefSnatcher(List<String> pSetGUID) {
		this.threadPool = Executors.newFixedThreadPool(50);
		this.pSetGUID = pSetGUID;
	}

	@SuppressWarnings("unchecked")
	public List<Future<PropertySetDef>> launch() {

		List<Future<PropertySetDef>> futures = null;

		try {

			futures = new ArrayList<Future<PropertySetDef>>();

			for (String guid : pSetGUID) {

				PsetDefSnatchThread thread = new PsetDefSnatchThread();
				thread.setGuid(guid);

				Future<PropertySetDef> future = threadPool.submit(thread);
				futures.add(future);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.threadPool.shutdown();
		}

		return futures;

	}
}
