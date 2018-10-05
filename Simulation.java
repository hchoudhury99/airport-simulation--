import java.util.ArrayList; // call on arraylist

public class Simulation { // declare class simulation
	public static void main (String [] args){ // main method
		
		ArrayList <Plane> landing = new ArrayList<Plane>(); // make array list landing
		ArrayList<Plane> takeoff = new ArrayList<Plane>();// make array list takeoff
		ArrayList<Plane> norequest = new ArrayList<Plane>();// make arraylist no request, i added this becuase i felt it makes the
		// process of keeping track of idle planes simple
		System.out.println("UNITED AIRLINES"); // my first airline
		Plane UNITEDAIRLINES = new Plane(); // declare new plane object unitedairlines
		System.out.println("The flight number is: " + UNITEDAIRLINES.getFlightNumber("1234"));
		System.out.println("The arrival time is: " + UNITEDAIRLINES.getArrivalTime("5:25 AM"));
		System.out.println("Is the plane arriving or departing?: " + UNITEDAIRLINES.getPlaneStatus());
		System.out.println("Whats the weather condition on the runway?: " + UNITEDAIRLINES.getRunwayStatus("Rainy"));
		System.out.println("Whats the temprature on the runway?: " + UNITEDAIRLINES.getRunwayTemp("60 degrees"));
		System.out.println("Whats the wind speed on the runway?: " + UNITEDAIRLINES.getWindSpeed("8 MPH"));
		if (UNITEDAIRLINES.getPlaneStatus() == "Arriving"){ // if the plane is arriving add to landing arraylist
			landing.add(UNITEDAIRLINES);
		}
		
		if (UNITEDAIRLINES.getPlaneStatus() == "Departing"){ // if plane is departing add to departing arraylist
			takeoff.add(UNITEDAIRLINES);
		}
		
		if (UNITEDAIRLINES.getPlaneStatus() == "No requests"){ // if plane is idle add to norequest arraylist
			norequest.add(UNITEDAIRLINES);
		}
		
		
		System.out.println("DELTA AIRLINES"); // my second airline
		Plane DELTAAIRLINES = new Plane();// declare new plane object deltaairlines
		System.out.println("The flight number is: " + DELTAAIRLINES.getFlightNumber("1357"));
		System.out.println("The arrival time is: " + DELTAAIRLINES.getArrivalTime("8:35 PM"));
		System.out.println("Is the plane arriving or departing?: " + DELTAAIRLINES.getPlaneStatus());
		System.out.println("Whats the weather condition on the runway?: " + DELTAAIRLINES.getRunwayStatus("Sunny"));
		System.out.println("Whats the temprature on the runway?: " + DELTAAIRLINES.getRunwayTemp("55 degrees"));
		System.out.println("Whats the wind speed on the runway?: " + DELTAAIRLINES.getWindSpeed("6 MPH"));
		if (DELTAAIRLINES.getPlaneStatus() == "Arriving"){
			landing.add(DELTAAIRLINES);
		}
		
		if (DELTAAIRLINES.getPlaneStatus() == "Departing"){
			takeoff.add(DELTAAIRLINES);
		}
		
		if (DELTAAIRLINES.getPlaneStatus() == "No requests"){
			norequest.add(DELTAAIRLINES);
		}
		
		System.out.println("AMERICAN AIRLINES"); // my third airline
		Plane AMERICANAIRLINES = new Plane(); // declare new plane object, americanairlines 
		System.out.println("The flight number is: " + AMERICANAIRLINES.getFlightNumber("1470"));
		System.out.println("The arrival time is: " + AMERICANAIRLINES.getArrivalTime("6:00 PM"));
		System.out.println("Is the plane arriving or departing?: " + AMERICANAIRLINES.getPlaneStatus());
		System.out.println("Whats the weather condition on the runway?: " + AMERICANAIRLINES.getRunwayStatus("Cloudy"));
		System.out.println("Whats the temprature on the runway?: " + AMERICANAIRLINES.getRunwayTemp("40 degrees"));
		System.out.println("Whats the wind speed on the runway?: " + AMERICANAIRLINES.getWindSpeed("3 MPH"));
		if (AMERICANAIRLINES.getPlaneStatus() == "Arriving"){
			landing.add(AMERICANAIRLINES);
		}
		
		if (AMERICANAIRLINES.getPlaneStatus() == "Departing"){
			takeoff.add(AMERICANAIRLINES);
		}
		
		if (AMERICANAIRLINES.getPlaneStatus() == "No requests"){
			norequest.add(AMERICANAIRLINES);
		}
		
		System.out.println("VIRGIN AIRLINES"); // my fourth airline
		Plane VERGINAIRLINES = new Plane(); // new plane object, verginairlines
		System.out.println("The flight number is: " + VERGINAIRLINES.getFlightNumber("1593"));
		System.out.println("The arrival time is: " + VERGINAIRLINES.getArrivalTime("1:00 AM"));
		System.out.println("Is the plane arriving or departing?: " + VERGINAIRLINES.getPlaneStatus());
		System.out.println("Whats the weather condition on the runway?: " + VERGINAIRLINES.getRunwayStatus("Snow-storm"));
		System.out.println("Whats the temprature on the runway?: " + VERGINAIRLINES.getRunwayTemp("30 degrees"));
		System.out.println("Whats the wind speed on the runway?: " + VERGINAIRLINES.getWindSpeed("10 MPH"));
		if (VERGINAIRLINES.getPlaneStatus() == "Arriving"){
			landing.add(VERGINAIRLINES);
		}
		
		if (VERGINAIRLINES.getPlaneStatus() == "Departing"){
			takeoff.add(VERGINAIRLINES);
		}
		
		if (VERGINAIRLINES.getPlaneStatus() == "No requests"){
			norequest.add(VERGINAIRLINES);
		}
		
		int amt = landing.size(); // amt is the integer value of the airlines in arraylist landing
		if (amt != 0 ){ // if landing list isn't empty, cant take off yet
			System.out.println("Sorry the landing list is not empty, you need to wait to takeoff!");
			RunwayStatusTest land = new RunwayStatusTest (RunwayStatus.LAND); // used enum for description
			land.TellRunwayStatus();
		}
		
		int amt2 = norequest.size(); // amt2 is the integer value of the airlines in arraylist norequests
		if (amt == 0 && amt2 < 4){ // if landing is empty and not all planes are norequests, can take off
			System.out.println("The landing list is empty, you can take off!");
			RunwayStatusTest takeoff1 = new RunwayStatusTest (RunwayStatus.TAKEOFF);// enum again
			takeoff1.TellRunwayStatus();
		}
		
		if (amt >= 4){ // since the listlimit is 4, if amt (landing) is 4 or greater, they cant land
			System.out.println("Sorry, please go to the next airport! Goes over list limit!");
		}
		
		int amt3 = takeoff.size(); // amt3 is the integer value of the airlines in arraylist takeoff
		if (amt3 >= 4){ // if number of planes to takeoff is equal to 4, they cant take off yet 
			System.out.println("sorry you cant takeoff yet, please wait! Goes over list limit!");
		}
		
		if (amt3 == 4){ // if all the planes the idle, use enum to display that the runway is idle
			RunwayStatusTest idle = new RunwayStatusTest (RunwayStatus.IDLE);
			idle.TellRunwayStatus();
			
		}
		
		
		
		Runway runway = new Runway (4, amt, amt3, 0, 0, 0, 0, 0, 0, 0, 0, amt2); // declare new runway object, runway
		// i kept alot of them at 0 because i wont be using them
		System.out.println("The listlimit is: " + runway.getListLimit()); // list limit is four
		System.out.println("The number of takeoff request is: " + runway.getNumTakeoffRequests()); // get takeoff requests
		System.out.println("The number of landing request is: " + runway.getNumLandingRequests()); // get landing requests
		System.out.println("The total number of idle planes is: " + runway.Idletime()); // get number of idle planes
	}
	
}
