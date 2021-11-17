package com.billingservice.billingservice.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.billingservice.billingservice.entity.Invoice;


@Repository

public interface ReportRepository extends JpaRepository<Invoice,Long>{

	@Query("select inv from Invoice inv "
			+ "join Product prd on inv.product=prd.productId"
			+ " where prd.category=?3 and inv.invoDate  between  ?1 and ?2")// and prd.category=?3"
			
	 Optional<List<Invoice>> findByDateandCategory(Date stdate, Date enddate, String category);
	
}
