package com.practice;

public class ReverseString {

	public static void main(String[] args) {
		String str="ABCDEFG";
		char[] a=str.toCharArray();
		for(int i=a.length-1;i>=0;i--)
			System.out.println(a[i]);
		

	}

}
