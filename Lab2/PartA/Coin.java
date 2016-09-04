/*
*	Paul Badalian
*	CIS 35A 61Z
*	Lab 2 Part A
*	Due: 7/10/16
*	Submitted: 7/10/16 
*/
import java.util.Random;

public class Coin{
	
	private String sideUp; 	//String holding the showing side value of the coin
	
	public Coin(){
		toss();
	}
	
	/*	This method generates the side of the coin after a flip
		A random number will be created upon the flip
		If the number is even the coin will be heads, if
		it is odd the coin will show tails
	*/
	public void toss(){
		Random random = new Random();
		int rand = random.nextInt();
		if(rand % 2 == 0){
			sideUp = "heads";
		} 
		else if(rand % 2 != 0){
			sideUp = "tails";
		}
	}
	
	public String getSideUp(){
		return sideUp;
	}
	
}