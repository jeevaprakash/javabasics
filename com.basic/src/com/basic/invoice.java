package com.basic;

class invoiceone {
String partNumber;
String partDiscription;
double Totalprice;
int quantity;
double price;
public String getPartNumber() {
	return partNumber;
}
public void setPartNumber(String partNumber) {
	this.partNumber = partNumber;
}
public String getPartDiscription() {
	return partDiscription;
}
public void setPartDiscription(String partDiscription) {
	this.partDiscription = partDiscription;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public double getInvoiceAmount()
{
	Totalprice=quantity*price;
	return Totalprice;
}
} 
class invoice
{
public static void main(String[] args)
{
	invoiceone i1=new invoiceone();
	i1.setPartNumber("one");
	i1.setPartDiscription("beer");
	i1.setPrice(150);
	i1.setQuantity(2);
	double d=i1.getInvoiceAmount();
	System.out.println(i1.getPartDiscription()+""+d);
}
}

