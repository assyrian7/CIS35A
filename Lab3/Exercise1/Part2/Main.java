/*
*	Paul Badalian
*	CIS 35A 61Z
*	Lab 3 Exercise 1 Part 2
*	Due: 7/15/16
*	Submitted: 7/15/16 
*/
public class Main{
	
	public static void main(String[] args){
		SavingsAccount saver1 = new SpecialSavings(2000.0); //Special Savings accounts
		SavingsAccount saver2 = new SpecialSavings(3000.0);
		
		((SpecialSavings) saver1).deposit(52.3); //Deposit into accounts
		((SpecialSavings) saver2).deposit(42.12);
		
		((SpecialSavings) saver1).withdraw(2.3); //Withdraw from accounts
		((SpecialSavings) saver2).withdraw(12.12);
		
		SavingsAccount.modifyInterestRate(.04); //Change interest rate
		saver1.calculateMonthlyInterest(); //Calculate interest rates
		saver2.calculateMonthlyInterest();
		System.out.printf("%s%.2f\n","Saver1 balance after interest: ", saver1.getSavingsBalance()); //Display balances
		System.out.printf("%s%.2f\n","Saver2 balance after interest: ", saver2.getSavingsBalance());
		
		SavingsAccount.modifyInterestRate(.05); //Change interest rate
		saver1.calculateMonthlyInterest(); //Calculate interest rates
		saver2.calculateMonthlyInterest();
		System.out.printf("\n%s%.2f\n", "Saver1 balance after interest: ", saver1.getSavingsBalance()); //Display balances
		System.out.printf("%s%.2f", "Saver2 balance after interest: ", saver2.getSavingsBalance());
	}
	
}
/* Output

Saver1 balance after interest: 2056.83
Saver2 balance after interest: 3040.10

Saver1 balance after interest: 2065.40
Saver2 balance after interest: 3052.77

*/