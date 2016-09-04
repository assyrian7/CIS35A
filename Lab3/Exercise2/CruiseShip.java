/*
*	Paul Badalian
*	CIS 35A 61Z
*	Lab 3 Exercise 2
*	Due: 7/15/16
*	Submitted: 7/15/16 
*/
public class CruiseShip extends Ship{
	
	private String[] destinations; //Store the ship's tourist destinations
	
	public CruiseShip(double weightInTons, int capacity, int numberOfPassengers, double surfaceAreaInMeters, int yearBuilt, String[] destinations){
		super(weightInTons, capacity, numberOfPassengers, surfaceAreaInMeters, yearBuilt);
		this.destinations = destinations;
	}
	
	//Set the ship's tourist destinations
	public void setDestinations(String[] destinations){
		this.destinations = destinations;
	}
	
	//Get the ship's tourist destinations
	public String[] getDestinations(){
		return destinations;
	}
	//Get the ship's information
	public String toString(){
		String result = super.toString() + "\nType: cruise ship" + "\nDestinations: " + destinations[0];
		for(int i = 1; i < destinations.length; i++){
			result += ", ";
			result += destinations[i];
		}
		result += "\n";
		return result;
	}
	
}