package com.incubator.inventory.entity;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "product")

public class Product {
	
	private String productName;
	private String productId;
	private Double productBuyingPrice;
	private Double productSellingPrice;
	private Double productMRP;
	private Double productVAT;
	private Integer productQuantity;
	private String productType;
	
	
	
	
	public Product() {
		
	}
	public Product(String productName, String productId, Double productBuyingPrice, Double productSellingPrice,
			Double productMRP, Double productVAT, Integer productQuantity, String productType) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.productBuyingPrice = productBuyingPrice;
		this.productSellingPrice = productSellingPrice;
		this.productMRP = productMRP;
		this.productVAT = productVAT;
		this.productQuantity = productQuantity;
		this.productType = productType;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Double getProductBuyingPrice() {
		return productBuyingPrice;
	}
	public void setProductBuyingPrice(Double productBuyingPrice) {
		this.productBuyingPrice = productBuyingPrice;
	}
	public Double getProductSellingPrice() {
		return productSellingPrice;
	}
	public void setProductSellingPrice(Double productSellingPrice) {
		this.productSellingPrice = productSellingPrice;
	}
	public Double getProductMRP() {
		return productMRP;
	}
	public void setProductMRP(Double productMRP) {
		this.productMRP = productMRP;
	}
	public Double getProductVAT() {
		return productVAT;
	}
	public void setProductVAT(Double productVAT) {
		this.productVAT = productVAT;
	}
	public Integer getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productId=" + productId + ", productBuyingPrice="
				+ productBuyingPrice + ", productSellingPrice=" + productSellingPrice + ", productMRP=" + productMRP
				+ ", productVAT=" + productVAT + ", productQuantity=" + productQuantity + ", productType=" + productType
				+ "]";
	} 
	
	
	
	
	

}
