/*David Koller
 * Assignment 9
 * State Pattern
 * 
 *  Taxiing State
 */
public class Taxiing implements State{
	AirPlane ap;
	public Taxiing(AirPlane airPlane) {  
	      this.ap = airPlane;  
	      }  
	public void Land() {
		System.out.println("Cannot Land: not in air");
	}

	@Override
	public void driveToGate() {
		System.out.println("driving To Gate");
		ap.setState(ap.getAtGate());
	}

	@Override
	public void leaveGarage() {
		System.out.println("cannot Leave Garage: not in Garage");
		
	}

	@Override
	public void leaveGate() {
		System.out.println("not at Gate");
	}

	@Override
	public void returnGarage() {
		System.out.println("returnGarage");
		ap.setState(ap.getInGarage());
	}

	@Override
	public void takeOff() {
		System.out.println(" takeOff");
		ap.setState(ap.getInFlight());
	}
	public String toString() {  
        return "Taxiing";  
    }  
}