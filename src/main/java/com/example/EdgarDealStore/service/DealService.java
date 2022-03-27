package com.example.EdgarDealStore.service;

import com.example.EdgarDealStore.entity.FileLocation;
import com.example.EdgarDealStore.entity.FolderLocation;

public interface DealService {
	public double saveFile(FileLocation fileLocation) throws Exception;
	
	public void createDealIdFile(FileLocation fileLocation, double dealId) throws Exception;
	
	public String getRowWithMaxID();
	/*
	public void saveFolder(FolderLocation folderLocation);
	*/
}
