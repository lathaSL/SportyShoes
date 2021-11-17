package com.billingservice.billingservice.controller;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.billingservice.billingservice.service.ReportService;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/report")
public class ReportController {
	
	@Autowired
	private ReportService reportService;
	
	@RequestMapping("/getreport")
	public String addNewProduct(@RequestParam  ("stdate") String stdate, 
			@RequestParam  ("enddate") String enddate,
			@RequestParam  ("category") String category, ModelMap model) throws ParseException {
		
		Date stDate = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").parse(stdate);
		Date endDate = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").parse(enddate);

		
		model.addAttribute("invoices", reportService.getReport(stDate,endDate,category));

		
		return "purchasereport";
	}
	@RequestMapping("/genreports")
	public String genreports(){//HttpServletRequest req) {
		
		return "reportsearch";
		
	}
		

	

}
