/*
Group: Group 3
Class made by: Rupert Maiti
Teacher: Mr.Lee
Description: THis class creates the survey frame which lays out labels and radio buttons so user 
can select critera(ram, ssd etc) to find a laptop that best meets thier needs. When submit 
button is clicked, This class picks 3 best laptops for user send those loptops to results class
Note:Red,Green Blue buttons allows user to change background colour. This class also plays 
background music. If a user does not care about a specific criteria such as ram, simpily do not 
click any radio buttons for ram as this indicates that you do not care about ram.
If a laptop that does not meet all the users criteria cannot be found, this class will choose 
the 3 laptops that best fit their needs even if it might not be an exact match
Skills used: Swing library, actions listeners and playing music




*/
//imports

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.util.ArrayList;



public class laptopStoreSurveyFrame extends JFrame implements ActionListener {
	
	//title text
	static JLabel title = new JLabel("Laptop Picker survey");
	
	
	//labels for questions
	static JLabel priceQuestion = new JLabel("what is your price range?");
	static JLabel ramQuestion = new JLabel("How much ram is prefered?");
	static JLabel storageQuestion = new JLabel("How much storage do you need?");
	static JLabel brandQuestion = new JLabel("What is your prefered brand?");
	
	//label for dont care option
	static JLabel dontCareLabel = new JLabel("not answering question indicates that you dont care about that criteria");
	
	//radio buttons for price
	static JRadioButton $500 = new JRadioButton("less then $500");
	static JRadioButton $1000 = new JRadioButton("$500-$1000");
	static JRadioButton $2000 = new JRadioButton("$1000-$2000");
	static JRadioButton $2000Plus = new JRadioButton("$2000+");
	static ButtonGroup priceButtons = new ButtonGroup();
	
	//radio buttons for ram
	static JRadioButton gb4 = new JRadioButton("4GB");
	static JRadioButton gb8 = new JRadioButton("8GB");
	static JRadioButton gb16 = new JRadioButton("16GB");
	static JRadioButton gb32 = new JRadioButton("32GB");
	
	static ButtonGroup ramButtons = new ButtonGroup();
	
	//radio buttons for storage
	static JRadioButton ssd128Minus = new JRadioButton("less than 128 gb");
	static JRadioButton ssd128Plus = new JRadioButton("more than 128 gb");
	static JRadioButton ssd512Plus = new JRadioButton("more than 512 gb");
	static JRadioButton ssd1000Plus = new JRadioButton("more than 1tb");
	static ButtonGroup storageButtons = new ButtonGroup();
	
	//radio buttons for brand
	static JRadioButton Apple = new JRadioButton("Apple");
	static JRadioButton HP = new JRadioButton("Hp");
	static JRadioButton Dell = new JRadioButton("Dell");
	static JRadioButton Asus = new JRadioButton("Asus");
	static JRadioButton Acer = new JRadioButton("Acer");
	static JRadioButton dontCare = new JRadioButton("Dont Care");
	static ButtonGroup brandButtons = new ButtonGroup();
	
	 //variables for radio buttons selected by user
	static double maxPrice = 0;
	static int minimumRam = 0;
	static int minimumStorage = 0;
	static String brandChoice = "dontCare";
	
	//variables to store best laptop for user
	int laptopChoice1 = 1;
	int laptopChoice2 = 2;
	int laptopChoice = 3;
	
	//submit button
	static JButton submitButton = new JButton("Submit");
	
	//back button
	JButton backButton = new JButton("Back");
	
	//green,red and blue buttons
	static JButton greenButton = new JButton("green");
	static JButton blueButton = new JButton("blue");
	static JButton redButton = new JButton("red");
	
	
	//background colour 
	static Color backgroundColourBlue = new Color(135,206,250);
	static Color backgroundColourGreen = new Color(102,205,102);
	static Color backgroundColourRed = new Color(255,153,152);

	
	//make arraylist for the laptop selection process
	public static ArrayList<Laptop> laptopSelectionList = new ArrayList<Laptop>();
	
