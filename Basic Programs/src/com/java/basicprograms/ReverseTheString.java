package com.java.basicprograms;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String org;
		String rev="";
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please Enter String: ");
		org=in.next();
		
		int length= org.length();
//		System.out.println(length);
		

		for(int i=length-1; i>=0; i--){
			rev=rev+ org.charAt(i);
		}
		
		System.out.println("Reverse String is: "+rev);
	}
}
