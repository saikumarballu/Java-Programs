package com.practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=153,a,sum=0;
		int temp=n;
		while(n>0){
			a=n%10;
			n=n/10;
			sum=sum+(a*a*a);
		}
		if(sum==temp)
			System.out.println(sum+" is Armstrong Number");

	}

}
