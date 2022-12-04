package assignment_8;

public abstract class RailroadCar {
	
	// Data fields
	private double length;
	
	
	// Methods
	
	/**
	 * This will return the current length of the current rail car
	 * @return: the current length of rail car
	 */
	public double getLength() { return length; }
	
	/**
	 * This will set the length of the current rail car.
	 * @param length: the current length of rail car
	 */
	public void setLength(double length) { this.length = length; }
	
	/**
	 * This will return the volume of the current rail car
	 * @return: volume of rail car
	 */
	public abstract double volume();
}
