public class Runway {
	// the integer's professor Krishna gave us, i didn't use all of them due to the way i set up my program.
	int listlimit;
	int numlandingrequests; 
	int numtakeoffrequests; 
	int numlandings; 
	int numtakeoffs; 
	int numlandaccepted; 
	int numtakeoffaccepted; 
	int numlandrefused; 
	int numtakeoffrefused; 
	int landwait; 
	int takeoffwait; 
	int idletime; 
	// constructor and methods i set up in a way where i can easily access them in the simulation class, so i kept them simple
	// this is the only way of using them that made sense to me
	public Runway (int listlimit, int numlandingrequests, int numtakeoffrequests, int numlandings, int numtakeoffs
			,int numlandaccepted, int numtakeoffaccepted, int numlandrefused, int numtakeoffrefused, int landwait, int takeoffwait, int idletime){
		this.listlimit = listlimit;
		this.numlandingrequests = numlandingrequests;
		this.numtakeoffrequests = numtakeoffrequests;
		this.numlandings = numlandings;
		this.numtakeoffs = numtakeoffs;
		this.numlandaccepted = numlandaccepted;
		this.numtakeoffaccepted = numtakeoffaccepted;
		this.numlandrefused = numlandrefused;
		this.numtakeoffrefused = numtakeoffrefused;
		this.landwait = landwait;
		this.takeoffwait = takeoffwait;
		this.idletime = idletime;
		
		}
	
	public int getListLimit() {
		return listlimit;
		
	}
	
	public int getNumLandingRequests() {
		return numlandingrequests;
	}
	
	public int getNumTakeoffRequests() {
		return numtakeoffrequests;
	}
	
	public int getNumLandings() {
		return numlandings;
	}
	
	public int getNumTakeoffs() {
		return numtakeoffs;
	}
	
	public int getNumLandAccepted() {
		return numlandaccepted;
	}
	
	public int getNumTakeoffAccepted() {
		return numtakeoffaccepted;
	}
	
	public int getNumLandRefused() {
		return numlandrefused;
	}
	
	public int getNumtakeoffRefused() {
		return numtakeoffrefused;
	}
	
	public int LandWait() {
		return landwait;
	}
	
	public int TakeoffWait() {
		return takeoffwait;
	}
	
	public int Idletime() {
		return idletime;
	}
}
