package com.centris.enc;

public class ExampleEnc {
	
	private String fathername;
	private String mothername;
	private String myname;
	
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getMyname() {
		return myname;
	}
	public void setMyname(String myname) {
		this.myname = myname;
	}
	
	@Override
	public String toString() {
		return "ExampleEnc [ \n \t fathername=" + fathername + ", mothername=" + mothername + ", myname=" + myname
				+ ", getFathername()=" + getFathername() + ", getMothername()=" + getMothername() + ", getMyname()="
				+ getMyname() + "]";
	}
}
