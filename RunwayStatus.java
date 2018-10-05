public enum RunwayStatus { // declare special enum class, used to discribe the situation on the runway
		IDLE, LAND, TAKEOFF
	}
	class RunwayStatusTest {
		RunwayStatus status;
		
		public RunwayStatusTest (RunwayStatus status){
			this.status = status;
		}
		
		public void TellRunwayStatus () { // tells the runway status by using different cases
			switch (status) {
			case IDLE: // message if runway is idle
				System.out.println("Nothing is going on the runway!");
				break;
			
			case LAND: // message if a plane is landing 
				System.out.println("A plane is landing!");
				break;
			
			case TAKEOFF: // message if a plane is taking off
				System.out.println("a plane is taking off!");
			}
		}
	}
