package com.basic;

public class PoliceCar extends Car1 {
	
	public PoliceCar() {
		System.out.println("empty constructor on policecar is called");
	}
	public PoliceCar(int speed)
	{
		this();
		System.out.println("pc speed");
	}
public	PoliceCar(int speed,String model){
	this(100);
	System.out.println("conc with arrgument is called");
		
	}
	public static void main(String[] args) {
		PoliceCar pc = new PoliceCar(100,"policecar");
		pc.speed=100;
		pc.model="policeCar";
		
		
		}
	public void brake() {
		System.out.println("police car brake");
	}
	
	}
