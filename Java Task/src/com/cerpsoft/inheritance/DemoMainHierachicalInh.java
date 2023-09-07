package com.cerpsoft.inheritance;

public class DemoMainHierachicalInh {

	public static void main(String[] args) {
		DemoSChildHieroInh ds = new DemoSChildHieroInh();
		DemofChildHieroInh dc = new DemofChildHieroInh();
		ds.fatherName();
		ds.motherName();
		ds.sChild();
		dc.fatherName();
		dc.motherName();
		dc.fChild();
	}

}
