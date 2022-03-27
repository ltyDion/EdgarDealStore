package com.example.EdgarDealStore.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.EdgarDealStore.entity.FileLocation;

@Repository
public class FolderRepository {
	
	@Autowired
	private FileRepository fileRepo;
	
	public FolderRepository() {}
	
	public Map<?, ?> readFile(FileLocation fileLoc) throws Exception {
		return fileRepo.readData(fileLoc);
	}
}
