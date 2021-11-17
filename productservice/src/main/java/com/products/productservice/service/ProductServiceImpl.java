package com.products.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.productservice.dao.ProductDao;
import com.products.productservice.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao productDao;
	
	public boolean addProduct(Product product) {
		
	return productDao.addProduct(product);	
	}
	public List<Product> listAllProducts(){
		return productDao.listAllProducts();
	}
	public List<Product> searchProduct(String productName){
		return productDao.searchProduct(productName);

	}
	public Product searchProductById(Long prdId) {
		return productDao.searchProductById(prdId);
	}

	public boolean updProduct(Product product){
		return productDao.updProduct(product);	

	}

	public boolean delProduct(Product product) {
		return productDao.delProduct(product);	

	}

}
