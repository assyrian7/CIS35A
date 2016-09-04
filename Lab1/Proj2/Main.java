/*
*	Paul Badalian
*	CIS 35A 61Z
*	Lab 1 Proj 2
*	Due: 7/3/16
*	Submitted: 7/3/16 
*/
import java.util.*;

public class Main{
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		float c, f;
		c = f = 0;
		
		System.out.print("Enter a celcius value: ");
		c = scanner.nextFloat();
		/*
		while(c < 0){
			System.out.print("Enter a celcius value that is >= 0: ");
			c = scanner.nextFloat();
		}
		*/
		convertCToF(c);
		System.out.print("\nEnter a farenheight value: ");
		f = scanner.nextFloat();
		/*
		while(f < 0){
			System.out.print("Enter a farenheight value that is >= 0: ");
			f = scanner.nextFloat();
		}
		*/
		convertFToC(f);
	}
	
	public static void convertCToF(float c){
		
		float f = (float)(c * (9.0 / 5.0) + 32);
		System.out.printf("The farenheight value is %.2f", f);
		
	}
	
	public static void convertFToC(float f){
		
		float c = (float)((f - 32) * (5.0 / 9.0));
		System.out.printf("The celcius value is %.2f", c);
		
	}
	
}