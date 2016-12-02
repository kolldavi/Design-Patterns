/*David Koller
 * Assignment 9
 * State Pattern
 * 
 *  At Gate State
 */
public class AtGate implements State{
	AirPlane ap;
	public AtGate(AirPlane airPlane) {  
	      this.ap = airPlane;  
	      }  
	public void Land() {
		System.out.println("Cannot Land: not in air");
	}

	@Override
	public void driveToGate() {
		System.out.println("Cannot drive to gate: already at gate");
	}

	@Override
	public void leaveGarage() {
		System.out.println("Cannot Leave Garage: not in Garage");
		
	}

	@Override
	public void leaveGate() {
		System.out.println("Leaving Gate: enter Taxiing mode");
		ap.setState(ap.getTaxiing());
		
	}

	@Override
	public void returnGarage() {
		System.out.println("Cannot return to Garage: not moving ");
	}

	@Override
	public void takeOff() {
		System.out.println("Cannot takeOff: at Gate");
	}
	public String toString() {  
        return "at Gate";  
    }  
}
