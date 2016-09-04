/*
*	Paul Badalian
*	CIS 35A 61Z
*	Lab 2 Part B
*	Due: 7/10/16
*	Submitted: 7/10/16 
*/
public class Main{
	
	public static void main(String[] args){
		ParkedCar parkedCar = new ParkedCar("BMW", "740IL", "GRAY", "4ADS282", 200); //This object will act as a parked car
		ParkingMeter parkingMeter = new ParkingMeter(60); //This object will act as a parking meter
		PoliceOfficer policeOfficer = new PoliceOfficer("Eric Smith", "DJSJS34D"); //This object will act as a police officer
		ParkingTicket parkingTicket = policeOfficer.issueParkingTicket(parkedCar, parkingMeter); //The officer issues a ticket
		if(parkingTicket == null){ //If the ticket is null, this implies that the car isn't parked illegally
			System.out.println("The car is not parked illegally");
		}
		else{ //If the ticket isn't null, this implies that car is parked illegally and given a ticket
			System.out.println(parkingTicket.getTicket()); //Display the ticket
		}
	}
	
}
/*	Test Output

	Issued by officer: Eric Smith Badge Number: DJSJS34D
	The car this ticket is issued to has make: BMW model: 740IL
	color: GRAY license number: 4ADS282

	Total Fine: 35.0
	
*/