package org.wipro;
import java.util.*;
public class duplicatenumbers {
	public static void main(String[] args) {
		int c =1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		int N=sc.nextInt();
		int a[]=new int[N];
		System.out.println("enter value one by one");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int j = 0; j < a.length; j++) {
			for (int k = j+1; k < a.length; k++) {
				if(a[j]==a[k])
				{
					c++;
					System.out.println(a[j]+" "+c);break;
				}				
			}
	}
		if(c==0)
		{
			System.out.println("NODUPLICATEELEMENT");
		} 
}
}
