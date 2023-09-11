package com.esypharma.models;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;

@Document(collation = "purchase")
public class Purchase {
	@Id
	private String id;
	
	private String purchasePONumber;
	
	@NotBlank
	private String billType;
	
	@NotBlank
	private Date purchaseDate;
	
	@NotBlank
	private String supplier;
	
	@NotBlank
	private String billNumber;
	
	
	
	@DBRef
	private List<PurchaseDetails> purchaseDetails;
	
	@NotBlank
	private double netPurchaseAmount;
	
	@NotBlank
	private double totalCgst;
	
	@NotBlank
	private double totalSgst;	
	
	@NotBlank
	private float discountInPercentageOnPurchase;
	
	@NotBlank
	private double discountInAmountOnPurchase;
	
	@NotBlank
	private float roundOfOnBill;
	
	@NotBlank
	private double netPayableAmount;
	
	@NotBlank
	private double paidAmount;
	
	@NotBlank
	private double dueAmount;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPurchasePONumber() {
		return purchasePONumber;
	}

	public void setPurchasePONumber(String purchasePONumber) {
		this.purchasePONumber = purchasePONumber;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	public List<PurchaseDetails> getPurchaseDetails() {
		return purchaseDetails;
	}

	public void setPurchaseDetails(List<PurchaseDetails> purchaseDetails) {
		this.purchaseDetails = purchaseDetails;
	}

	public double getNetPurchaseAmount() {
		return netPurchaseAmount;
	}

	public void setNetPurchaseAmount(double netPurchaseAmount) {
		this.netPurchaseAmount = netPurchaseAmount;
	}

	public double getTotalCgst() {
		return totalCgst;
	}

	public void setTotalCgst(double totalCgst) {
		this.totalCgst = totalCgst;
	}

	public double getTotalSgst() {
		return totalSgst;
	}

	public void setTotalSgst(double totalSgst) {
		this.totalSgst = totalSgst;
	}

	public float getDiscountInPercentageOnPurchase() {
		return discountInPercentageOnPurchase;
	}

	public void setDiscountInPercentageOnPurchase(float discountInPercentageOnPurchase) {
		this.discountInPercentageOnPurchase = discountInPercentageOnPurchase;
	}

	public double getDiscountInAmountOnPurchase() {
		return discountInAmountOnPurchase;
	}

	public void setDiscountInAmountOnPurchase(double discountInAmountOnPurchase) {
		this.discountInAmountOnPurchase = discountInAmountOnPurchase;
	}

	public float getRoundOfOnBill() {
		return roundOfOnBill;
	}

	public void setRoundOfOnBill(float roundOfOnBill) {
		this.roundOfOnBill = roundOfOnBill;
	}

	public double getNetPayableAmount() {
		return netPayableAmount;
	}

	public void setNetPayableAmount(double netPayableAmount) {
		this.netPayableAmount = netPayableAmount;
	}

	public double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}

	public double getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(double dueAmount) {
		this.dueAmount = dueAmount;
	}

	@Override
	public String toString() {
		return "Purchase [id=" + id + ", purchasePONumber=" + purchasePONumber + ", billType=" + billType
				+ ", purchaseDate=" + purchaseDate + ", supplier=" + supplier + ", billNumber=" + billNumber
				+ ", purchaseDetails=" + purchaseDetails + ", netPurchaseAmount=" + netPurchaseAmount + ", totalCgst="
				+ totalCgst + ", totalSgst=" + totalSgst + ", discountInPercentageOnPurchase="
				+ discountInPercentageOnPurchase + ", discountInAmountOnPurchase=" + discountInAmountOnPurchase
				+ ", roundOfOnBill=" + roundOfOnBill + ", netPayableAmount=" + netPayableAmount + ", paidAmount="
				+ paidAmount + ", dueAmount=" + dueAmount + "]";
	}
	
	
	

	
	
	
	
	
}
