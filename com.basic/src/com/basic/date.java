package com.basic;

public class date {
int month;
int day;
int year;
public date(int month, int day, int year) {
	this.month = month;
	this.day = day;
	this.year = year;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public void display() {
	System.out.println(month+"/"+day+"/"+year);
}


public static void main(String[] args) {
	date d1=new date(12,12,312);
	d1.display();
	}
}

