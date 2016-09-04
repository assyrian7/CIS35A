/*
*	Paul Badalian
*	CIS 35A 61Z
*	Lab 2 Part B
*	Due: 7/10/16
*	Submitted: 7/10/16 
*/
public class PoliceOfficer{
	
	private String name; //The name of the officer
	private String badgeNumber; //The badge number of the officer
	
	public PoliceOfficer(){ //Initialize the officer with default values
		name = "Paul Badalian";
		badgeNumber = "DJDK3728";
	}
	public PoliceOfficer(String name, String badgeNumber){ //Initialize the officer with specified values 
		this.name = name;
		this.badgeNumber = badgeNumber;
	}
	
	//Set the officer's name
	public void setName(String name){
		this.name = name;
	}
	//Set the officer's badge number
	public void setBadgeNumber(String badgeNumber){
		this.badgeNumber = badgeNumber;
	}
	
	//Get the officer's name
	public String getName(){
		return name;
	}
	//Get the officer's badge number
	public String getBadgeNumber(){
		return badgeNumber;
	}
	
	//Determine if the car is illegally parked
	public boolean isIllegallyParked(ParkedCar parkedCar, ParkingMeter parkingMeter){
		
		if(parkedCar.getMinutesParked() > parkingMeter.getParkingMinutesPurchased()){
			return true;
		}
		return false;
		
	}
	//Create and return a parking ticket for the car, if it is null a ticket isn't issued
	public ParkingTicket issueParkingTicket(ParkedCar parkedCar, ParkingMeter parkingMeter){
		
		ParkingTicket parkingTicket = null;
				
		if(isIllegallyParked(parkedCar, parkingMeter)){
			int hoursIllegallyParked = (parkedCar.getMinutesParked() - parkingMeter.getParkingMinutesPurchased()) / 60;
			parkingTicket = new ParkingTicket(this, parkedCar, hoursIllegallyParked);
			parkingTicket.generateTicket();
		}
		return parkingTicket;
	}
	
}