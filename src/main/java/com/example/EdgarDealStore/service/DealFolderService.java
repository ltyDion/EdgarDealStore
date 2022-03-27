package com.example.EdgarDealStore.service;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.EdgarDealStore.entity.FileLocation;
import com.example.EdgarDealStore.entity.FolderLocation;
import com.example.EdgarDealStore.exception.DataException;
import com.example.EdgarDealStore.service.*;

@Service
public class DealFolderService {
	protected Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	DealService dealService;
	
	public DealFolderService(DealService dealService) {
		this.dealService = dealService;
	}
	
	public void saveFolder(FolderLocation folderLocation) throws Exception{
		File folder = new File(folderLocation.getFolderPath());
		if (folder.isDirectory()) {
			List<String> fileNameList = new ArrayList<>();
			File[] fileList = folder.listFiles((File pathname) -> pathname.getName().endsWith(".json"));
			for (int i = 0; i < fileList.length; i++) {
				logger.info(fileList[i].getPath());
				if (fileList[i].isFile()) {
					fileNameList.add(fileList[i].getName());
				}
			}
			
			if (!fileNameList.contains("dealLevel.json")) {
				throw new DataException("There is no deal level file in the folder.");
			}
			Arrays.sort(fileList, new Comparator<File>() {
				@Override
				public int compare(File f1, File f2) {
					return f1.getPath().compareTo(f2.getPath());
				}
			});
			
			// save the deal level file
			FileLocation fileLocation = new FileLocation(fileList[fileList.length-1].getPath());
			logger.info("Saving deal level file in folder.");
			double dealId = 0;
			dealId = dealService.saveFile(fileLocation);
			// dealService.createDealIdFile(fileLocation, dealId);
			
			// save the non deal level file
			logger.info("Saving non-deal level file in folder");
			for (int i = 0; i < fileList.length - 1; ++i) {
				logger.info("saving " + fileList[i].getPath());
				fileLocation = new FileLocation(fileList[i].getPath(),Double.toString(dealId));
				dealService.saveFile(fileLocation);
			}
		} else {
			throw new DataException("This is not the path of a folder.");
		}
	}
}
