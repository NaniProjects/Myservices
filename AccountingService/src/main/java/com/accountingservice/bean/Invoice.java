package com.accountingservice.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Invoice")
public class Invoice {

	@Id
	@Column(name = "INVOICE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "INVOICE_NO")
	private Integer invoiceNo;

	@Column(name = "INVOICE_DATE")
	private Date invoice_date;

	@Column(name = "CUSTOMER_ID")
	private Customer customer;

	@Column(name = "GST_PAYABLE")
	private boolean gstPayable;

	@Column(name = "SGST")
	private Integer sgst;

	@Column(name = "CGST")
	private Integer cgst;

	@Column(name = "IGST")
	private Integer igst;

	@Column(name = "DISCOUNT_ALLOW")
	private boolean discountAllowed;

	@Column(name = "TOTAL_AMT")
	private double totalAmt;

	@Column(name = "GRAND_TOTAL")
	private double grandTotal;

	@Column(name = "RECEIPT_AMT")
	private double receiptAmt;

	@Column(name = "BALANCE")
	private double balance;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(Integer invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public Date getInvoice_date() {
		return invoice_date;
	}

	public void setInvoice_date(Date invoice_date) {
		this.invoice_date = invoice_date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public boolean isGstPayable() {
		return gstPayable;
	}

	public void setGstPayable(boolean gstPayable) {
		this.gstPayable = gstPayable;
	}

	public Integer getSgst() {
		return sgst;
	}

	public void setSgst(Integer sgst) {
		this.sgst = sgst;
	}

	public Integer getCgst() {
		return cgst;
	}

	public void setCgst(Integer cgst) {
		this.cgst = cgst;
	}

	public Integer getIgst() {
		return igst;
	}

	public void setIgst(Integer igst) {
		this.igst = igst;
	}

	public boolean isDiscountAllowed() {
		return discountAllowed;
	}

	public void setDiscountAllowed(boolean discountAllowed) {
		this.discountAllowed = discountAllowed;
	}

	public double getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

	public double getReceiptAmt() {
		return receiptAmt;
	}

	public void setReceiptAmt(double receiptAmt) {
		this.receiptAmt = receiptAmt;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