	public laptopStoreSurveyFrame() {
		
		//set size and name of frame
		setSize(800,600);
		setTitle("Survey");
	    getContentPane().setBackground(backgroundColourBlue );

		setLayout(null);	
		
		//add colour buttons
		add(greenButton);
		add(blueButton);
		add(redButton);
		greenButton.setBounds(30,100,100,50);
		blueButton.setBounds(30,160,100,50);
		redButton.setBounds(30,220,100,50);
		blueButton.addActionListener(this);
		greenButton.addActionListener(this);
		redButton.addActionListener(this);
		
		
		
		//add title to frame and place it 
		add(title);
		title.setBounds(200,10,500,50);
		title.setFont(new Font("Serif",Font.BOLD, 50));
		
		//add back button
		add(backButton);
		backButton.setBounds(600,200,100,50);
		backButton.addActionListener(this);
		
		//play background music
		 try
		    {
		        Clip clip = AudioSystem.getClip();
		        clip.open(AudioSystem.getAudioInputStream(new File("./data/song1.wav")));
		        clip.start();
		    }
		    catch (Exception exc)
		    {
		        exc.printStackTrace(System.out);
		    }
		 
		//Add labels for questions and set bounds
		add(priceQuestion);
		add(ramQuestion);
		add(storageQuestion);
		add(brandQuestion);
		
		//add don care label
		add(dontCareLabel);
		dontCareLabel.setBounds(30,250,500,60);
		dontCareLabel.setFont(new Font("Serif",Font.BOLD, 15));
		
		priceQuestion.setBounds(30,300,300,60);
		ramQuestion.setBounds(30,360,300,60);
		storageQuestion.setBounds(30,420,300,60);
		brandQuestion.setBounds(30,480,300,60);

		//add buttons for price question and place set bounds
		add($500);
		add($1000);
		add($2000);
		add($2000Plus);
		
		$500.setBounds(30,350,150,15);
		$1000.setBounds(200,350,150,15);
		$2000.setBounds(350,350,150,15);
		$2000Plus.setBounds(500,350,150,15);
		
		//add price buttons to group
		priceButtons.add($500);
		priceButtons.add($1000);
		priceButtons.add($2000);
		priceButtons.add($2000Plus);
		
		//add ram buttons and set bounds
		add(gb4);
		add(gb8);
		add(gb16);
		add(gb32);
		
		
		gb4.setBounds(30,420,60,15);
		gb8.setBounds(180,420,60,15);
		gb16.setBounds(330,420,60,15);
		gb32.setBounds(480,420,60,15);
		
		
		//add ram buttons to a group
		ramButtons.add(gb4);
		ramButtons.add(gb8);
		ramButtons.add(gb16);
		ramButtons.add(gb32);
		
		
		//add storage buttons 
		add(ssd128Minus);
		add(ssd128Plus);
		add(ssd512Plus);
		add(ssd1000Plus);
		
		ssd128Minus.setBounds(30,470,150,20);
		ssd128Plus.setBounds(230,470,150,20);
		ssd512Plus.setBounds(430,470,150,20);
		ssd1000Plus.setBounds(630,470,150,20);

		//add storage buttons to a group
		storageButtons.add(ssd128Minus);
		storageButtons.add(ssd128Plus);
		storageButtons.add(ssd512Plus);
		storageButtons.add(ssd1000Plus);
		
		//add brand buttons and set bounds
		add(Apple);
		add(HP);
		add(Dell);
		add(Asus);
		add(Acer);
		
		Apple.setBounds(30,520,100,20);		
		HP.setBounds(130,520,100,20);		
		Dell.setBounds(230,520,100,20);		
		Asus.setBounds(330,520,100,20);		
		Acer.setBounds(430,520,100,20);		
		
		//add brand buttons to group
		brandButtons.add(Apple);
		brandButtons.add(HP);
		brandButtons.add(Dell);
		brandButtons.add(Asus);
		brandButtons.add(Acer);

		
		//add submit button and set bounds
		add(submitButton);
		submitButton.setBounds(650,320,100,70);
		//add action listener to button
		submitButton.addActionListener(this);
		
		// fill laptop selection array
		fillLaptopSelectionArray();
		
		//make frame visible
		//setVisible(true);
	}
	

	
	//method gets choices based on radio buttons user clicked
	//runs after submit button is clicked
	public static void getChoices() {
		
		//get price choice and set public variable pricemax to users answer
		if($500.isSelected()) {
			maxPrice = 500;
		}
		else if($1000.isSelected()){
			maxPrice = 1000;
		}
		else if ($2000.isSelected()){
			maxPrice = 2000;
		}
		else{
			maxPrice = 50000;
		}
		
		//get amount of ram user chose and set minimumRam to users answer
		if(gb4.isSelected()){
			minimumRam = 4;	
		}
		else if(gb8.isSelected()){
			minimumRam = 8;	
		}
		else if(gb16.isSelected()){
			minimumRam = 16;	
		}
		else if(gb32.isSelected()){
			minimumRam = 32;	
		}

		
		//get amount of storage user chose and set is to minimumStorage
		if(ssd128Minus.isSelected()){
			minimumStorage = 0;	
		}
		else if(ssd128Plus.isSelected()){
			minimumStorage = 128;	
		}
		else if(ssd512Plus.isSelected()){
			minimumStorage = 512;	
		}
		else if(ssd1000Plus.isSelected()){
			minimumStorage = 1000;	
		}
		
		//get brand from radio buttons and set it to brand choice
		//get amount of storage user chose and set is to minimumStorage
		if(Apple.isSelected()){
			brandChoice = "Apple";	
		}
		else if(HP.isSelected()){
			brandChoice = "HP";	
		}
		else if(Dell.isSelected()){
			brandChoice = "Dell";	
		}
		else if(Asus.isSelected()){
			brandChoice = "Asus";	
		}
		else if(Acer.isSelected()){
			brandChoice = "Acer";	
		}
		else {
			brandChoice = "dontCare";	
		}
		
	}
	
