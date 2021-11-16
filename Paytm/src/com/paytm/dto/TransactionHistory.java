package com.paytm.dto;

import java.util.ArrayList;
import java.util.List;

public class TransactionHistory {
	private static List<Transaction> transactions=new ArrayList<Transaction>();;
	
		
	public static List<Transaction> getTransactions() {
		return transactions;
	}


	public void add(String transactionNo,String Name,double amount) {
	
		/*
		 * if(transactions==null) { transactions=new ArrayList<Transaction>(); }
		 */
	Transaction transaction= null;
	transaction=new Transaction();
	
	transaction.setTranstactionNo(transactionNo);
	transaction.setName(Name);
	transaction.setAmount(amount);
	
	transactions.add(transaction);	
	
	}


	


	
	
}
