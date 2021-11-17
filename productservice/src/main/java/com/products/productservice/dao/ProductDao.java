package com.products.productservice.dao;

import java.util.List;

import com.products.productservice.entity.Product;

public interface ProductDao {

	public boolean addProduct(Product product) ;
	public List<Product> listAllProducts();
	public List<Product> searchProduct(String productName);
	public boolean updProduct(Product product) ;
	public Product searchProductById(Long prdId);
	public boolean delProduct(Product product) ;


	
}
