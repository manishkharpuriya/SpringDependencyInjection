package com.manish;

public class MarginBean {
	
	private int mrgId;
	private String mrgCode;
	
	// PSM + PGM + toString()
	
	public int getMrgId() {
		return mrgId;
	}
	public void setMrgId(int mrgId) {
		this.mrgId = mrgId;
	}
	public String getMrgCode() {
		return mrgCode;
	}
	public void setMrgCode(String mrgCode) {
		this.mrgCode = mrgCode;
	}
	@Override
	public String toString() {
		return "ModelBean [mrgId=" + mrgId + ", mrgCode=" + mrgCode + "]";
	}

}
