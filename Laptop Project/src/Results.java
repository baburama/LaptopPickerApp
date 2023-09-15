// Library imports 
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/* Name: Winnie Li
 * Date: May 14th, 2022
 * Teacher: Mr. Lee
 * Course: ICS3U1
 * Description: Reads the results from the survey class and displays the top 3 laptop's general description/specs on a GUI screen
 * Major skills:
 * - using JLabels, and setting bounds for text and images 
 * - adding images to a JLabel
 * - receiving information from another class' array
 */

public class Results extends JFrame implements ActionListener {

	// background image
	JLabel background = new JLabel(new ImageIcon("data/resultsBackground.jpg"));

	// first, second and third place images
	JLabel firstPlace = new JLabel(new ImageIcon("data/firstplace.jpg"));
	JLabel secondPlace = new JLabel(new ImageIcon("data/secondplace.jpg"));
	JLabel thirdPlace = new JLabel(new ImageIcon("data/thirdplace.jpg"));

	// Title of the GUI screen
	JLabel title = new JLabel("TOP 3 LAPTOP RECOMMENDATIONS");

	// SPECS subtitles
	JLabel specs1 = new JLabel("SPECS==============");
	JLabel specs2 = new JLabel("SPECS==============");
	JLabel specs3 = new JLabel("SPECS==============");

	// Text-only labels for the information about the first recommended laptop
	JLabel laptopBrand1 = new JLabel(laptopStoreSurveyFrame.laptopSelectionList.get(0).getBrand());
	JLabel laptopModel1 = new JLabel(laptopStoreSurveyFrame.laptopSelectionList.get(0).getModel());
	JLabel laptopPrice1 = new JLabel("$" + (laptopStoreSurveyFrame.laptopSelectionList.get(0).getPrice()));
	JLabel laptopType1 = new JLabel((laptopStoreSurveyFrame.laptopSelectionList.get(0).getType()) + " Laptop");

	JLabel laptopBrand2 = new JLabel(laptopStoreSurveyFrame.laptopSelectionList.get(1).getBrand());
	JLabel laptopModel2 = new JLabel(laptopStoreSurveyFrame.laptopSelectionList.get(1).getModel());
	JLabel laptopPrice2 = new JLabel("$" + (laptopStoreSurveyFrame.laptopSelectionList.get(1).getPrice()));
	JLabel laptopType2 = new JLabel((laptopStoreSurveyFrame.laptopSelectionList.get(1).getType()) + " Laptop");

	JLabel laptopBrand3 = new JLabel(laptopStoreSurveyFrame.laptopSelectionList.get(2).getBrand());
	JLabel laptopModel3 = new JLabel(laptopStoreSurveyFrame.laptopSelectionList.get(2).getModel());
	JLabel laptopPrice3 = new JLabel("$" + (laptopStoreSurveyFrame.laptopSelectionList.get(2).getPrice()));
	JLabel laptopType3 = new JLabel((laptopStoreSurveyFrame.laptopSelectionList.get(2).getType()) + " Laptop");

	// Text-only labels under the SPECS subtitle
	JLabel laptopDisplaySize1 = new JLabel(
			"Display Size: " + (laptopStoreSurveyFrame.laptopSelectionList.get(0).getDisplaySize()) + " inches");
	JLabel laptopSsd1 = new JLabel("Storage: " + (laptopStoreSurveyFrame.laptopSelectionList.get(0).getSsd()) + "Gb");
	JLabel laptopRam1 = new JLabel("RAM: " + (laptopStoreSurveyFrame.laptopSelectionList.get(0).getRam()) + "Gb");
	JLabel laptopOperatingSystem1 = new JLabel(
			"Operating System: " + (laptopStoreSurveyFrame.laptopSelectionList.get(0).getOperatingSystem()));

	JLabel laptopDisplaySize2 = new JLabel(
			"Display Size: " + (laptopStoreSurveyFrame.laptopSelectionList.get(1).getDisplaySize()) + " inches");
	JLabel laptopSsd2 = new JLabel("Storage: " + (laptopStoreSurveyFrame.laptopSelectionList.get(1).getSsd()) + "Gb");
	JLabel laptopRam2 = new JLabel("RAM: " + (laptopStoreSurveyFrame.laptopSelectionList.get(1).getRam()) + "Gb");
	JLabel laptopOperatingSystem2 = new JLabel(
			"Operating System: " + (laptopStoreSurveyFrame.laptopSelectionList.get(1).getOperatingSystem()));

	JLabel laptopDisplaySize3 = new JLabel(
			"Display Size: " + (laptopStoreSurveyFrame.laptopSelectionList.get(2).getDisplaySize()) + " inches");
	JLabel laptopSsd3 = new JLabel("Storage: " + (laptopStoreSurveyFrame.laptopSelectionList.get(2).getSsd()) + "Gb");
	JLabel laptopRam3 = new JLabel("RAM: " + (laptopStoreSurveyFrame.laptopSelectionList.get(2).getRam()) + "Gb");
	JLabel laptopOperatingSystem3 = new JLabel(
			"Operating System: " + (laptopStoreSurveyFrame.laptopSelectionList.get(2).getOperatingSystem()));

