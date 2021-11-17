package com.products.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.products.productservice.entity.Product;
import com.products.productservice.service.ProductService;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/addnewproduct")
	public String addNewProduct(@ModelAttribute ("product") Product product) {
		String viewName;
		if (productService.addProduct(product)) {
			viewName="addproduct";
			
		}
		else {
			viewName="addfailure";

		}
		return viewName;
		
		
	}
	
		@RequestMapping("/addproduct")
	public String addProduct() {
				return "addproduct";
		
		
	}
	
	@RequestMapping("/listproducts")
	public String listProducts(ModelMap model) {
			model.addAttribute("products", productService.listAllProducts());

				return "listproduct";
		
		
	}
	
	@RequestMapping("/searchproduct")
	public String searchProducts() {

				return "searchproduct";
		
		
	}
	@RequestMapping("/searchprd")
	public String searchprodcutResult(@RequestParam ("productName") String productName,ModelMap model) {
		model.addAttribute("products", productService.searchProduct(productName));

				return "listproduct";
		
		
	}
	@RequestMapping("/delproduct")
	public String deleteProduct() {

				return "searchproduct";
		
		
	}
	@RequestMapping("/updproduct")
	public String updateProduct() {

				return "searchproduct";
		
		
	}
	@RequestMapping("/productupdate")
	public String updateProduct(@RequestParam("productId") Long productId,ModelMap model) {
		model.addAttribute("product", productService.searchProductById(productId));

				return "updproductlist";
		
		
	}
	

	@RequestMapping("/updateproduct")
	public String productupdate(@ModelAttribute ("product") Product product) {
		String viewName;
		if (productService.updProduct(product)) {
			viewName="updproduct";
			
		}
		else {
			viewName="addfailure";

		}
		return viewName;
		
		
	}

	
	@RequestMapping("/productdelete")
	public String productdelete(@ModelAttribute ("product") Product product) {
		String viewName;
		if (productService.delProduct(product)) {
			viewName="delproduct";
			
		}
		else {
			viewName="addfailure";

		}
		return viewName;
		
		
	}

	

}
