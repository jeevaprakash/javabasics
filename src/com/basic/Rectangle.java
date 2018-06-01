package com.basic;

public class Rectangle {
double length;
double bredth;
public Rectangle(double length,double bredth)
{
	if(length>0.0&&length<20.0&&bredth>0.0&&bredth<20.0)
	{
		this.length=length;
		this.bredth=bredth;
	}
	else
	{
		System.out.println("Sorry the length and bredth is not larger than 0.0 and less than 20.0");
	}
	
}
public double findAreaOfRectangle()
{
	return length*bredth;
}
public static void main(String[]args) 
{
	Rectangle r1=new Rectangle(10,20);
System.out.println(r1. findAreaOfRectangle());	
	
}

}
