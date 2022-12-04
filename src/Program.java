package assignment_8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



public class Program {
	public static void main(String[] args) throws IOException {
		
		// Open files, the scanner, and writer.
		FileInputStream inputFile = new FileInputStream("cars.txt");
		Scanner scanner = new Scanner(inputFile);
		FileOutputStream outputFile = new FileOutputStream("volumes.txt");
		PrintWriter writer = new PrintWriter(outputFile);
		
		// Create 1 object, which is null.
		RailroadCar railCar;
				
		// Loop through the input file.
		while (scanner.hasNext()) {
			String carType = scanner.next();
			double length = scanner.nextDouble();
			
			
			// Sets the values for the BoxCar volume
			if (carType.equals("Box")) {
				railCar = new BoxCar();
				BoxCar boxCar =  ((BoxCar) railCar);
				
				boxCar.setWidth(scanner.nextDouble());
				boxCar.setHeight(scanner.nextDouble());
				
				
				
				
			}
			// Sets the values for the TankCar volume
			else if (carType.equals("Tank")) {
				railCar = new TankCar();
				TankCar tankCar = ((TankCar) railCar);
				
				tankCar.setRadius(scanner.nextDouble());
				
				
			    
			}
			// Sets the values for the RefrigeratorCar volume
			else {
				railCar = new RefrigeratorCar();
				RefrigeratorCar fridgeCar = ((RefrigeratorCar) railCar);
	
				fridgeCar.setWidth(scanner.nextDouble());
				fridgeCar.setHeight(scanner.nextDouble());
				fridgeCar.setTemperature(scanner.nextInt());
				
				
			}
			// Sets the length for the current rail car
			railCar.setLength(length);
			
			// Writes to the output file after every instance of the current rail car.
			writer.printf("%.2f\n", railCar.volume());
			
			
		}
		
		// Close files, scanner, and writer.
		writer.close();
		outputFile.close();
		scanner.close();
		inputFile.close();
	}
}
