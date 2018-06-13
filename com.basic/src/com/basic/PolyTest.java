package com.basic;

public class PolyTest {
public static void main(String[] args) {
	PolyTest pt=new PolyTest();
	PoliceCar pc=new PoliceCar();
	Taxi taxi=new Taxi();
	pt.brake(taxi);
	pt.brake(pc);
	Car1 car[]= {new Taxi(),new PoliceCar()};
	for (int i = 0; i < car.length; i++) {
		car[i].brake();
	}
}public void brake(Car1 car) {
	car.brake();
}
}