	public Results() {

		// screen size
		setSize(800, 600);

		// title of the top of the window bar
		setTitle("Laptop Store Results");

		// Clears the window background
		background.setLayout(null);

		firstPlace.setLayout(null);

		// Adding the description labels to the screen
		laptopBrand1.setBounds(50, 330, 300, 50);
		laptopBrand1.setFont(new Font("Verdana", Font.BOLD, 12));
		add(laptopBrand1);
		laptopModel1.setBounds(50, 350, 300, 50);
		laptopModel1.setFont(new Font("Verdana", Font.BOLD, 12));
		add(laptopModel1);
		laptopPrice1.setBounds(50, 370, 300, 50);
		laptopPrice1.setFont(new Font("Verdana", Font.ITALIC, 12));
		add(laptopPrice1);
		laptopType1.setBounds(50, 390, 300, 50);
		add(laptopType1);

		laptopBrand2.setBounds(300, 330, 300, 50);
		laptopBrand2.setFont(new Font("Verdana", Font.BOLD, 12));
		add(laptopBrand2);
		laptopModel2.setBounds(300, 350, 300, 50);
		laptopModel2.setFont(new Font("Verdana", Font.BOLD, 12));
		add(laptopModel2);
		laptopPrice2.setBounds(300, 370, 300, 50);
		laptopPrice2.setFont(new Font("Verdana", Font.ITALIC, 12));
		add(laptopPrice2);
		laptopType2.setBounds(300, 390, 300, 50);
		add(laptopType2);

		laptopBrand3.setBounds(545, 330, 300, 50);
		laptopBrand3.setFont(new Font("Verdana", Font.BOLD, 12));
		add(laptopBrand3);
		laptopModel3.setBounds(545, 350, 300, 50);
		laptopModel3.setFont(new Font("Verdana", Font.BOLD, 12));
		add(laptopModel3);
		laptopPrice3.setBounds(545, 370, 300, 50);
		laptopPrice3.setFont(new Font("Verdana", Font.ITALIC, 12));
		add(laptopPrice3);
		laptopType3.setBounds(545, 390, 300, 50);
		add(laptopType3);

		// Adding a few SPECS of the laptops to the screen
		laptopDisplaySize1.setBounds(50, 440, 300, 50);
		add(laptopDisplaySize1);
		laptopSsd1.setBounds(50, 460, 300, 50);
		add(laptopSsd1);
		laptopRam1.setBounds(50, 480, 300, 50);
		add(laptopRam1);
		laptopOperatingSystem1.setBounds(50, 500, 300, 50);
		add(laptopOperatingSystem1);

		laptopDisplaySize2.setBounds(300, 440, 300, 50);
		add(laptopDisplaySize2);
		laptopSsd2.setBounds(300, 460, 300, 50);
		add(laptopSsd2);
		laptopRam2.setBounds(300, 480, 300, 50);
		add(laptopRam2);
		laptopOperatingSystem2.setBounds(300, 500, 300, 50);
		add(laptopOperatingSystem2);

		laptopDisplaySize3.setBounds(545, 440, 300, 50);
		add(laptopDisplaySize3);
		laptopSsd3.setBounds(545, 460, 300, 50);
		add(laptopSsd3);
		laptopRam3.setBounds(545, 480, 300, 50);
		add(laptopRam3);
		laptopOperatingSystem3.setBounds(545, 500, 300, 50);
		add(laptopOperatingSystem3);

		// Position the title label centered at the top of the GUI
		title.setBounds(200, 50, 500, 50);
		title.setFont(new Font("Verdana", Font.BOLD, 20));
		add(title);

		// Position the SPECS subtitle
		specs1.setBounds(50, 420, 300, 50);
		specs1.setFont(new Font("Verdana", Font.BOLD, 12));
		add(specs1);
		specs2.setBounds(300, 420, 300, 50);
		specs2.setFont(new Font("Verdana", Font.BOLD, 12));
		add(specs2);
		specs3.setBounds(545, 420, 300, 50);
		specs3.setFont(new Font("Verdana", Font.BOLD, 12));
		add(specs3);

		// Adds the images of the first, second, and third metals for the top 3
		// recommended laptops
		add(firstPlace);
		firstPlace.setBounds(50, 90, 200, 300);
		firstPlace.setVisible(true);

		add(secondPlace);
		secondPlace.setBounds(300, 90, 200, 300);
		secondPlace.setVisible(true);

		add(thirdPlace);
		thirdPlace.setBounds(545, 90, 200, 300);
		thirdPlace.setVisible(true);

		// Adds the laptop store background image and enables it to be visible
		add(background);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
