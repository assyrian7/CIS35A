/*
*	Paul Badalian
*	CIS 35A 61Z
*	Lab 2 Part B
*	Due: 7/10/16
*	Submitted: 7/10/16 
*/
public class ParkingTicket{
	
	private PoliceOfficer policeOfficer; //The police officer issuing the ticket
	private ParkedCar parkedCar; //The car receiving the ticket
	private int hoursIllegallyParked; //The number of hours the car is illegally parked
	private String ticket; //The compiled string value of the ticket
	private double fine; //The total fine for the owner of the car
	
	public ParkingTicket(){ //The default contructor shouldn't be called as the ticket should have values passed to it 
		
	}
	public ParkingTicket(PoliceOfficer policeOfficer, ParkedCar parkedCar, int hoursIllegallyParked){ //Initialize the ticket with specified values
		this.policeOfficer = policeOfficer;
		this.parkedCar = parkedCar;
		this.hoursIllegallyParked = hoursIllegallyParked;
		ticket = "";
		fine = 0.0;
	}
	
	//Set the issuer of the ticket
	public void setPoliceOfficer(PoliceOfficer policeOfficer){
		this.policeOfficer = policeOfficer;
	}
	//Set the receiving car of the ticket
	public void setParkedCar(ParkedCar parkedCar){
		this.parkedCar = parkedCar;
	}
	//Set the number of hours the car is illegally parked
	public void setHoursIllegallyParked(int hoursIllegallyParked){
		this.hoursIllegallyParked = hoursIllegallyParked;
	}
	
	//Get the receiving car of the ticket
	public ParkedCar getParkedCar(){
		return parkedCar;
	}
	//Get the number of hours illegally parked
	public int getHoursIllegallyParked(){
		return hoursIllegallyParked;
	}
	//Get the issuer of the ticket
	public PoliceOfficer getPoliceOfficer(){
		return policeOfficer;
	}
	//Get the value of the ticket
	public String getTicket(){
		return ticket;
	}
	//Get the total fine for the receiving car
	public double getFine(){
		return fine;
	}
	
	//Generate the ticket value and fine based on the car, meter, and number of hours illegally parked
	public void generateTicket(){
		
		for(int i = 0; i < hoursIllegallyParked; i++){
			if(i == 0){
				fine += 25.0;
			}
			else{
				fine += 10.0;
			}
		}
		
		ticket += "Issued by officer: " + policeOfficer.getName() + " Badge Number: " + policeOfficer.getBadgeNumber() + "\n";
		ticket += "The car this ticket is issued to has make: " + parkedCar.getMake() + " model: " + parkedCar.getModel() + "\n";
		ticket += "color: " + parkedCar.getColor() + " license number: " + parkedCar.getLicenseNumber() + "\n\n";
		ticket += "Total Fine: " + fine;
		
	}
	
}