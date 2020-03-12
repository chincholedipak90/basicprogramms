package com.java.basicprograms;

import java.util.Scanner;

public class ReverseTheNumber {
	
	public static void main(String[] args){
	
		int num;
		int reminder;
		int reverse=0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please Enter Number: ");
		num=in.nextInt();
		
		while(num>0){
			reminder =num%10;
			reverse=reverse*10 + reminder;
			num=num/10;
		}
		
		System.out.println("Resverse Number is "+reverse);
	}

}
