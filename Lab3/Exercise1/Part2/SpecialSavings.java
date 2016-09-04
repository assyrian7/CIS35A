/*
*	Paul Badalian
*	CIS 35A 61Z
*	Lab 3 Exercise 1 Part 2
*	Due: 7/15/16
*	Submitted: 7/15/16 
*/
public class SpecialSavings extends SavingsAccount{
	
	
	public SpecialSavings(double savingsBalance){
		super(savingsBalance);
		if(savingsBalance > 10000){ //If the balance is greater than 10K, set the interest rate to 10%
			modifyInterestRate(.1);
		}
	}
	
	//Add amount to the balance
	public void deposit(double amount){ 
		setSavingsBalance(getSavingsBalance() + amount);
		//savingsBalance += amount;
	}
	//Subtract amount from balance and return that amount to the user
	public double withdraw(double amount){
		setSavingsBalance(getSavingsBalance() - amount);
		//savingsBalance -= amount;
		return amount;
	}
	
}