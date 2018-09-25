package com.practice;

public class MaxTwoValues {

	public void printTwoMaxNumbers(int[] nums) {
		int maxOne = 0;
		int maxTwo = 0;
		for (int n : nums) { // {5,34,78,2,45,1,99,23};
			System.out.println("value of n: " + n);
			if (maxOne < n) {
				maxTwo = maxOne;
				maxOne = n;
			} else if (maxTwo < n) {
				maxTwo = n;
			}
			System.out.println("MaxOne: " + maxOne + "  MaxTwo:" + maxTwo);
		}
		System.out.println("First Max Number: " + maxOne);
		System.out.println("Second Max Number: " + maxTwo);
	}

	public static void main(String a[]) {
		int num[] = { 5, 34, 78, 2, 45, 1, 99, 23 };
		MaxTwoValues tmn = new MaxTwoValues();
		tmn.printTwoMaxNumbers(num);
	}
}
