package com.cerp.inheritance;

public class MobileGovIndia {
	
	private String imeiNo;
	private String ram;
	private String rom;
	private String cam;
	private boolean tureFiveG;
	
	public String getImeiNo() {
		return imeiNo;
	}
	public void setImeiNo(String imeiNo) {
		this.imeiNo = imeiNo;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getRom() {
		return rom;
	}
	public void setRom(String rom) {
		this.rom = rom;
	}
	public String getCam() {
		return cam;
	}
	public void setCam(String cam) {
		this.cam = cam;
	}
	public boolean isTureFiveG() {
		return tureFiveG;
	}
	public void setTureFiveG(boolean tureFiveG) {
		this.tureFiveG = tureFiveG;
	}
	
	@Override
	public String toString() {
		return "\n MobileGovIndia [imeiNo=" + imeiNo + ", ram=" + ram + ", rom=" + rom + ", cam=" + cam + ", tureFiveG="
				+ tureFiveG + "]";
	}
}
