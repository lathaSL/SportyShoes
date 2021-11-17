package com.billingservice.billingservice.dao;

import java.util.Date;
import java.util.List;

import com.billingservice.billingservice.entity.Invoice;
import  org.springframework.stereotype.Repository;

public interface ReportDao {
	public List<Invoice> getReport(Date stdate,Date enddate,String category);

}
