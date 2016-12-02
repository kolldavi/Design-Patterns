/*David Koller
 * Assignment 9
 * State Pattern
 * 
 *  In Garage State
 */
public class InGarage implements State{
	AirPlane ap;
	public InGarage(AirPlane airPlane) {  
	      this.ap = airPlane;  
	      }  
	@Override
	public void Land() {
		System.out.println("Cannot Land: not in air");
	}

	@Override
	public void driveToGate() {
		System.out.println("Cannot drive to gate: need to be taxiing");
	}

	@Override
	public void leaveGarage() {
		System.out.println("Leaving Garage: enter Taxiing mode");
		ap.setState(ap.getTaxiing());
		
	}

	@Override
	public void leaveGate() {
		System.out.println("Cannot Leave Gate: not at Gate");
		
	}

	@Override
	public void returnGarage() {
		System.out.println("Cannot return to Garage: already in it ");
	}

	@Override
	public void takeOff() {
		System.out.println("Cannot takeOff: In Garage");
	}
	public String toString() {  
        return "In Garage";  
    }  
}
