package com.paytm.api.controller;

import java.util.List;

import com.paytm.dto.Transaction;
import com.paytm.dto.TransactionHistory;

public class PaytmController {
public static void main(String[] args) {
	
	TransactionHistory transactionHistory=new TransactionHistory();
	
	transactionHistory.add("12NC", "manu", 102.0);
	transactionHistory.add("13NC", "sai", 1003.0);
	transactionHistory.add("14NC", "ram", 1025.0);
	
	List<Transaction> tr=transactionHistory.getTransactions();
	System.out.println(tr.size());
	for (int i=0;i<tr.size();i++) {
		System.out.println(tr.get(i));
	}
}
	
}
