package com.basic;

public class Car {
String model ;
int speed;

public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public Car()
{
	
}
public boolean start() {
	return true;
}
public void speed() {
	
}
public static void main(String[] args) {
Car car1=new Car();
Car car2=new Car();

	car1.speed=30;
	car2.speed=49;

	System.out.println( car1.speed);
	System.out.println(  car2.speed);
}
}
