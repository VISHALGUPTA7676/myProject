package com.esypharma.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Document(collection = "paymentType")
public class PaymentTypes {
	@Id
	private String id;
	
	@NotBlank
	private String paymentMode;
	
	@Size(max = 24)
	@NotBlank
	private String userId;
	

}
