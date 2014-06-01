package cn.liujinhang.paper.ifcPset.system;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

import cn.liujinhang.paper.ifcPset.module.thread.IFCPsetDefinitionPullingResult;

import com.hp.hpl.jena.ontology.OntModel;

public class GobalContext {
	
	public static OntModel IFCOntology;
	
	public static String IFCOntologyNamespace;

	public static List<String> PsetFileLocation = new ArrayList<String>();

	public static List<String> PsetGuid = new ArrayList<String>();

	public static List<Future<IFCPsetDefinitionPullingResult>> IFCPsetDefinitionPullingResults = new ArrayList<Future<IFCPsetDefinitionPullingResult>>();

}
