package org.wipro;

import java.util.Scanner;

public class logicalPreogram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first string");
	String a=sc.next();
	System.out.println("Enter the second string");
	String b=sc.next();
	System.out.println("Enter the third string");
	String c=sc.next();
	String str[]=divideString(a);
	String str1[]=divideString(b);
	String str2[]=divideString(c);
	String A=str[0]+str1[1]+str2[2];
	String B=str[1]+str1[2]+str2[0];
	String C=str[2]+str1[0]+str2[1];
	 System.out.println("output:"+A);
	    System.out.println("output:"+B);
	    System.out.println("output:"+C);
	String j=toggleString(C);
   
    System.out.println("Output"+j);
}
public static String[] divideString(String d) {
	int r=d.length()%3;
	int q=d.length()/3;
	String s1="";
	String s2="";
	String s3="";
	if(r==1)
	{
		s1=d.substring(0, q);
		s2=d.substring(s1.length(),s1.length()+2+1);
		s3=d.substring(s2.length()+s1.length(),d.length());		
	}
	if(r==2)
	{
		s1=d.substring(0,q+1);
	    s2=d.substring(s1.length(),s1.length()+q );
	    s3=d.substring(s2.length()+s1.length(),d.length());
    }
	if(r==0)
	{
		s1=d.substring(0,q);
		s2=d.substring(s1.length(),s1.length()+q);
		s3=d.substring(s2.length()+s1.length(),d.length());
	} 
	return new String[]{s1,s2,s3};
	}
public static String toggleString(String F) {
	char[] ch = F.toCharArray();
	String s="";
	for (int i = 0; i < ch.length; i++) {
		if (Character.isLowerCase(ch[i])) {
			s=s+Character.toUpperCase(ch[i]);
		}
		if (Character.isUpperCase(ch[i])) {
			s=s+Character.toLowerCase(ch[i]);
		}
	}
	return s;
}
}

