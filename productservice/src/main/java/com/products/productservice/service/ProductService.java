package com.products.productservice.service;

import java.util.List;

import com.products.productservice.entity.Product;

public interface ProductService {
	public boolean addProduct(Product product);
	public List<Product> listAllProducts();
	public List<Product> searchProduct(String productName);
	public boolean updProduct(Product product);
	public boolean delProduct(Product product);

	public Product searchProductById(Long prdId);

}
