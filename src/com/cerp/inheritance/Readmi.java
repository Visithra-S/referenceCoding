package com.cerp.inheritance;

public class Readmi extends MobileGovIndia{
	
	private String audioJuck;
	
	public void newMobileLunch() {

		MobileGovIndia readmi = new Readmi();
		readmi.setCam("32");
		readmi.setImeiNo("redmi321");
		readmi.setRam("2");
		readmi.setRom("1");
		readmi.setTureFiveG(false);

		System.out.println(readmi);
	}
	
	public void newMobileLunchOne() {

		MobileGovIndia readmi = new Readmi();
		readmi.setCam("62");
		readmi.setImeiNo("redmi987");
		readmi.setRam("4");
		readmi.setRom("2");
		readmi.setTureFiveG(true);

		System.out.println(readmi);
	}
	
	public void newMobileLunchTwo() {

		Realme readmi = new Realme();
		readmi.setCam("64");
		readmi.setImeiNo("mihibrid987");
		readmi.setRam("6");
		readmi.setRom("4");
		readmi.setTureFiveG(true);
		readmi.setPopUPCam(true);
		///readmi.setBattary("5000mah");

		System.out.println( readmi);
		System.out.println( readmi.getPopUPCam());
		System.out.println( readmi.getBattary());
	}

	public String getAudioJuck() {
		return audioJuck;
	}

	public void setAudioJuck(String audioJuck) {
		this.audioJuck = audioJuck;
	}

}
