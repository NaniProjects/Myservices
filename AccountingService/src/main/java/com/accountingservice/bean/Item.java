package com.accountingservice.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Item")
public class Item {

	@Id
	@Column(name="ITEM_ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer itemId;
	
	@Column(name="ITEM_NUM")
	private Integer itemNum;
	
	@Column(name="ITEM_NAME")
	private String itemName;
	
	@Column(name="PRICE")
	private double price;
	
	@Column(name="SALE_PRICE")
	private double salePrice;

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getItemNum() {
		return itemNum;
	}

	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
		
}
