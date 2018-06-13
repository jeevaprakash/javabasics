
package com.basic;

public class introduction {
	public static void main(String[]args)
	{
	outer:for (int i=1;i<=10;i++)
		{
		inner:for (int j=0;j<5;j++)
		{
			if (j==2)
			{continue outer;				
			}
			System.out.println("j"+j);
			
			}
				System.out.println("i"+i);
		}
		
	}

}
