package com.basic;

public class arraya1 {
	public static void main(String[]args)
	{
		int n[]=new int[10];
		int a= 1234;
		
		for (int i = 0; i < n.length; i++) {
			int t=a%10;
			n[i]=t;
			a=a/10;
			}
		for(int i=0;i<10;i++) {
		System.out.println(n[i]);
		}
}

}
