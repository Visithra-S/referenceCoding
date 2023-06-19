package com.cerp.inheritance;

public class Realme extends Vivo{
	
	public void newMobileLunch() {

		Vivo realme = new Realme();
		realme.setCam("62");
		realme.setImeiNo("REAMEO987610");
		realme.setRam("10");
		realme.setRom("10");
		realme.setTureFiveG(true);
		//realme.setBattary("3000mah");
		realme.setPopUPCam(true);

		System.out.println(realme);
		System.out.println(" New Feature REALME "+realme.getBattary());
		System.out.println(" New Feature REALME "+realme.getPopUPCam());
	}

}
