package com.esypharma.payload.request;

import java.util.Set;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class SignupRequest {

	@NotBlank
	@Size(min = 3, max = 20)
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
	@Size(max = 50)
	private String state;

	@NotBlank
	@Size(max = 10)
	private String country;

	@NotBlank
	@Size(min = 6)
	@Size(max = 6)
	private String areaPinCode;

	/*
	 * @NotBlank
	 * 
	 * @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) private Date registerDate =
	 * new Date();
	 */

	private Set<String> roles;

	@NotBlank
	@Size(min = 6, max = 40)
	private String password;

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

	public Set<String> getRoles() {
		return this.roles;
	}

	public void setRole(Set<String> roles) {
		this.roles = roles;
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

	/*
	 * public Date getRegisterDate() { return registerDate; }
	 * 
	 * public void setRegisterDate(Date registerDate) { this.registerDate =
	 * registerDate; }
	 */

	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}

}
