package decorator_pattern;

public abstract class Beverage {
	public enum Size {
	    TALL, GRANDEE, VENTIE 
	}
	String description = "Unknown Beverage";
	Size size = Size.TALL;
	
	public String getDescription(){
		return description;
	}
	public Size getSize() {
		return size;
		}
	
	public void setSize(Size size){
		this.size = size;
	}
	
	public abstract double cost();
}
