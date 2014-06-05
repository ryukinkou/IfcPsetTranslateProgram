package cn.liujinhang.paper.ifcPset.system;

public class Constant {

	public static final String PREDICATE_PERFIX = "has";

	public static final String BSDD_BASE_URL = "http://bsdd.catenda.com/api/4.0";

	public static final String PSET_DEFINITION_FILE_PATH = System
			.getProperty("user.dir") + "/psd/PSD_IFC4_TC1_LOCAL.xsd";

	public static final String PSET_FILE_DIR_URL = "http://www.buildingsmart-tech.org/ifc/IFC4/final/html/psd";

	public static final String PSET_BROWSE_VIEW_URL = "http://bsdd.catenda.com/templates/BrowseView.html";

	public static final String INPUT_IFC_OWL_FILE_PATH = "/Users/RYU/git/IfcPsetDefinitionTranslateProgram/psd/ifcOWL_phase_2.owl";

	public static final String OUTPUT_IFC_OWL_FILE_PATH = System
			.getProperty("user.dir") + "/ifcPset/ifcOWL_phase_3.owl";

	public static final String CACHED_BROWSE_VIEW_FILE_PATH = System
			.getProperty("user.dir") + "/cache/BrowseView.html";

	public static final String CACHED_FILE_DIR_PATH = System
			.getProperty("user.dir") + "/cache/";

}
