package com.java.basicprograms;

public class ReverseAString {

	public static void main(String[] args) {

		String OrgStr = "nitin";
		String temStr = "";

		for (int i = OrgStr.length() - 1; i >= 0; i--) {
			temStr = temStr + OrgStr.charAt(i);
		}
		System.out.println(temStr);
	}
}
