package com.cerpsoft.arrays;

public class MethodArray {

	static int min(final int[] visi){

		int min = visi[0];  

		for(int i=1; i<visi.length; i++) if(min > visi[i]) min = visi[i];  
		
		return min;
	}  

	public static void main(String args[]){  
		int[] arr = {33,3,4,5};  
		System.out.println(min(arr)); 
	}
}
