package com.esypharma.models;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Document(collection = "users")
public class User {
	@Id
	private String id;

	@NotBlank
	@Size(max = 20)
	private String username;

	@NotBlank
	@Size(max = 50)
	@Email
	private String email;

	@NotBlank
	@Size(max = 500)
	private String storeName;

	@NotBlank
	@Size(max = 50)
	private String storeEmail;

	@NotBlank
	@Size(max = 3)
	private String countryCode;

	@NotBlank
	@Size(min = 10)
	@Size(max = 10)
	private String contectNumber;

	@NotBlank
	@Size(min = 10)
	private String storeGST;

	@NotBlank
	@Size(max = 50)
	private String houseAddress;

	@NotBlank
	@Size(max = 40)
	private String state;

	@NotBlank
	@Size(max = 10)
	private String country;

	@NotBlank
	@Size(min = 6)
	@Size(max = 6)
	private String areaPinCode;

	@NotBlank
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date registerDate = new Date();

	@NotBlank
	@Size(max = 120)
	private String password;

	@DBRef
	private Set<Role> roles = new HashSet<>();

	public User() {
	}

	public User(String username, String email, String storeName, String storeEmail, String countryCode,
			String contectNumber, String storeGST, String houseAddress, String state, String country,
			String areaPinCode, String password) {
		this.username = username;
		this.email = email;
		this.storeName = storeName;
		this.storeEmail = storeEmail;
		this.countryCode = countryCode;
		this.contectNumber = contectNumber;
		this.storeGST = storeGST;
		this.houseAddress = houseAddress;
		this.state = state;
		this.country = country;
		this.areaPinCode = areaPinCode;
		
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}
	

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreEmail() {
		return storeEmail;
	}

	public void setStoreEmail(String storeEmail) {
		this.storeEmail = storeEmail;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getContectNumber() {
		return contectNumber;
	}

	public void setContectNumber(String contectNumber) {
		this.contectNumber = contectNumber;
	}

	public String getStoreGST() {
		return storeGST;
	}

	public void setStoreGST(String storeGST) {
		this.storeGST = storeGST;
	}

	public String getHouseAddress() {
		return houseAddress;
	}

	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAreaPinCode() {
		return areaPinCode;
	}

	public void setAreaPinCode(String areaPinCode) {
		this.areaPinCode = areaPinCode;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", storeName=" + storeName
				+ ", storeEmail=" + storeEmail + ", countryCode=" + countryCode + ", contectNumber=" + contectNumber
				+ ", storeGST=" + storeGST + ", houseAddress=" + houseAddress + ", state=" + state + ", country="
				+ country + ", areaPinCode=" + areaPinCode + ", registerDate=" + registerDate + ", password=" + password
				+ ", roles=" + roles + "]";
	}
	
}
