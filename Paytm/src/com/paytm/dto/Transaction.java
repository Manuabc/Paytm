package com.paytm.dto;

public class Transaction {
	
	private String transtactionNo;
	private String name;
	private double amount;
	
	
	public String getTranstactionNo() {
		return transtactionNo;
	}
	public void setTranstactionNo(String transtactionNo) {
		this.transtactionNo = transtactionNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String toString() {
		return "Transaction [transtactionNo=" + transtactionNo + ", name=" + name + ", amount=" + amount + "]";
	}
	
	
	

}
