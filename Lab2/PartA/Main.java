/*
*	Paul Badalian
*	CIS 35A 61Z
*	Lab 2 Part A
*	Due: 7/10/16
*	Submitted: 7/10/16 
*/
public class Main{
	
	public static void main(String[] args){
		
		int headsCount = 0; //Counter holding the number of times the flipped coin shows head
		int tailsCount = 0; //Counter holding the number of times the flipped coin shows tails
		
		Coin coin = new Coin(); //This object will act as the coin
		if(coin.getSideUp().equals("tails")){ //If the initial side of the coin is tails, increment the tails counter
			tailsCount++;
		}
		else if(coin.getSideUp().equals("heads")){ //If the initial side of the coin is heads, increment the heads counter
			headsCount++;
		}
		printSideUp(coin); //Display the initial side of the coin
		
		for(int i = 0; i < 20; i++){ //Flip the coin 20 times
			coin.toss();
			if(coin.getSideUp().equals("tails")){ //Increment the tails counter if the coin is tails after flip
				tailsCount++;
			}
			else if(coin.getSideUp().equals("heads")){ //Increment the heads counter if the coin is heads after flip
				headsCount++;
			}
			printSideUp(coin); //Display the side of the coin after each flip
		}
		System.out.println("\nHeads Count: " + headsCount); //Display the head count after the loop
		System.out.println("Tails Count: " + tailsCount); //Display the tails count after the loop
		
	}
	
	//Display the showing side of the coin passed
	private static void printSideUp(Coin coin){
		System.out.println("Side up: " + coin.getSideUp());
	}
	
}
/*	Test Output
	Side up: heads
	Side up: heads
	Side up: tails
	Side up: heads
	Side up: tails
	Side up: heads
	Side up: tails
	Side up: heads
	Side up: tails
	Side up: heads
	Side up: tails
	Side up: tails
	Side up: heads
	Side up: heads
	Side up: heads
	Side up: heads
	Side up: heads
	Side up: tails
	Side up: heads
	Side up: tails
	Side up: heads

	Heads Count: 13
	Tails Count: 8
*/