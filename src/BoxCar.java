package assignment_8;

public class BoxCar extends RailroadCar{
	
	// Data fields
	private double width;
	private double height;
	
	// Constructors
	public BoxCar () {} // Default Constructor
	
	// Constructor with initial values
	public BoxCar (double length, double width, double height) {
		setLength(length);
		this.width = width;
		this.height = height;
	}
	
	// Getters
	
	/**
	 * This will return the current width of the rail car
	 * @return: current width of rail car
	 */
	public double getWidth() {
		return width;
	}
	
	/**
	 * This will return the current height of the rail car
	 * @return: current height of rail car
	 */
	public double getHeight() {
		return height;
	}
	
	// Setters
	
	/**
	 * This will set the width of the rail car
	 * @param width: current width of rail car
	 */
	public void setWidth (double width) {
		this.width = width;
	}
	
	/**
	 * This will set the height of the rail car
	 * @param height: current height of rail car
	 */
	public void setHeight (double height) {
		this.height = height;
	}
	
	/**
	 * This will calculate the volume of the current rail car.
	 * @return: will return the volume of a cube
	 */
	@Override
	public double volume() {
		double volume = 0;
		
		volume = getLength() * width * height;
		return volume;
	}

}
