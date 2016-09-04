/*
*	Paul Badalian
*	CIS 35A 61Z
*	Lab 2 Part B
*	Due: 7/10/16
*	Submitted: 7/10/16 
*/
public class ParkedCar{
	
	private String make; //Make the parked car
	private String model; //Model of the parked car
	private String color; //Color of the parked car
	private String licenseNumber; //License number of the parked car
	private int minutesParked; //Number of minutes the car has been parked
	
	public ParkedCar(){ //Initalize the parked car default values
		make = "Audi";
		model = "A6";
		color = "Black";
		licenseNumber = "3DEF432";
		minutesParked = 120;
	}
	public ParkedCar(String make, String model, String color, String licenseNumber, int minutesParked){ //Initialize the car with specified values
		this.make = make;
		this.model = model;
		this.color = color;
		this.licenseNumber = licenseNumber;
		this.minutesParked = minutesParked;
	}
	
	//Set the car's make
	public void setMake(String make){
		this.make = make;
	}
	//Set the car's model
	public void setModel(String model){
		this.model = model;
	}
	//Set the car's color
	public void setColor(String color){
		this.color = color;
	}
	//Set the car's license number
	public void setLicenseNumber(String licenseNumber){
		this.licenseNumber = licenseNumber;
	}
	//Set the car's parked minutes
	public void setMinutesParked(int minutesParked){
		this.minutesParked = minutesParked;
	}
	
	//Get the car's make
	public String getMake(){
		return make;
	}
	//Get the car's model
	public String getModel(){
		return model;
	}
	//Get the car's color
	public String getColor(){
		return color;
	}
	//Get the car's license number
	public String getLicenseNumber(){
		return licenseNumber;
	}
	//Get the car's parked minutes
	public int getMinutesParked(){
		return minutesParked;
	}
	
}