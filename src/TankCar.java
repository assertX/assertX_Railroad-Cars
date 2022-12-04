package assignment_8;

public class TankCar extends RailroadCar{
	
	// Data fields
	private double radius;
	
	// Constructors
	public TankCar() {} // Default constructor
	
	// Constructor with initial values
	public TankCar(double length, double radius) {
		setLength(length);
		this.radius = radius;
	}
	
	// Getter
	/**
	 * This will return the current value of radius
	 * @return: current value of radius
	 */
	public double getRadius() {return radius;}
	
	// Setter
	/**
	 * This will set the radius to the new value given
	 * @param radius: the new value given
	 */
	public void setRadius(double radius) { this.radius = radius; }
	
	
	
	
	
	// Methods
	
	/**
	 * This will calculate the volume of the current rail car.
	 * @return: will return the volume of a cylinder
	 */
	@Override
	public double volume() {
		double volume = 0;
		
		volume = Math.PI * Math.pow(radius, 2) * getLength();
		
		
		return volume;
	}

}
