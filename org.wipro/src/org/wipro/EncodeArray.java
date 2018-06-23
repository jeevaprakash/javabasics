package org.wipro;

import java.util.Scanner;

public class EncodeArray {
	 public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int input1[]=new int[n];
         int a[]=new int[n];
         for(int j=0;j<input1.length;j++)
         {
        	 input1[j]=sc.nextInt();
         }
         System.out.print("Encodeed array=");
         System.out.print("{");
         for(int i=0;i<input1.length;i++)
         {
             if(i==input1.length-1)
             {
                 a[i]=input1[i];
                 System.out.print(a[i]);
             }
             if(i<(input1.length-1))
             {
           a[i]=input1[i+1]-input1[i];
           System.out.print(a[i]+",");
             }
           
         }System.out.println("}");
         System.out.println("First number in orginal array="+input1[0]);
         int sum=0;
         for(int k=0;k<input1.length;k++)
         {
             sum=sum+input1[k];
         }
         System.out.println("Sum of all numbers in orginall array="+sum);
     }
}
