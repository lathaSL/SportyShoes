package com.products.productservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.products.productservice.entity.Product;
import com.products.productservice.exception.ProductNotFoundException;
import com.products.productservice.repository.ProductRepository;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	ProductRepository productRepository;
	@Override
	public boolean addProduct(Product product) {
			productRepository.save(product);
			return true;
		}
	public List<Product> listAllProducts(){
		
		return productRepository.findAll();
	}
	public List<Product> searchProduct(String productName){
		return productRepository.findAllByProductName(productName);

	}
	@Override
	public boolean updProduct(Product product) {
		 Product productFromDb = productRepository.findById(product.getProductId()).orElseThrow(() -> 
			new ProductNotFoundException());

		 productFromDb.setProductName(product.getProductName()); 
		 productFromDb.setCategory(product.getCategory());
		    productFromDb.setSize(product.getSize());
		    productFromDb.setPrice(product.getPrice());

			productRepository.save(productFromDb);
			return true;
		}
	@Override
	public Product searchProductById(Long prdId){
		return productRepository.findById(prdId).orElseThrow(() -> 
		new ProductNotFoundException());

	}
	@Override
	public boolean delProduct(Product product) {
			productRepository.delete(product);
			return true;
		}
}
