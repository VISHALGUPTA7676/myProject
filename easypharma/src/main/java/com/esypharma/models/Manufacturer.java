package com.esypharma.models;

import java.beans.JavaBean; 

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Document(collection = "manufacturer")
@JavaBean
public class Manufacturer {
	
	@Id
	private String id;
	
	@NotBlank
	@Size(max = 30)
	private String manufacturerName;

	@NotBlank
	private boolean status;
	
	@Size(max = 24)
	@NotBlank
	private String userId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	
	@Override
	public String toString() {
		return "Manufacturer [id=" + id + ", manufacturerName=" + manufacturerName + ", status=" + status + ", userId="
				+ userId + "]";
	}
	
	
}
