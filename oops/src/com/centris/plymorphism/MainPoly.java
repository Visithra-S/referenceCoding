package com.centris.plymorphism;

public class MainPoly {

	public static void main(String[] args) {
		ExampleParentPoly e = new ExampleParentPoly();
		ExampleParentPoly ep = new ExampleFChildPoly();
		ExampleParentPoly ep1 = new ExampleSChildPoly();
		ExampleParentPoly ep2 = new ExampleTChildPoly();
		ExampleParentPoly ep3 = new ExampleFourthChildPoly();
		
		e.family();
		ep.family();
		ep1.family();
		ep2.family();
		ep3.family();
	}

}
