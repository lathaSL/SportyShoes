package com.billingservice.billingservice.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import com.billingservice.billingservice.entity.Product;
import com.billingservice.billingservice.entity.User;


@Entity
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long invoLineId;
	private String invoiceNo;
	private Date invoDate;
	private int quantity;
	private double price;
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

            
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="productId")
	private Product product;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userId")
	private User user;

	
	public Invoice() {
		super();
	}
	

	public Long getInvoLineId() {
		return invoLineId;
	}


	public void setInvoLineId(Long invoLineId) {
		this.invoLineId = invoLineId;
	}




	public String getInvoiceNo() {
		return invoiceNo;
	}




	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}




	public Date getInvoDate() {
		return invoDate;
	}




	public void setInvoDate(Date invoDate) {
		this.invoDate = invoDate;
	}




	public Product getProduct() {
		return product;
	}




	public void setProduct(Product product) {
		this.product = product;
	}




	public User getUser() {
		return user;
	}


	public String getUserName() {
		return user.getUserName();
	}


	public String getProductName() {
		return product.getProductName();
	}

	public String getEmail() {
		return user.getEmail();
	}

	public String getContactNo() {
		return user.getContactNo();
	}

	public int getSize() {
		return product.getSize();
	}


	public void setUser(User user) {
		this.user = user;
	}

	public Invoice(String invoiceNo, Date invoDate, int quantity, double price, Product product, User user) {
		super();
		this.invoiceNo = invoiceNo;
		this.invoDate = invoDate;
		this.quantity = quantity;
		this.price = price;
		this.product = product;
		this.user = user;
	}

	public Invoice(Long invoLineId, String invoiceNo, Date invoDate, int quantity, double price, Product product,
			User user) {
		super();
		this.invoLineId = invoLineId;
		this.invoiceNo = invoiceNo;
		this.invoDate = invoDate;
		this.quantity = quantity;
		this.price = price;
		this.product = product;
		this.user = user;
	}

	
}
