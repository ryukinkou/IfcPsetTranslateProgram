package cn.liujinhang.paper.ifcPset.module.thread;

import cn.liujinhang.paper.ifcPset.entity.PropertySetDef;

public class IFCPsetDefinitionPullingResult {

	private String guid;

	private boolean isSucceed;

	private PropertySetDef propertySetDef;

	private Exception exception;

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public boolean isSucceed() {
		return isSucceed;
	}

	public void setSucceed(boolean isSucceed) {
		this.isSucceed = isSucceed;
	}

	public PropertySetDef getPropertySetDef() {
		return propertySetDef;
	}

	public void setPropertySetDef(PropertySetDef propertySetDef) {
		this.propertySetDef = propertySetDef;
	}

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}

}
