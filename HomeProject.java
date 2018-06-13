
public class HomeProject {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			AirCraft cessna172 = new AirCraft (4, 140, 56.6, 9.5);        //creates object of class AirCraft
	        
	        AirCraft piperSaratoga = new AirCraft(6, 201, 102.5, 20.5);    // creates object of class Aircraft
	        
	        AirCraft aeroncaChief = new AirCraft (2, 85, 15.1, 4.5);
	     
	        System.out.println("Cessna 172 passengers: " + cessna172.passengers);
	        System.out.println("\nCessna 172 fuel burn rate: " + cessna172.fuelBurnRate + " gph");
		
	        System.out.println("\nCessna 172 Endurance is: " + cessna172.calculateEndurance());
	        
	        double enduranceSaratoga = piperSaratoga.calculateEndurance();
	        
	        System.out.println("\nPiper Saratoga Endurance is " + enduranceSaratoga);
		
	        System.out.println("\nFor Cessna127 to fly for 4.2 hours, it takes " + cessna172.fuelNeeded(4.2) + " gallons of fuel.");
	        
	        System.out.println("\nFor Piper Saratoga to fly for 7 hours it takes " +piperSaratoga.fuelNeeded(7) + " gallons of fuel.");
		
	        System.out.println("\nAeronca Chief passengers: " + aeroncaChief.passengers);
	        
	        System.out.println("\nAeronca Chief fuel burn rate: " + aeroncaChief.fuelBurnRate + " gph");
	        
	        double enduranceChief = aeroncaChief.calculateEndurance();
	        System.out.println("\nAeronca Chief Endurance is " + enduranceChief);
		
	        System.out.println("\nFor Aeronca chief to fly for 5.5 hours it takes " + aeroncaChief.fuelNeeded(5.5) + " gallons of fuel.");
		}	
	}

class AirCraft {                //a class is just a template
    
	// This could be set to private and called by a setter and getter method that is called encapsulation, for a home project like this public is all right. 
	int 	passengers;             //number of people
	int 	cruiseSpeed;            //miles per hour
	double  fuelCapacity;        	//gallons
	double  fuelBurnRate;        	//gallons per hour


 AirCraft(int p, int c, double fc, double fbr){
	 //This is a constructor
	 passengers = p; 
	 cruiseSpeed = c; 
	 fuelCapacity = fc; 
	 fuelBurnRate = fbr; 
 }
 
 //Method to calculate aircraft endurance
 
 double calculateEndurance() {
	 
 double endurance;
 
 endurance = fuelCapacity / fuelBurnRate;
 
 return endurance;
 
 }
 
 //Method to calculate how much fuel needed per hour//
 
 double fuelNeeded(double time) {
	return	fuelBurnRate * time; 
 }

}

