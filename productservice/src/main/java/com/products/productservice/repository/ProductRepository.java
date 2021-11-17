package com.products.productservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.productservice.entity.Product;

@Repository

public interface ProductRepository extends JpaRepository<Product,Long>{
	
	List<Product> findAllByProductName(String productName);


}
