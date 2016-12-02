/*David Koller
 * Assignment 9
 * State Pattern
 * 
 *  In Flight State
 */
public class InFlight implements State {
	AirPlane ap;
	public InFlight(AirPlane airPlane) {  
	      this.ap = airPlane;  
	      }  
	public void Land() {
		System.out.println("Landing Plane");
		ap.setState(ap.getTaxiing());
	}

	@Override
	public void driveToGate() {
		System.out.println("Cannot drive to gate: in flight");
	}

	@Override
	public void leaveGarage() {
		System.out.println("Cannot leaveGarage: in flight");
		
	}

	@Override
	public void leaveGate() {
		System.out.println("Cannot Leave Gate: in flight");
		
	}

	@Override
	public void returnGarage() {
		System.out.println("Cannot return to Garage: in flight ");
	}

	@Override
	public void takeOff() {
		System.out.println("Cannot takeOff: in flight");
	}
	public String toString() {  
        return "in flight";  
    }  
}
