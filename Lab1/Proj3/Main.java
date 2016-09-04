/*
*	Paul Badalian
*	CIS 35A 61Z
*	Lab 1 Proj 3
*	Due: 7/3/16
*	Submitted: 7/3/16 
*/
import java.util.*;

public class Main{
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		String itemDescription, methodOfDepreciation;
		int yearOfPurchase, yearsToDepreciate;
		double itemCost;
		
		itemDescription = methodOfDepreciation = "";
		yearOfPurchase = yearsToDepreciate = 0;
		itemCost = 0.0;
		
		System.out.print("Enter the item description: ");
		itemDescription = scanner.nextLine();
		System.out.print("Enter the year of purchase: ");
		yearOfPurchase = scanner.nextInt();
		System.out.print("Enter the item cost: ");
		itemCost = scanner.nextDouble();
		System.out.print("Enter the number of years that the item will be depreciated: ");
		yearsToDepreciate = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the method of depreciation: ");
		methodOfDepreciation = scanner.nextLine();
		
		displaySchedule(itemDescription, yearOfPurchase, itemCost, yearsToDepreciate, methodOfDepreciation);
		
		scanner.close();
		
	}
	
	public static void displaySchedule(String itemDescription, int yearOfPurchase, double itemCost, int yearsToDepreciate, String methodOfDepreciation){
		
		if(!methodOfDepreciation.equals("Straight-Line") && !methodOfDepreciation.equals("Double-Declining")){
			System.out.println("The depreciation method is not available");
		}
		else{
			System.out.printf("%-8s%-8s%12s%12s\n", "Year", "Cost", "Dep. Amt", "Tot Dep.");
			if(methodOfDepreciation.equals("Double-Declining")){
				DoubleDep(yearOfPurchase, itemCost, yearsToDepreciate);
			}
			else if(methodOfDepreciation.equals("Straight-Line")){
				SingleDep(yearOfPurchase, itemCost, yearsToDepreciate);
			}
		}
		
		
	}
	
	public static void SingleDep(int yearOfPurchase, double itemCost, int yearsToDepreciate){
		double depositAmount, totalDeposit;
		depositAmount = totalDeposit = 0.0;
		for(int i = 0; i < yearsToDepreciate; i++){
			depositAmount = itemCost * (1.0 / yearsToDepreciate);
			totalDeposit += depositAmount;
			System.out.printf("%-8d%7.2f%12.2f%12.2f\n", yearOfPurchase + i, itemCost, depositAmount, totalDeposit);
		}
	}
	public static void DoubleDep(int yearOfPurchase, double itemCost, int yearsToDepreciate){
		double depositAmount, totalDeposit;
		depositAmount = totalDeposit = 0.0;
		for(int i = 0; i < yearsToDepreciate; i++){
			depositAmount = itemCost * (2.0 / yearsToDepreciate);
			totalDeposit += depositAmount;
			System.out.printf("%-8d%7.2f%12.2f%12.2f\n", yearOfPurchase + i, itemCost, depositAmount, totalDeposit);
			itemCost -= depositAmount;
		}
	}

	
}