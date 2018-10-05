import java.util.Random; // call on random from java library

public class Plane { // declare plane class
	// i tried to move all five like you told me to, but if i was to move this and add a string argument to the method below
	//like i did for the others, the array lists i set up in the simulation class become useless and my code falls apart :(
	static String planestatus[] = {"Departing", "Arriving", "No requests"}; // 1D array of strings that determine the plane status
																	
	private String ps; // private string for plane status thats needed in the constructor											
	
	public Plane () {	// constructor 
		
		ps = PickOne (planestatus); // uses private method "PickOne" to pick between the strings in the 1D array
		
	}
	
	private String PickOne (String [] choices) { // private method "PickOne" 
		Random rand = new Random ();
		return choices [rand.nextInt(choices.length)];
	}
	
	public String getFlightNumber(String fn) { // method to get the string for flight number
		return fn;
	}
	
	public String getArrivalTime(String at) { // method to get the string for arrival time
		return at;
	}
	
	public String getPlaneStatus () { // method to get the string for plane status
		return ps;
	}
	
	public String getRunwayStatus (String rw) { // method to get the string for runway status
		return rw;
	}
	
	public String getRunwayTemp (String rt) { // method to get the string for runway temperature 
		return rt;
	}
	
	public String getWindSpeed (String ws) { // method to get the string for wind speed
		return ws;
	}
	
}
