package org.liujinhang.paper.ifcPset.system;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

import org.liujinhang.paper.ifcPset.module.thread.IFCPsetDefinitionPullingResult;

public class GobalContext {

	public static List<String> PsetFileLocation = new ArrayList<String>();

	public static List<String> PsetGuid = new ArrayList<String>();

	public static List<Future<IFCPsetDefinitionPullingResult>> IFCPsetDefinitionPullingResults = new ArrayList<Future<IFCPsetDefinitionPullingResult>>();

}
