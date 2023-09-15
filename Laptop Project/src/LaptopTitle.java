// Name: Group 3 - Elliott Lai
// Date: May 4th, 2022
// Teacher: Mr. Lee
// Course: ICS3U1
// Description: Creates a GUI for the title frame of the online laptop store
// Major Skills: Using Java Swing GUI objects, such as JLabels and JButtons
// Import Java packages
import javax.swing.*;
import java.awt.event.*;

// Start of the LaptopTitle class
public class LaptopTitle extends JFrame implements ActionListener {
	
	//initialize frames
	public static laptopStoreSurveyFrame surveyFrame = new laptopStoreSurveyFrame();
	public static LaptopInventory laptopInventory =	new LaptopInventory();
	public static LaptopStoreEducationFrame educationFrame = new LaptopStoreEducationFrame();


	
	// Declare GUI objects
	JLabel background = new JLabel(new ImageIcon("data/store.jpg"));
	
	JLabel title = new JLabel("Laptop Store Menu");
	
	JButton inventoryButton = new JButton("Inventory");
	JButton surveyButton = new JButton("Survey");
	JButton educationButton = new JButton("Education");
	
	// Constructor method
	public LaptopTitle() {
		
		// Sets the window size to 800 px by 800 px and the title
		setSize(800, 600);
		setTitle("Laptop Store Menu");
		
		// Clears the window background
		background.setLayout(null);
		
		// Position the title label centered at the top of the GUI
		title.setBounds(350, 10, 200, 50);
		add(title);
		
		// Position the three buttons down the middle of the GUI
		inventoryButton.setBounds(350, 300, 100, 50);
		inventoryButton.addActionListener(this);
		add(inventoryButton);
		
		surveyButton.setBounds(350, 400, 100, 50);
		surveyButton.addActionListener(this);
		add(surveyButton);
		
		educationButton.setBounds(350, 500, 100, 50);
		educationButton.addActionListener(this);
		add(educationButton);
		
		// Adds the laptop store background image and enables it to be visible
		add(background);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//if survey button is clicked go to survey frame
		if( e.getSource() == surveyButton){
			setVisible(false);
			surveyFrame.setVisible(true);
		}
		else if(e.getSource() == inventoryButton) {
			setVisible(false);
			laptopInventory.setVisible(true);
		}
		else if(e.getSource() == educationButton) {
			setVisible(false);
			educationFrame.setVisible(true);
		}

		
	}

} // End of the LaptopTitle class