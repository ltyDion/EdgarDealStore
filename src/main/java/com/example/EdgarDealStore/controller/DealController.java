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
import com.example.EdgarDealStore.exception.FileException;
import com.example.EdgarDealStore.service.DealService;

@Controller
public class DealController {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	private DealService dealService;
	
	public DealController(DealService dealService) {
		this.dealService = dealService;
	}
	
	// main page
	@GetMapping("/")
	public String hello(Model theModel) {
		theModel.addAttribute("theDate", new java.util.Date());
		
		return "index";
	}

	// create a mapping for "saveFile"
	@GetMapping("/saveFile")
	public String showFormForAdd(Model theModel) {
		FileLocation fileLocation = new FileLocation();
		
		theModel.addAttribute("fileLocation", fileLocation);
		
		return "save-file-form";
	}
	
	@PostMapping("/save")
	public String saveFile(@ModelAttribute("fileLocation") FileLocation fileLocation) throws Exception {
		try{
			double dealId = dealService.saveFile(fileLocation);
			if (fileLocation.getDealId().isEmpty()) {
				dealService.createDealIdFile(fileLocation, dealId);
			}
			return "redirect:/";
		} catch (Exception e) {
			throw e;
		}
		
	}
	
	@GetMapping("/getMaxID")
	public String showMaxIdPage(Model model) {
		String rowData = dealService.getRowWithMaxID();
		model.addAttribute("maxIDRowData", rowData);
		return "max-deal-id";
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
	
	// create a mapping for "saveFolder"
}
