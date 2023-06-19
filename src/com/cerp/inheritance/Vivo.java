package com.cerp.inheritance;

public class Vivo extends Oppo{
	
	private boolean popUPCam;
	
	public void newMobileLunch() {

		Oppo vivo = new Vivo();
		vivo.setCam("62");
		vivo.setImeiNo("VIVO987610");
		vivo.setRam("8");
		vivo.setRom("4");
		vivo.setTureFiveG(true);
		vivo.setBattary("5000mah");

		System.out.println(vivo);
		System.out.println(" New Feature Vivo "+vivo.getBattary());
	}

	public boolean getPopUPCam() {
		return popUPCam;
	}

	public void setPopUPCam(boolean popUPCam) {
		this.popUPCam = popUPCam;
	}

}
