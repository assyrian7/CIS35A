/*
*	Paul Badalian
*	CIS 35A 61Z
*	Lab 3 Exercise 2
*	Due: 7/15/16
*	Submitted: 7/15/16 
*/
public class Main{
	
	public static void main(String[] args){
		//Array of different ships
		Ship[] ships = {new CargoShip(25000.0, 200, 50, 36000.0, 2001, 5000.0), new CruiseShip(19000.0, 1000, 800, 34000.0, 2014, new String[]{"Cancun, Florida", "Brazil"})};
		for(int i = 0; i < ships.length; i++){ //Check if ship is over occupied then display ship information
			if(ships[i].getNumberOfPassengers() > ships[i].getCapacity()){
				System.out.println("This ship is over occupied. " + (ships[i].getNumberOfPassengers() - ships[i].getCapacity()) + " passengers will be released.");
				ships[i].setNumberOfPassengers(ships[i].getCapacity());
			}
			System.out.println(ships[i]);
		}
	}
	
}
/* Output

Weight in tons: 25000.0
Capacity: 200
Number of passengers: 0
Surface area: 36000.0
Year built: 2001

Type: cargo ship
Cargo Weight: 5000.0

Weight in tons: 19000.0
Capacity: 1000
Number of passengers: 0
Surface area: 34000.0
Year built: 2014

Type: cruise ship
Destinations: Cancun, Florida, Brazil

*/ 