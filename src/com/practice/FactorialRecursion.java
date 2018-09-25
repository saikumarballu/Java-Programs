package com.practice;

public class FactorialRecursion {
	
	public static int factRecur(int n){
		if(n==0)
			return 1;
		else
			return (n*factRecur(n-1));
	}

	public static void main(String[] args) {
		
		int a=factRecur(4);
		System.out.println(a);
		

	}

}
