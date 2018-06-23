package com.ksrDijiPro;

import java.util.Arrays;
import java.util.Scanner;

public class wifiPassword1 {
	  public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
    
          int roomNumber=sc.nextInt();
          String roomName=sc.next();
          int b[]=new int[5];
          int count=0;
          for(int i=0;roomNumber>0;i++)
          {
              b[i]=roomNumber%10;
              roomNumber=roomNumber/10;
              count++;
          }         
          if(count==5)
          {
          int length=roomName.length();
          Arrays.sort(b);
          System.out.print(b[4]);
          if(length%2==0)
          {
             System.out.print("$");
          }
          else
          {
          System.out.print("#");
          }
         System.out.print(b[0]);
         char c[]=roomName.toCharArray();
         System.out.println(c[length/2]);
       
          }
          else
          {
              System.out.println("0000");
          }
          
      }
}
