package com.basic;

public class Employee {
	String name;
	double salary;
	String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public static void main(String args[])
	{
		
		Employee e1= new Employee();
		e1.setGender("male");
		String gender = e1.getGender();
		e1.setGender(gender);
		e1.setName("Jeeva");
		String name = e1.getName();
		e1.setName(name);
	    e1.setSalary(10000);
	    double salary =e1.getSalary();
	    salary=salary*2.2;
	    e1.setSalary(salary);
	    System.out.println(e1.getName());
	    System.out.println(e1.getGender());
	    System.out.println(e1.getSalary());
		Employee e2= new Employee();
	    e2.setGender("male");
		String gender2 = e1.getGender();
		e2.setGender(gender2);
		e2.setName("prakash");
		String name2 = e2.getName();
		e2.setName(name2);
	    e2.setSalary(20000);
	    double saleay=e2.getSalary();
	     salary=salary*2.0;
	     e2.setSalary(salary);
	    System.out.println(e2.getName());
	    System.out.println(e2.getGender());
	    System.out.println(e2.getSalary());
		
		
	}
	

}
