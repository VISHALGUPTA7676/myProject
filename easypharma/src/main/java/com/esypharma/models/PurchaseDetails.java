package com.esypharma.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;

@Document(collection = "purchaseDetails")
public class PurchaseDetails {
	
	@Id
	private String id;
	
	@NotBlank
	private String productName;
	
	private String productHSNCode;
	
	private String productBatch;
	
	@NotBlank
	private String expiryDate;
	
	@NotBlank
	private int productPackaging;
	
	@NotBlank
	private int productQuantity;
	
	private int productFreeQuantity;
	
	@NotBlank
	private double productMRP;
	
	@NotBlank
	private double productPurchaseRate;
	
	private int productDiscount;
	
	@NotBlank
	private double productBaseAmount;
	
	@NotBlank
	private float productCGST;
	
	@NotBlank
	private double cGSTInAmount;
	
	@NotBlank
	private float productSGST; 
	
	@NotBlank
	private double sGSTInAmount;
	
	@NotBlank
	private double productTotalAmtWithGST;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductHSNCode() {
		return productHSNCode;
	}

	public void setProductHSNCode(String productHSNCode) {
		this.productHSNCode = productHSNCode;
	}

	public String getProductBatch() {
		return productBatch;
	}

	public void setProductBatch(String productBatch) {
		this.productBatch = productBatch;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getProductPackaging() {
		return productPackaging;
	}

	public void setProductPackaging(int productPackaging) {
		this.productPackaging = productPackaging;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public int getProductFreeQuantity() {
		return productFreeQuantity;
	}

	public void setProductFreeQuantity(int productFreeQuantity) {
		this.productFreeQuantity = productFreeQuantity;
	}

	public double getProductMRP() {
		return productMRP;
	}

	public void setProductMRP(double productMRP) {
		this.productMRP = productMRP;
	}

	public double getProductPurchaseRate() {
		return productPurchaseRate;
	}

	public void setProductPurchaseRate(double productPurchaseRate) {
		this.productPurchaseRate = productPurchaseRate;
	}

	public int getProductDiscount() {
		return productDiscount;
	}

	public void setProductDiscount(int productDiscount) {
		this.productDiscount = productDiscount;
	}

	public double getProductBaseAmount() {
		return productBaseAmount;
	}

	public void setProductBaseAmount(double productBaseAmount) {
		this.productBaseAmount = productBaseAmount;
	}

	public float getProductCGST() {
		return productCGST;
	}

	public void setProductCGST(float productCGST) {
		this.productCGST = productCGST;
	}

	public double getcGSTInAmount() {
		return cGSTInAmount;
	}

	public void setcGSTInAmount(double cGSTInAmount) {
		this.cGSTInAmount = cGSTInAmount;
	}

	public float getProductSGST() {
		return productSGST;
	}

	public void setProductSGST(float productSGST) {
		this.productSGST = productSGST;
	}

	public double getsGSTInAmount() {
		return sGSTInAmount;
	}

	public void setsGSTInAmount(double sGSTInAmount) {
		this.sGSTInAmount = sGSTInAmount;
	}

	public double getProductTotalAmtWithGST() {
		return productTotalAmtWithGST;
	}

	public void setProductTotalAmtWithGST(double productTotalAmtWithGST) {
		this.productTotalAmtWithGST = productTotalAmtWithGST;
	}

	@Override
	public String toString() {
		return "PurchaseDetails [id=" + id + ", productName=" + productName + ", productHSNCode=" + productHSNCode
				+ ", productBatch=" + productBatch + ", expiryDate=" + expiryDate + ", productPackaging="
				+ productPackaging + ", productQuantity=" + productQuantity + ", productFreeQuantity="
				+ productFreeQuantity + ", productMRP=" + productMRP + ", productPurchaseRate=" + productPurchaseRate
				+ ", productDiscount=" + productDiscount + ", productBaseAmount=" + productBaseAmount + ", productCGST="
				+ productCGST + ", cGSTInAmount=" + cGSTInAmount + ", productSGST=" + productSGST + ", sGSTInAmount="
				+ sGSTInAmount + ", productTotalAmtWithGST=" + productTotalAmtWithGST + "]";
	}
	
	
	
	
	
	
	

}
