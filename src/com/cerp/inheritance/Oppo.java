package com.cerp.inheritance;

public class Oppo extends MobileGovIndia{
	
	private String battary;

	public void newMobileLunch() {

		MobileGovIndia oppo1 = new Oppo();
		oppo1.setCam("16");
		oppo1.setImeiNo("9876543210");
		oppo1.setRam("2");
		oppo1.setRom("1");
		oppo1.setTureFiveG(true);

		System.out.println(oppo1);
	}

	public void newMobileLunchOne() {

		MobileGovIndia oppo1 = new Oppo();
		oppo1.setCam("32");
		oppo1.setImeiNo("0000000024");
		oppo1.setRam("4");
		oppo1.setRom("2");
		oppo1.setTureFiveG(false);

		System.out.println(oppo1);
	}

	public String getBattary() {
		return battary;
	}

	public void setBattary(String battary) {
		this.battary = battary;
	}
}
