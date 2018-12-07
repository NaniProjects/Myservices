package com.accountingservice.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {

	@Id
	@Column(name="CUST_ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer customerId;
	
	@Column(name="CUST_NAME")
	private String name;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="CONTACT_NO")
	private String contractNo;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="GST_NO")
	private String gstNo;
	
	@Column(name="AADHAR_NO")
	private String aadharCardNo;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getAadharCardNo() {
		return aadharCardNo;
	}

	public void setAadharCardNo(String aadharCardNo) {
		this.aadharCardNo = aadharCardNo;
	}
	
}
