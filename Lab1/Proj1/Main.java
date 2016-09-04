/*
*	Paul Badalian
*	CIS 35A 61Z
*	Lab 1 Proj 1
*	Due: 7/3/16
*	Submitted: 7/3/16 
*/
import java.util.*;

public class Main{
	
	private static final float televisionPrice = 400.0f;
	private static final float vcrPrice = 220.0f;
	private static final float remoteControlPrice = 35.20f;
	private static final float cdPlayerPrice = 300.0f;
	private static final float tapeRecorderPrice = 150.0f;
	private static final float taxRate = 8.25f;
	
	public static void main(String[] args){
		
		int quantityOfTVs;
		int quantityOfVCRs;
		int quantityOfRemoteControls;
		int quantityOfCDPlayers;
		int quantityOfTapeRecorders;
		
		float tvTotal;
		float vcrTotal;
		float remoteControlTotal;
		float cdPlayerTotal;
		float tapeRecorderTotal;
		
		float subTotal;
		float taxTotal;
		float total;
		
		quantityOfTVs = quantityOfVCRs = quantityOfRemoteControls = quantityOfCDPlayers = quantityOfTapeRecorders = 0;
		tvTotal = vcrTotal = remoteControlTotal = cdPlayerTotal = tapeRecorderTotal = 0f;
		subTotal = taxTotal = total = 0f;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the quantity of TVs sold: ");
		quantityOfTVs = scanner.nextInt();
		System.out.print("Enter the quantity of VCRs sold: ");
		quantityOfVCRs = scanner.nextInt();
		System.out.print("Enter the quantity of remote controls sold: ");
		quantityOfRemoteControls = scanner.nextInt();
		System.out.print("Enter the quantity of cd players sold: ");
		quantityOfCDPlayers = scanner.nextInt();
		System.out.print("Enter the quantity of tape recorders sold: ");
		quantityOfTapeRecorders = scanner.nextInt();
		System.out.println();
		
		tvTotal = televisionPrice * quantityOfTVs;
		vcrTotal = vcrPrice * quantityOfVCRs;
		remoteControlTotal = remoteControlPrice * quantityOfRemoteControls;
		cdPlayerTotal = cdPlayerPrice * quantityOfCDPlayers;
		tapeRecorderTotal = tapeRecorderPrice * quantityOfTapeRecorders;
		
		subTotal += tvTotal;
		subTotal += vcrTotal;
		subTotal += remoteControlTotal;
		subTotal += cdPlayerTotal;
		subTotal += tapeRecorderTotal;
		
		taxTotal = subTotal * (taxRate / 100);
		
		total = subTotal + taxTotal;

		System.out.printf("%3s  %-16s%-13sTotal\n", "QTY", "DESC", "Price");
		System.out.printf("%3d  %-16s$%-12.2f$%.2f\n", quantityOfTVs, "Television", televisionPrice, tvTotal);
		System.out.printf("%3d  %-16s$%-12.2f$%.2f\n", quantityOfVCRs, "VCR", vcrPrice, vcrTotal);
		System.out.printf("%3d  %-16s$%-12.2f$%.2f\n", quantityOfRemoteControls, "Remote Control", remoteControlPrice, remoteControlTotal);
		System.out.printf("%3d  %-16s$%-12.2f$%.2f\n", quantityOfCDPlayers, "CD Player", cdPlayerPrice, cdPlayerTotal);
		System.out.printf("%3d  %-16s$%-12.2f$%.2f\n", quantityOfTapeRecorders, "Tape Recorder", tapeRecorderPrice, tapeRecorderTotal);
		System.out.println();
		System.out.printf("%34s$%.2f\n", "Subtotal:  ", subTotal);
		System.out.printf("%34s$%.2f\n", "Tax (8.25%):  ", taxTotal);
		System.out.printf("%34s$%.2f", "Total: ", total);

	}

	
}