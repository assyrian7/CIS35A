/*
*	Paul Badalian
*	CIS 35A 61Z
*	Lab 3 Exercise 1 Part 1
*	Due: 7/15/16
*	Submitted: 7/15/16 
*/
public class Main{
	
	public static void main(String[] args){
		SavingsAccount saver1 = new SavingsAccount(2000.0); //Create two savings accounts
		SavingsAccount saver2 = new SavingsAccount(3000.0);
		
		SavingsAccount.modifyInterestRate(.04); //Change interest rate to 4%
		saver1.calculateMonthlyInterest(); //Calculate the interests
		saver2.calculateMonthlyInterest();
		System.out.printf("%s%.2f\n","Saver1 balance after interest: ", saver1.getSavingsBalance()); //Display the interests
		System.out.printf("%s%.2f\n","Saver2 balance after interest: ", saver2.getSavingsBalance());
		
		SavingsAccount.modifyInterestRate(.05); //Chnage interest rate to 5%
		saver1.calculateMonthlyInterest(); //Calculate the interests
		saver2.calculateMonthlyInterest();
		System.out.printf("\n%s%.2f\n", "Saver1 balance after interest: ", saver1.getSavingsBalance()); //Display the interests
		System.out.printf("%s%.2f", "Saver2 balance after interest: ", saver2.getSavingsBalance());

	}
	
}
/* Output

Saver1 balance after interest: 2006.67
Saver2 balance after interest: 3010.00

Saver1 balance after interest: 2015.03
Saver2 balance after interest: 3022.54

*/