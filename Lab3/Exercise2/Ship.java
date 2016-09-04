/*
*	Paul Badalian
*	CIS 35A 61Z
*	Lab 3 Exercise 2
*	Due: 7/15/16
*	Submitted: 7/15/16 
*/
public class Ship{
	
	private double weightInTons; //Store ship weight
	private int capacity; //Store ship passenger capacity
	private double surfaceAreaInMeters; //Store ship surface area
	private int yearBuilt; //Store ship's year built
	private int numberOfPassengers; //Store number of passengers
	
	public Ship(){
		weightInTons = 20000;
		capacity = 1000;
		surfaceAreaInMeters = 36000;
		yearBuilt = 2016;
		numberOfPassengers = 300;
	}
	public Ship(double weightInTons, int capacity, int numberOfPassengers, double surfaceAreaInMeters, int yearBuilt){
		this.weightInTons = weightInTons;
		this.capacity = capacity;
		this.surfaceAreaInMeters = surfaceAreaInMeters;
		this.yearBuilt = yearBuilt;
	}
	
	//Set ship's weight
	protected void setWeightInTons(double weightInTons){
		this.weightInTons = weightInTons;
	}
	//Set ship's capacity
	protected void setCapacity(int capacity){
		this.capacity = capacity;
	}
	//Set the number of passengers
	protected void setNumberOfPassengers(int numberOfPassengers){
		this.numberOfPassengers = numberOfPassengers;
	}
	//Set the surface area of the ship
	protected void setSurfaceAreaInMeters(double surfaceAreaInMeters){
		this.surfaceAreaInMeters = surfaceAreaInMeters;
	}
	//Set the year built
	protected void setYearBuilt(int yearBuilt){
		this.yearBuilt = yearBuilt;
	}
	
	//Get the ship weight
	protected double getWeightInTons(){
		return weightInTons;
	} 
	//Get the ship capacity
	protected int getCapacity(){
		return capacity;
	}
	//Get the number of passengers
	protected int getNumberOfPassengers(){
		return numberOfPassengers;
	}
	//Get the surface area
	protected double getSurfaceAreaInMeters(){
		return surfaceAreaInMeters;
	}
	//Get the year built
	protected int getYearBuilt(){
		return yearBuilt;
	}
	//Get the ship's information 
	public String toString(){
		return "Weight in tons: " + weightInTons + "\nCapacity: " + capacity + "\nNumber of passengers: " + numberOfPassengers + "\nSurface area: "
			   + surfaceAreaInMeters + "\nYear built: " + yearBuilt + "\n";
	}
	
}