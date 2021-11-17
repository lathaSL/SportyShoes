package com.billingservice.billingservice.service;

import java.util.Date;
import java.util.List;

import com.billingservice.billingservice.entity.Invoice;

public interface ReportService {

	public List<Invoice> getReport(Date stdate,Date enddate,String category);
}
