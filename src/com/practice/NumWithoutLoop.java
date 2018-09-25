package com.practice;

public class NumWithoutLoop {

	public void printNums(int n){
		if(n<=10){
			System.out.print(n+" ");
			printNums(n+1);
		}
	}

	public static void main(String[] args) {
		NumWithoutLoop nw=new NumWithoutLoop();
		nw.printNums(1);
		
	}

}
