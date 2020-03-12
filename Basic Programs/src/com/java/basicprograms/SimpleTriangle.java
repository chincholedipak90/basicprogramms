package com.java.basicprograms;

public class SimpleTriangle {

	static void simpletri() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	static void invtri() {
		for (int p = 5; p >= 1; p--) {
			for (int q = 0; q < p; q++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simpletri();
		System.out.println("     ");
		invtri();
		
	}

}
