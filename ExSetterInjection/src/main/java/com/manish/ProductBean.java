package com.manish;

public class ProductBean {
	
	private int proId;
	private String proName;
	private ModelBean modelObj;
	
	// PSM + PGM + toString()
	
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public ModelBean getModelObj() {
		return modelObj;
	}
	public void setModelObj(ModelBean modelObj) {
		this.modelObj = modelObj;
	}
	@Override
	public String toString() {
		return "ProductBean [proId=" + proId + ", proName=" + proName + ", modelObj=" + modelObj + "]";
	}
	
	

}
