/*
*	Paul Badalian
*	CIS 35A 61Z
*	Lab 2 Part B
*	Due: 7/10/16
*	Submitted: 7/10/16 
*/
public class ParkingMeter{
	
	private int parkingMinutesPurchased; //This holds the number of parking minutes purchased for the meter
	
	public ParkingMeter(){ //Initialize the meter with a default value for parking minutes purchased
		parkingMinutesPurchased = 60;
	}
	public ParkingMeter(int parkingMinutesPurchased){ //Initialize the meter with a specified number of parking minutes purchased
		this.parkingMinutesPurchased = parkingMinutesPurchased;
	}
	
	//Set the parking minutes purchased for the meter
	public void setParkingMinutesPurchased(int parkingMinutesPurchased){
		this.parkingMinutesPurchased = parkingMinutesPurchased;
	}
	
	//Get the parking minutes purchased for the meter
	public int getParkingMinutesPurchased(){
		return parkingMinutesPurchased;
	}
	
}