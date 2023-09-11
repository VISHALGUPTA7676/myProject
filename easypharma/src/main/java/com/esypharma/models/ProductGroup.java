package com.esypharma.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Document(collection = "product_group")
public class ProductGroup {

	@Id
	private String id;
	
	@NotBlank
	@Size(max = 30)
	private String groupName;
	
	@NotBlank
	private boolean status;
	
	@NotBlank
	@Size(max = 24)
	private String userId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
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
		return "ProductGroup [id=" + id + ", groupName=" + groupName + ", status=" + status + ", userId=" + userId
				+ "]";
	}
	
	
}
