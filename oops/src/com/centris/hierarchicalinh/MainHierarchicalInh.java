package com.centris.hierarchicalinh;

public class MainHierarchicalInh {

	public static void main(String[] args) {
		
		ExampleParentHierarchicalInh ep = new ExampleParentHierarchicalInh();
		ExampleFChildHierarchicalInh ef = new ExampleFChildHierarchicalInh();
		ExampleSChildHierarchicalInh es = new ExampleSChildHierarchicalInh();
		ExampleTChildHierarchicalInh et = new ExampleTChildHierarchicalInh();
		ExampleFourthChildHierarchicalInh efourth = new ExampleFourthChildHierarchicalInh();
		
		System.out.println("Parent class : ");
		ep.fName();
		ep.mName();
		
		System.out.println("");
		System.out.println("First Child Class : ");
		ef.fName();
		ef.mName();
		ef.fChild();
		
		System.out.println("");
		System.out.println("Second Child Class : ");
		es.fName();
		es.mName();
		es.sChild();
		
		System.out.println("");
		System.out.println("Third Child Class : ");
		et.fName();
		et.mName();
		et.tChild();
		
		System.out.println("");
		System.out.println("Fouth Child Class is : ");
		efourth.fName();
		efourth.mName();
		efourth.fourthChild();
	}

}
