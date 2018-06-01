package com.basic;

public class admin {
	public boolean isPerfect() {
return true;	}
	public static void main(String[]args) {	
	    int n=20;
		int sum=0;
		int i;
		for (i = 1; i < n; i++)
		{
		if(n%i==0)
		{
			sum=+i;
		}
		}
		if(sum==n)
		{
		System.out.println("it is a perfect number");
		}
		else
		{
			System.out.println("it is not a perfect number");
		}
	}
		
	}
