// Name: Group 3 - Elliott Lai
// Date: May 7th, 2022
// Teacher: Mr. Lee
// Course: ICS3U1
// Description: Creates a functional GUI for the inventory of the online laptop store
// Major Skils: Using arrays and other Java GUI objects, such as JList and JScrollPane
// Area of Concern: All of the filter buttons for each of the categories prints results to the
// console, instead of to the GUI output screen like the sort buttons

// Import Java packages
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Comparator;

// Start of the LaptopInventory class
public class LaptopInventory extends JFrame implements ActionListener {
	
	// Declare GUI objects
	JLabel header = new JLabel("Laptop Inventory");
	JLabel brandHeader = new JLabel("Brand:");
	JLabel priceHeader = new JLabel("Price:");
	JLabel cpuBrandHeader = new JLabel("CPU Brand:");
	JLabel ramHeader = new JLabel("Ram(Gb):");
	JLabel ssdHeader = new JLabel("SSD(Gb):");
	
	JTextField brandTextField = new JTextField();
	JTextField cpuBrandTextField = new JTextField();
	JTextField ramTextField = new JTextField();
	JTextField ssdTextField = new JTextField();
	
	JButton brandFilterButton = new JButton("Filter");
	JButton brandSortButton = new JButton("Alphabetical Sort");
	JButton priceBudgetFilterButton = new JButton("< $500 Filter");
	JButton priceMidFilterButton = new JButton("$500-$1000 Filter");
	JButton priceHighFilterButton = new JButton("$1000-$2000 Filter");
	JButton priceUltraFilterButton = new JButton("$2000+ Filter");
	JButton priceSortButton = new JButton("Low to High Sort");
	JButton cpuBrandFilterButton = new JButton("Filter");
	JButton cpuBrandSortButton = new JButton("Alphabetical Sort");
	JButton ramFilterButton = new JButton("Filter");
	JButton ramSortButton = new JButton("Low to High Sort");
	JButton ssdFilterButton = new JButton("Filter");
	JButton ssdSortButton = new JButton("Low to High Sort");
	JButton backButton = new JButton("Back");
	
	JList<Laptop> list = new JList<>(laptopApplication.laptopArray);
	JScrollPane scrollPane = new JScrollPane(list);
	
	// Constructor method
	public LaptopInventory() {
		
		// Sets the window size to 800 px by 600 px and the title
		setSize(800, 600);
		setTitle("Laptop Inventory");
		
		// Create layout manager to position objects with coordinates
		setLayout(null);
		
		// Position the header label centered at the top of the GUI
		header.setBounds(350, 5, 200, 50);
		add(header);
		
		// Position the category header labels in a row near the top of the GUI
		brandHeader.setBounds(50, 50, 100, 50);
		add(brandHeader);
		priceHeader.setBounds(200, 50, 100, 50);
		add(priceHeader);
		cpuBrandHeader.setBounds(350, 50, 100, 50);
		add(cpuBrandHeader);
		ramHeader.setBounds(500, 50, 100, 50);
		add(ramHeader);
		ssdHeader.setBounds(650, 50, 100, 50);
		add(ssdHeader);
		
		// Position the text fields under their respective headers
		brandTextField.setBounds(50, 85, 50, 25);
		add(brandTextField);
		cpuBrandTextField.setBounds(350, 85, 50, 25);
		add(cpuBrandTextField);
		ramTextField.setBounds(500, 85, 50, 25);
		add(ramTextField);
		ssdTextField.setBounds(650, 85, 50, 25);
		add(ssdTextField);
		
		// Position the filter and sort buttons under their respective headers
		brandFilterButton.setBounds(100, 85, 85, 25);
		brandFilterButton.addActionListener(this);
		add(brandFilterButton);
		brandSortButton.setBounds(50, 115, 135, 25);
		brandSortButton.addActionListener(this);
		add(brandSortButton);
		
		priceBudgetFilterButton.setBounds(200, 85, 135, 25);
		priceBudgetFilterButton.addActionListener(this);
		add(priceBudgetFilterButton);
		priceMidFilterButton.setBounds(200, 115, 135, 25);
		priceMidFilterButton.addActionListener(this);
		add(priceMidFilterButton);
		priceHighFilterButton.setBounds(200, 145, 135, 25);
		priceHighFilterButton.addActionListener(this);
		add(priceHighFilterButton);
		priceUltraFilterButton.setBounds(200, 175, 135, 25);
		priceUltraFilterButton.addActionListener(this);
		add(priceUltraFilterButton);
		priceSortButton.setBounds(200, 205, 135, 25);
		priceSortButton.addActionListener(this);
		add(priceSortButton);
		
		cpuBrandFilterButton.setBounds(400, 85, 85, 25);
		cpuBrandFilterButton.addActionListener(this);
		add(cpuBrandFilterButton);
		cpuBrandSortButton.setBounds(350, 115, 135, 25);
		cpuBrandSortButton.addActionListener(this);
		add(cpuBrandSortButton);
		
		ramFilterButton.setBounds(550, 85, 85, 25);
		ramFilterButton.addActionListener(this);
		add(ramFilterButton);
		ramSortButton.setBounds(500, 115, 135, 25);
		ramSortButton.addActionListener(this);
		add(ramSortButton);
		
		ssdFilterButton.setBounds(700, 85, 85, 25);
		ssdFilterButton.addActionListener(this);
		add(ssdFilterButton);
		ssdSortButton.setBounds(650, 115, 135, 25);
		ssdSortButton.addActionListener(this);
		add(ssdSortButton);
		
		backButton.setBounds(5, 5, 85, 25);
		backButton.addActionListener(this);
		add(backButton);
		
//		list.setBounds(50, 235, 700, 315);
//		add(list);
		
		// Sets up the vertical and horizontal scroll bars for the JScrollPane
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		scrollPane.setBounds(50, 235, 700, 315);
		add(scrollPane);
		
		// Enables everything to be visible
		setVisible(false);
		
	} // End of the constructor method
	
