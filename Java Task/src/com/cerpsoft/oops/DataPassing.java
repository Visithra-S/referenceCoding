package com.cerpsoft.oops;

public class DataPassing {

	public static void main(String[] args) {
		PersonalDetails pd = new PersonalDetails();
		pd.setFatherName("Subramanian C");
		pd.setMottherName("Veerammal");
		pd.setMyName("Visithra S");
		
		System.out.println("FatherName is: " + pd.getFatherName());
		System.out.println("MotherName is: " + pd.getMottherName());
		System.out.println("MyName is: " + pd.getMyName());
	}

}
