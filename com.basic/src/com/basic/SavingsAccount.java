package com.basic;

public class SavingsAccount {
static double annualInterestRate;
private double savingBalance;
public static double getAnnualInterestRate() {
	return annualInterestRate;
}
public static void setAnnualInterestRate(double annualInterestRate) {
	SavingsAccount.annualInterestRate = annualInterestRate;
}
public double getSavingBalance() {
	return savingBalance;
}
public void setSavingBalance(double savingBalance) {
	this.savingBalance = savingBalance;
}
  public  void MonthlyIntrest()
  {
	 double intrest=(savingBalance*(annualInterestRate/100))/12;
	 double savingBalance1=savingBalance+intrest;
	 System.out.println(savingBalance1);
  }
  public static void setmodifyInterestRate(double annualInterestRate)
  {
	  SavingsAccount.annualInterestRate = annualInterestRate;
  }
 
  public static void main(String[]args) {
	  SavingsAccount s1=new SavingsAccount();
	  SavingsAccount s2=new SavingsAccount();
	  s1.setSavingBalance(2000);	
	  s2.setSavingBalance(3000);
	  SavingsAccount .setAnnualInterestRate(4);
	  s1.MonthlyIntrest();
	  s2.MonthlyIntrest();
	  SavingsAccount.setmodifyInterestRate(5);
	  s1.MonthlyIntrest();
	  s2.MonthlyIntrest();
	  
  }
}
