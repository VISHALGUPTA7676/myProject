package com.esypharma.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Document(collection = "product")
public class Product {

	@Id
	private String id;
	
	@NotBlank
	@Size(max = 25)
	private String productName;
	
	@Size(max =100)
	private String productDescription;
	
	@NotBlank
	private String productGroup;
	
	@NotBlank
	private String productCategory;
	
	@NotBlank
	private String productManufacturer;
	
	
	private int setMinProductQuantity;
	
	
	private int setMaxProductQuantity;
	
	
	@NotBlank
	private int productPackaging;
	
	private String productHSNCode;
	
	
	private float productCGST;
	
	private float productSGST;
	
	private int productStoreRackNumber;
	
	private String productGenericCode;
	
	private boolean productStatus;
	
	@Size(max = 24)
	@NotBlank
	private String userId;
	
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

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductGroup() {
		return productGroup;
	}

	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}

	public int getSetMinProductQuantity() {
		return setMinProductQuantity;
	}

	public void setSetMinProductQuantity(int setMinProductQuantity) {
		this.setMinProductQuantity = setMinProductQuantity;
	}

	public int getSetMaxProductQuantity() {
		return setMaxProductQuantity;
	}

	public void setSetMaxProductQuantity(int setMaxProductQuantity) {
		this.setMaxProductQuantity = setMaxProductQuantity;
	}

	public int getProductPackaging() {
		return productPackaging;
	}

	public void setProductPackaging(int productPackaging) {
		this.productPackaging = productPackaging;
	}

	public String getProductHSNCode() {
		return productHSNCode;
	}

	public void setProductHSNCode(String productHSNCode) {
		this.productHSNCode = productHSNCode;
	}

	 

	public float getProductCGST() {
		return productCGST;
	}

	public void setProductCGST(float productCGST) {
		this.productCGST = productCGST;
	}

	public float getProductSGST() {
		return productSGST;
	}

	public void setProductSGST(float productSGST) {
		this.productSGST = productSGST;
	}

	public int getProductStoreRackNumber() {
		return productStoreRackNumber;
	}

	public void setProductStoreRackNumber(int productStoreRackNumber) {
		this.productStoreRackNumber = productStoreRackNumber;
	}

	public String getProductGenericCode() {
		return productGenericCode;
	}

	public void setProductGenericCode(String productGenericCode) {
		this.productGenericCode = productGenericCode;
	}

	public boolean isProductStatus() {
		return productStatus;
	}

	public void setProductStatus(boolean productStatus) {
		this.productStatus = productStatus;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productDescription=" + productDescription
				+ ", productGroup=" + productGroup + ", productCategory=" + productCategory + ", productManufacturer="
				+ productManufacturer + ", setMinProductQuantity=" + setMinProductQuantity + ", setMaxProductQuantity="
				+ setMaxProductQuantity + ", productPackaging=" + productPackaging + ", productHSNCode="
				+ productHSNCode + ", productCGST=" + productCGST + ", productSGST=" + productSGST
				+ ", productStoreRackNumber=" + productStoreRackNumber + ", productGenericCode=" + productGenericCode
				+ ", productStatus=" + productStatus + ", userId=" + userId + ", getId()=" + getId()
				+ ", getProductName()=" + getProductName() + ", getProductDescription()=" + getProductDescription()
				+ ", getProductGroup()=" + getProductGroup() + ", getProductCategory()=" + getProductCategory()
				+ ", getProductManufacturer()=" + getProductManufacturer() + ", getSetMinProductQuantity()="
				+ getSetMinProductQuantity() + ", getSetMaxProductQuantity()=" + getSetMaxProductQuantity()
				+ ", getProductPackaging()=" + getProductPackaging() + ", getProductHSNCode()=" + getProductHSNCode()
				+ ", getProductCGST()=" + getProductCGST() + ", getProductSGST()=" + getProductSGST()
				+ ", getProductStoreRackNumber()=" + getProductStoreRackNumber() + ", getProductGenericCode()="
				+ getProductGenericCode() + ", isProductStatus()=" + isProductStatus() + ", getUserId()=" + getUserId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	
	
	
	
	
}
