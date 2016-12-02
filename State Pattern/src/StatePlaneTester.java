/*David Koller
 * Assignment 9
 * State Pattern
 * 
 *  Tester
 */
public class StatePlaneTester {

	public static void main(String[] args) {
		AirPlane airplane =  new AirPlane();
		

		System.out.println(airplane);
		
		airplane.leaveGarage();
		airplane.driveToGate();
		airplane.getInFlight();
		airplane.takeOff();
		System.out.println(airplane); 
		airplane.takeOff();
		airplane.leaveGate();
		airplane.takeOff();
		System.out.println(airplane);
		airplane.returnGarage();
		airplane.land();
		airplane.returnGarage();
		System.out.println(airplane);
	}

}
