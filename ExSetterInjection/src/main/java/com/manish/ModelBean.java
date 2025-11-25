package com.manish;

public class ModelBean {
	
	private int modelId;
	private String modelCode;
	private double modelCost;
	private MarginBean mgObj;
	
	// PSM + PGM + toString()
	
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public String getModelCode() {
		return modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	public double getModelCost() {
		return modelCost;
	}
	public void setModelCost(double modelCost) {
		this.modelCost = modelCost;
	}
	public MarginBean getMgObj() {
		return mgObj;
	}
	public void setMgObj(MarginBean mgObj) {
		this.mgObj = mgObj;
	}
	@Override
	public String toString() {
		return "ModelBean [modelId=" + modelId + ", modelCode=" + modelCode + ", modelCost=" + modelCost + ", mgObj="
				+ mgObj + "]";
	}
	
	
	
	

}
