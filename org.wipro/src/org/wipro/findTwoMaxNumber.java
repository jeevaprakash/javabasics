package org.wipro;
import java.util.*;
public class findTwoMaxNumber {
	public static void main(String args[])
	{
		int temp;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		for(int i=0;i<a.length;i++) {
		 a[i]= sc.nextInt();
		}
		for(int k=0;k<a.length;k++) {
		
		if(a[k]>a[k+1])
		{
			 temp=a[k];
			a[k]=a[k+1];
			a[k+1]=temp;
			
		}
		}for (int i = 0; i < a.length+1; i++) {
			System.out.println(a[i]);
		}
	}
}
		
	


