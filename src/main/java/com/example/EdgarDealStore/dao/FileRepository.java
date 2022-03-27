package com.example.EdgarDealStore.dao;

import org.springframework.stereotype.Repository;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.example.EdgarDealStore.entity.FileLocation;
import com.example.EdgarDealStore.exception.FileException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class FileRepository{
	public FileRepository() {}
	
	public Map<?, ?> readData(FileLocation fileLocation) throws Exception {
		System.out.println(fileLocation.toString());
		
		if (fileLocation.getDealId().length() > 0) {
			// insert non-deal level file
			return readDealFile(fileLocation.getFilePath());
		} else {
			return readDealFile(fileLocation.getFilePath());
		}
		
	} 
	
	public Map<?, ?> readDealFile(String filePath) throws Exception{
		try {
			ObjectMapper mapper = new ObjectMapper();
			Map<?, ?> map = mapper.readValue(Paths.get(filePath).toFile(), Map.class);
			
			for (Map.Entry<?, ?> entry : map.entrySet()) {
				System.out.println(entry.getKey() + "=" + entry.getValue());
			}
			
			return map;
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new FileException(ex.getMessage());
		}
	}
}
