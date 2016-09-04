/*
*	Paul Badalian
*	CIS 35A 61Z
*	Lab 3 Exercise 2
*	Due: 7/15/16
*	Submitted: 7/15/16 
*/
public class CargoShip extends Ship{
	
	private double totalWeightOfCargoInTons; //Store the total cargo weight of the ship
	
	public CargoShip(double weightInTons, int capacity, int numberOfPassengers, double surfaceAreaInMeters, int yearBuilt, double totalWeightOfCargoInTons){
	    super(weightInTons, capacity, numberOfPassengers, surfaceAreaInMeters, yearBuilt);
		this.totalWeightOfCargoInTons = totalWeightOfCargoInTons;
	}
	
	//Set the total cargo weight
	public void setTotalWeightOfCargoInTons(double totalWeightOfCargoInTons){
		this.totalWeightOfCargoInTons = totalWeightOfCargoInTons;
	}
	
	//Get the total cargo weight
	public double getTotalWeightOfCargoInTons(){
		return totalWeightOfCargoInTons;
	}
	//Get the ship's information
	public String toString(){
		return super.toString() + "\nType: cargo ship" + "\nCargo Weight: " + totalWeightOfCargoInTons + "\n";
	}
	
}