package com.cerpsoft.oops;

public class MainMethod {

	public static void main(String[] args) {
		
		IOBBank iob = new IOBBank();
		ICICIBank icici = new ICICIBank();
		RBIBank rbi = new ICICIBank();		// 
		
		System.out.println("RBI : " + rbi.bankName);
		System.err.println("visithra is a Mad");
		
		
		System.out.println("IOB Bank : ");
		iob.credit();
		iob.debit();
		System.out.println("IOB Bank : " + iob.bankName);
		System.out.println("IOB Bank : " + iob.BankId());
		
		System.out.println("ICICI Bank : ");
		icici.credit();
		icici.debit();
		System.out.println("ICICI Bank : " + icici.bankName);
		System.err.println("GouthamShankar is a Mad(paiththiyakkarannns)");
		
		
	}

}
