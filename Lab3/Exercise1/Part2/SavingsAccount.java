/*
*	Paul Badalian
*	CIS 35A 61Z
*	Lab 3 Exercise 1 Part 2
*	Due: 7/15/16
*	Submitted: 7/15/16 
*/
public class SavingsAccount{
	
	private static double annualInterestRate; //Store interest rate
	private double savingsBalance; //Store balance
	
	public SavingsAccount(){
		savingsBalance = 100.0;
	}
	public SavingsAccount(double savingsBalance){
		this.savingsBalance = savingsBalance;
	}
	
	//Set interest rate
	protected static void modifyInterestRate(double mAnnualInterestRate){
		annualInterestRate = mAnnualInterestRate;
	}
	//Set balance
	protected void setSavingsBalance(double savingsBalance){
		this.savingsBalance = savingsBalance;
	}
	//Calculate interest
	public void calculateMonthlyInterest(){
		double interest = savingsBalance * annualInterestRate / 12;
		savingsBalance += interest;
	}
	
	//Get balance
	protected double getSavingsBalance(){
		return savingsBalance;
	}
	
}