// Name: Winnie Li 
// Group 3 
// Date: May 5th, 2022
// Teacher: Mr. Lee
// Course: ICS3U1
// Description: Reads the laptop store data from the comma-separated file, and adds it into an array
// Major skills: 
// - ‘Try-catch’ block (similar to ‘if-else’) to attempt to access the text file
// - The delimiter is set to determine how to proceed through the file
// - When all the lines have been processed the file is closed for future access.

// Import libraries
import java.io.*;
import java.util.Scanner;

// Start of the FileInput class
public class FileInput {

	// Declare and create the array
	// Array is already in the laptopApplication class thus it is unnecessary to
	// include here
	// public static LaptopObject[] laptopArray = new LaptopObject[40];

	// Start of the FileInput method
	public FileInput() {

		try {

			// Scanner object
			Scanner inputFile = new Scanner(new File("./data/laptops.csv"));

			// how to read the csv file
			inputFile.useDelimiter(",|\r\n");

			for (int index = 0; index < laptopApplication.laptopArray.length; index++) {

				// variables
				String brand = inputFile.next();
				String model = inputFile.next();
				String type = inputFile.next();
				double price = inputFile.nextDouble();
				String cpuBrand = inputFile.next();
				String cpuType = inputFile.next();
				String cpuModel = inputFile.next();
				int cpuCores = inputFile.nextInt();
				double cpuSpeed = inputFile.nextDouble();
				int ram = inputFile.nextInt();
				int ssd = inputFile.nextInt();
				String gpuBrand = inputFile.next();
				String gpuModel = inputFile.next();
				int usbPorts = inputFile.nextInt();
				String operatingSystem = inputFile.next();
				double displaySize = inputFile.nextDouble();
				int resolutionWidth = inputFile.nextInt();
				int resolutionHeight = inputFile.nextInt();
				boolean touchscreen = inputFile.nextBoolean();
				double weight = inputFile.nextDouble();
				int qualityRating = inputFile.nextInt();
				int speedRating = inputFile.nextInt();
				int memoryRating = inputFile.nextInt();
				int displayRating = inputFile.nextInt();
				String hyperlink = inputFile.next();

				// fill the array with the info from the csv file
				laptopApplication.laptopArray[index] = new Laptop(brand, model, type, price, cpuBrand, cpuType,
						cpuModel, cpuCores, cpuSpeed, ram, ssd, gpuBrand, gpuModel, usbPorts, operatingSystem,
						displaySize, resolutionWidth, resolutionHeight, touchscreen, weight, qualityRating, speedRating,
						memoryRating, displayRating, hyperlink);
			}

			// closes this file input stream
			inputFile.close();

		} catch (FileNotFoundException e) {
			System.out.println("File Error");
		}

	} // End of the FileInput method

} // End of the FileInput class
