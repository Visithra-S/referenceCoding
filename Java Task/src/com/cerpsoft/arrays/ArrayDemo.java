package com.cerpsoft.arrays;

public class ArrayDemo {
	
	public static void main(String args[]) {
		int age[] = new int[3];
		age[0] = 19;
		age[1] = 20;
		age[2] = 21;
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
		
		int num[] = {1,2,3};
		//for(int i=0;i<num.length;i++) {
		for(int n:num) {
			System.out.println(n);
		}
	}
}