	//fills laptops selection arrayList with same values as laptop Selection array
	public static void fillLaptopSelectionArray(){
		
		
		for(int i = 0;i<40;i++){
			
			laptopSelectionList.add(laptopApplication.laptopArray[i]);
			
		}	
	}
	
	//choose laptop for user based on user choices
	//sorts until array list only has 3 laptops
	//Finds best laptop may not meet all criterea
	public static void chooseLaptops() {
		//remove laptops that don't meet price criteria
		for(int i = 0;i<laptopSelectionList.size();i++) {
			
			//if size of list is 3 break from list since no more sorting needed
			if(laptopSelectionList.size()==3) {
				break;
			}
			
			//if price greater then maximum set by user remove laptop from list

			if(laptopSelectionList.get(i).getPrice()>=maxPrice) {
				laptopSelectionList.remove(i);
				i = i-1;
				
			}
			
		}
		//remove laptops that dont meet ram criteria
		for(int i = 0;i<laptopSelectionList.size();i++) {
			
			//if size of list is 3 break from list since no more sorting needed
			if(laptopSelectionList.size()==3) {
				break;
			}
			
			//if amount of ram less them minimum set by user remove laptop from list

			if(laptopSelectionList.get(i).getRam()<minimumRam) {
				laptopSelectionList.remove(i);
				i = i-1;				
			}			
		}
		
		
		//remove laptops that dont meet storage criteria
		for(int i = 0;i<laptopSelectionList.size();i++) {
			
			//if size of list is 3 break from list since no more sorting needed
			if(laptopSelectionList.size()==3) {
				break;
			}
			
			//if amount of ssd less them minimum set by user remove laptop from list
			if(laptopSelectionList.get(i).getSsd()<minimumStorage) {
				laptopSelectionList.remove(i);
				i = i-1;				
			}			
		}
		
		
		//remove laptops that dont meet brand criteria
		boolean brandMatch;
		for(int i = 0;i<laptopSelectionList.size();i++) {
			brandMatch = brandChoice.indexOf(laptopSelectionList.get(i).getBrand()) >= 0;
			
			//if size of list is 3 break from list since no more sorting needed
			if(laptopSelectionList.size()==3) {
				break;
			}
			
			//if user doesnt care about brand then break
			if(brandChoice.indexOf("dontCare") >= 0) {
				i=laptopSelectionList.size()-1;
				break;
				
			}
			//if not right brand remove from list
			if(brandMatch == false) {
				laptopSelectionList.remove(i);
				i = i-1;
			}
		}
	
		
		for(int i = 0;i<3;i++) {
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//if submit button is clicked this code runs
		//runs get choices button to get user choices from radio buttons selected
		//makes frame disapear and opens results frame
		if(e.getSource()==submitButton) {
			getChoices();
			chooseLaptops();
			setVisible(false);
			Results results = new Results();

		}
		//if back button clicked
		if(e.getSource()==backButton) {
			setVisible(false);
			laptopApplication.titleFrame.setVisible(true);
		}
		//if green button clicked
		if(e.getSource()==greenButton) {
		    getContentPane().setBackground(backgroundColourGreen );

		}
		if(e.getSource()==redButton) {
		    getContentPane().setBackground(backgroundColourRed );

		}
		if(e.getSource()==blueButton) {
			getContentPane().setBackground(backgroundColourBlue );
		}

	}
	
}
		