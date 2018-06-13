package com.basic;

public class Car1 {
	int speed;
	String model;
public Car1() {
	this(200);
	System.out.println("empty");
}
public Car1(int speed)
{
	System.out.println("speed");

}
public Car1(int speed,String model)
{
	this(10);
	System.out.println("speed &model");
}

    public void brake() {

	System.out.println("car break");
}
  public static void main(String[] args) {
	Car1 car=new Car1();
	car.brake();
}
}