	// Method to display all 40 laptops within laptopArray for any sorting operations
	public void displayLaptopArray() {
		
//		DefaultListModel<LaptopObject> listmodel = new DefaultListModel<LaptopObject>();
//		list.getModel();
//		listmodel.removeAllElements();
		list.setVisible(false);
		list.setVisible(true);
		
	} // End of the displayLaptopArray method
	
	// Method to clear the console output
	public void clearConsole() {
		// Uses a for loop to print 10 blank lines
		for(int x = 0; x < 10; x++) {
			System.out.println("");
		}
	} // End of the clearConsole method
	
	// This method manages the actions during the running of the application
	public void actionPerformed(ActionEvent event) {
		
		// Determines the source of the action, and performs the appropriate filter/sort
		// operation on the laptop array
		if(event.getSource() == brandFilterButton) {
			clearConsole();
			// Uses a for loop to iterate through the entire laptopArray, while checking and
			// printing the laptop if its brand matches the brand filter entry
			for(int x = 0; x < laptopApplication.laptopArray.length; x++) {
				if(laptopApplication.laptopArray[x].getBrand().equals(String.valueOf(brandTextField.getText()))) {
					System.out.println(laptopApplication.laptopArray[x].getBrand() + " " +
					laptopApplication.laptopArray[x].getModel() + " - $" + laptopApplication.laptopArray[x].getPrice());
				}
			} // End of the for loop	
		}
		
		if(event.getSource() == brandSortButton) {
			// Sorts laptopArray based on alphabetical order of the brand names
			Arrays.sort(laptopApplication.laptopArray, Comparator.comparing(Laptop::getBrand));
			displayLaptopArray();
		}
		
		if(event.getSource() == priceBudgetFilterButton) {
			clearConsole();
			// Uses a for loop to iterate through the entire laptopArray, while checking and
			// printing the laptop if its price is below $500
			for(int x = 0; x < laptopApplication.laptopArray.length; x++) {
				if(laptopApplication.laptopArray[x].getPrice() < 500) {
					System.out.println(laptopApplication.laptopArray[x].getBrand() + " " +
					laptopApplication.laptopArray[x].getModel() + " - $" + laptopApplication.laptopArray[x].getPrice());
				}
			} // End of the for loop
		}
		
		if(event.getSource() == priceMidFilterButton) {
			clearConsole();
			for(int x = 0; x < laptopApplication.laptopArray.length; x++) {
				if(laptopApplication.laptopArray[x].getPrice() >= 500 && laptopApplication.laptopArray[x].getPrice() < 1000) {
					System.out.println(laptopApplication.laptopArray[x].getBrand() + " " +
					laptopApplication.laptopArray[x].getModel() + " - $" + laptopApplication.laptopArray[x].getPrice());
				}
			} // End of the for loop
		}
		
		if(event.getSource() == priceHighFilterButton) {
			clearConsole();
			for(int x = 0; x < laptopApplication.laptopArray.length; x++) {
				if(laptopApplication.laptopArray[x].getPrice() >= 1000 && laptopApplication.laptopArray[x].getPrice() < 2000) {
					System.out.println(laptopApplication.laptopArray[x].getBrand() + " " +
					laptopApplication.laptopArray[x].getModel() + " - $" + laptopApplication.laptopArray[x].getPrice());
				}
			} // End of the for loop
		}
		
		if(event.getSource() == priceUltraFilterButton) {
			clearConsole();
			for(int x = 0; x < laptopApplication.laptopArray.length; x++) {
				if(laptopApplication.laptopArray[x].getPrice() >= 2000) {
					System.out.println(laptopApplication.laptopArray[x].getBrand() + " " +
					laptopApplication.laptopArray[x].getModel() + " - $" + laptopApplication.laptopArray[x].getPrice());
				}
			} // End of the for loop
		}
		
		if(event.getSource() == priceSortButton) {
			// Sorts laptopArray based on price order from lowest to highest
			Arrays.sort(laptopApplication.laptopArray, Comparator.comparing(Laptop::getPrice));
			displayLaptopArray();
		}
		
		if(event.getSource() == cpuBrandFilterButton) {
			clearConsole();
			// Uses a for loop to iterate through the entire laptopArray, while checking and
			// printing the laptop if its CPU brand matches the CPU brand filter entry
			for(int x = 0; x < laptopApplication.laptopArray.length; x++) {
				if(laptopApplication.laptopArray[x].getCpuBrand().equals(String.valueOf(cpuBrandTextField.getText()))) {
					System.out.println(laptopApplication.laptopArray[x].getBrand() + " " +
					laptopApplication.laptopArray[x].getModel() + " - $" + laptopApplication.laptopArray[x].getPrice());
				}
			} // End of the for loop
		}
		
		if(event.getSource() == cpuBrandSortButton) {
			// Sorts laptopArray based on alphabetical order of CPU brand names
			Arrays.sort(laptopApplication.laptopArray, Comparator.comparing(Laptop::getCpuBrand));
			displayLaptopArray();
		}
		
		if(event.getSource() == ramFilterButton) {
			clearConsole();
			// Uses a for loop to iterate through the entire laptopArray, while checking and
			// printing the laptop if its Ram matches the Ram filter entry
			for(int x = 0; x < laptopApplication.laptopArray.length; x++) {
				if(laptopApplication.laptopArray[x].getRam() == Integer.valueOf(ramTextField.getText())) {
					System.out.println(laptopApplication.laptopArray[x].getBrand() + " " +
					laptopApplication.laptopArray[x].getModel() + " - $" + laptopApplication.laptopArray[x].getPrice());
				}
			} // End of the for loop
		}
		
		if(event.getSource() == ramSortButton) {
			// Sorts laptopArray based on amount of Ram from lowest to highest
			Arrays.sort(laptopApplication.laptopArray, Comparator.comparing(Laptop::getRam));
			displayLaptopArray();
		}
		
		if(event.getSource() == ssdFilterButton) {
			clearConsole();
			// Uses a for loop to iterate through the entire laptopArray, while checking and
			// printing the laptop if its SSD matches the SSD filter entry
			for(int x = 0; x < laptopApplication.laptopArray.length; x++) {
				if(laptopApplication.laptopArray[x].getSsd() == Integer.valueOf(ssdTextField.getText())) {
					System.out.println(laptopApplication.laptopArray[x].getBrand() + " " +
					laptopApplication.laptopArray[x].getModel() + " - $" + laptopApplication.laptopArray[x].getPrice());
				}
			} // End of the for loop
		}
		
		if(event.getSource() == ssdSortButton) {
			// Sorts laptopArray based on amount of SSD from lowest to highest
			Arrays.sort(laptopApplication.laptopArray, Comparator.comparing(Laptop::getSsd));
			displayLaptopArray();
		}
		
		if(event.getSource() == backButton) {
			setVisible(false);
			laptopApplication.titleFrame.setVisible(true);
		}
		
	}

} // End of the LaptopInventory class
