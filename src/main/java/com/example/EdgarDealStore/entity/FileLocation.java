package com.example.EdgarDealStore.entity;

public class FileLocation {
	private String filePath;
	private String dealId;
	
	public FileLocation() {}
	
	public FileLocation(String filePath) {
		this.filePath = filePath;
		this.dealId = "";
	}
	
	public FileLocation(String filePath, String dealId) {
		this.filePath = filePath;
		this.dealId = dealId;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getDealId() {
		return dealId;
	}

	public void setDealId(String dealId) {
		this.dealId = dealId;
	}

	@Override
	public String toString() {
		return "FileLocation [filePath=" + filePath + ", dealId=" + dealId + "]";
	}
	
	
}
