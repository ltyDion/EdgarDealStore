package com.example.EdgarDealStore.controller;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.EdgarDealStore.entity.FileLocation;
import com.example.EdgarDealStore.entity.FolderLocation;
import com.example.EdgarDealStore.exception.FileException;
import com.example.EdgarDealStore.service.DealFolderService;
import com.example.EdgarDealStore.service.DealService;

@Controller
public class DealFolderController {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	private DealFolderService dealFolderService;
	
	public DealFolderController(DealFolderService dealFolderService) {
		this.dealFolderService = dealFolderService;
	}
	
	@GetMapping("/saveFolder")
	public String showFolderFormForAdd(Model theModel) {
		FolderLocation folderLocation = new FolderLocation();
		theModel.addAttribute("folderLocation", folderLocation);
		return "save-folder-form";
	}
	
	@PostMapping("/saveFolderAction")
	public String saveFolder(@ModelAttribute("folderLocation") FolderLocation folderLocation) throws Exception {
		try{
			dealFolderService.saveFolder(folderLocation);
			return "redirect:/";
		} catch (Exception e) {
			throw e;
		}
	}
	
	@ExceptionHandler(Exception.class)
    public ModelAndView handleError(HttpServletRequest req, Exception ex) {
        logger.error("Request: " + req.getRequestURL() + " raised " + ex);

        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", ex);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("error-page");
        return mav;
	}
	
	
}
