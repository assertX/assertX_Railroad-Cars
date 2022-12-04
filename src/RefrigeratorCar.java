package assignment_8;

public class RefrigeratorCar extends BoxCar{
	
	// Data fields
	private int temperature;
	
	// Constructors
	public RefrigeratorCar() {} // Default constructor
	
	// Constructor with initial values
	public RefrigeratorCar(double length, double width, double height, int temperature) {
		setLength(length);
		setWidth(width);
		setHeight(height);
		this.temperature = temperature;
	}
	
	// Getter
	
	/**
	 * Returns the refrigerator car's temperature
	 * @return: the current temperature
	 */
	public int getTemperature() {
		return temperature;
	}
	
	// Setter
	
	/**
	 * This will set the temperature value of the refrigerator car
	 * @param temperature: current temperature
	 */
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	

}
