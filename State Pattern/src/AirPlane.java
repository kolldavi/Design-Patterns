/*David Koller
 * Assignment 9
 * State Pattern
 * 
 *  Air Plane Class
 */
public class AirPlane {
	  State inGarage;  
	    State taxiing;  
	    State atGate;  
	    State inFlight;  
	    
	    State state = inGarage;
public AirPlane()
{
	inGarage =  new InGarage(this);
	taxiing =  new Taxiing(this);
	atGate =  new AtGate(this);
	inFlight =  new InFlight(this);
	state = inGarage;
	
}
public void setState(State s)
{
	state = s;
}
public void leaveGarage()
{
	state.leaveGarage();
}
public void returnGarage()
{
	state.returnGarage();
}
public void takeOff()
{
	state.takeOff();
}
public void land()
{
	state.Land();
}
public void driveToGate()
{
	state.driveToGate();
}
public void leaveGate()
{
	state.leaveGate();
}
public State getInGarage() {  
    return inGarage;  
}  
public State getTaxiing() {  
    return taxiing;  
}  
public State getAtGate() {  
    return atGate;  
}  
public State getInFlight() {  
    return inFlight;  
}  
public String toString()
{
	return "The Current State is " + state;
}
}
