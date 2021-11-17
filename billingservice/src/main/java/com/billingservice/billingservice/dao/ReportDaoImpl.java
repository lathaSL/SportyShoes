package com.billingservice.billingservice.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.billingservice.billingservice.entity.Invoice;
import com.billingservice.billingservice.exception.ReportNotFoundException;
import com.billingservice.billingservice.repository.ReportRepository;
@Repository
public class ReportDaoImpl implements ReportDao {
	
	@Autowired
	ReportRepository reportRepository;
	@Override
	public List<Invoice> getReport(Date stdate, Date enddate, String category) {
		// TODO Auto-generated method stub

		
		return reportRepository.findByDateandCategory(stdate,enddate,category).orElseThrow(() -> 
		new ReportNotFoundException());
	}
}
