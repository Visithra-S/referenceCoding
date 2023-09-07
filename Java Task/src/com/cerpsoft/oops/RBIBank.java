package com.cerpsoft.oops;

abstract class RBIBank {
	
	public abstract int BankId();
	
    final String bankName = "RBI";
	
	public void debit() {
		System.out.println("Amount-debit");
	}
	
	public void credit() {
		System.out.println("Amount-credit");
	}
}
