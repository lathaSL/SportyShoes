package com.billingservice.billingservice.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billingservice.billingservice.dao.ReportDao;
import com.billingservice.billingservice.entity.Invoice;

@Service
public class ReportServiceImpl implements ReportService {
	@Autowired
	ReportDao reportDao;
	@Override
	public List<Invoice> getReport(Date stdate, Date enddate, String category) {
		// TODO Auto-generated method stub
		return reportDao.getReport(stdate,enddate,category);
	}

}
