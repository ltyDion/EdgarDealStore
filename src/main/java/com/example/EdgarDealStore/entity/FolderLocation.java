package com.example.EdgarDealStore.entity;

public class FolderLocation {
	private String folderPath;
	private String dealId;
	
	public String getFolderPath() {
		return folderPath;
	}
	
	public void setFolderPath(String folderPath) {
		this.folderPath = folderPath;
	}
	
	public String getDealId() {
		return dealId;
	}
	
	public void setDealId(String dealId) {
		this.dealId = dealId;
	}
	
	public FolderLocation(String folderPath, String dealId) {
		super();
		this.folderPath = folderPath;
		this.dealId = dealId;
	}
	
	public FolderLocation() {}
	
	@Override
	public String toString() {
		return "FolderLocation [folderPath=" + folderPath + ", dealId=" + dealId + "]";
	}
	
	
}
