// Name: Vithursh Thananchayan 
// Group #: Group 3
// Date: May 14th, 2022
// Teacher: Mr. Lee
// Course: ICS3U1
// Description: GUI that educates users about our company and how it works
// Major Skills: Using JLabels and JButtons
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LaptopStoreEducationFrame extends JFrame implements ActionListener{
	
	//Creates a Label
	JLabel background = new JLabel(new ImageIcon("data/Background.jpeg"));
	
	JLabel heading = new JLabel("Summary");
	JLabel heading2 = new JLabel("Contact Info");
	JLabel heading3 = new JLabel("What do the specs do?");
	
	JLabel writing1 = new JLabel("Hi, my name is Vithursh, welcome to Immaculate Purchases.");
	JLabel writing2 = new JLabel("Here my team Rupert, Elliott, Winnie, and I will help you");
	JLabel writing3 = new JLabel("pick a suitable laptop. But inorder to do that you will need");
	JLabel writing4 = new JLabel("to fill out a quick and easy survey. Once said survey has been");
	JLabel writing5 = new JLabel("filled out, our algorithm will sort through our database which");
	JLabel writing6 = new JLabel("is filled with various laptops, along with their specs (ram, CPU,");
	JLabel writing7 = new JLabel("display, storage space, etc.) and it will pick you the right laptop");
	JLabel writing8 = new JLabel("based on your survey results.");
	
	JLabel phoneNumber = new JLabel("Phone number: 647-111-6666");
	JLabel emailAdress = new JLabel("Email address: immaculatepurchases@gmail.com");
	
	JLabel cpuInfo = new JLabel("CPU: The CPU also know as the central");
	JLabel cpuInfo2 = new JLabel("processing unit oversees cooling the system. It is");
	JLabel cpuInfo3 = new JLabel("also considered to be the heart of the computer.");
	
	JLabel gpuInfo = new JLabel("GPU: The GPU also known as the graphic");
	JLabel gpuInfo2 = new JLabel("processing unit accelerates graphics");
	JLabel gpuInfo3 = new JLabel("rendering.");
	
	JLabel ramInfo = new JLabel("Ram: The ram also known as the Random access");
	JLabel ramInfo2 = new JLabel("memory is the memory of the computer. It is");
	JLabel ramInfo3 = new JLabel("typically used to store working data and");
	JLabel ramInfo4 = new JLabel("machine code.");
	
	JLabel storageInfo = new JLabel("Storage: The storage in computers holds all");
	JLabel storageInfo2 = new JLabel("the data. Most of which being the operating");
	JLabel storageInfo3 = new JLabel("system (Windows, Mac, or Linux) and the users");
	JLabel storageInfo4 = new JLabel("data. The device that oversees storing ");
	JLabel storageInfo5 = new JLabel("all the data is the hard drive also known");
	JLabel storageInfo6 = new JLabel("as the hdd, but these days computers come with");
	JLabel storageInfo7 = new JLabel("solid state drives (SSD) which are faster than");
	JLabel storageInfo8 = new JLabel("hard drives.");
	
	//Creates a button and makes it a picture of a back arrow
	JButton backButton = new JButton("Back");

	//Creates the constructor
	LaptopStoreEducationFrame(){
		
		//sets the titles name
		this.setTitle("Education");
		//sets he size of the frame
		this.setSize(800, 600);
		//makes the frame visible 
		this.setVisible(false);
		//Centers the frame
		this.setLocationRelativeTo(null);
		//closes the frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//lets the layout of the frame to nothing
		background.setLayout(null);
		//
		this.add(background);
		
		//Creates the font and changes the size of the text
		heading.setFont(new Font("Ink Free", Font.BOLD, 20));
		//Changing the position of the heading
		heading.setBounds(120, 5, 200, 200);
		//Adding the heading to the frame
		background.add(heading);		
		
		writing1.setFont(new Font("Ink Free", Font.BOLD, 15));
		writing1.setBounds(5, 45, 10000, 200);
		background.add(writing1);
		
		writing2.setFont(new Font("Ink Free", Font.BOLD, 15));
		writing2.setBounds(5, 65, 10000, 200);
		background.add(writing2);
		
		writing3.setFont(new Font("Ink Free", Font.BOLD, 15));
		writing3.setBounds(5, 85, 10000, 200);
		background.add(writing3);
		
		writing4.setFont(new Font("Ink Free", Font.BOLD, 15));
		writing4.setBounds(5, 105, 10000, 200);
		background.add(writing4);
		
		writing5.setFont(new Font("Ink Free", Font.BOLD, 15));
		writing5.setBounds(5, 125, 10000, 200);
		background.add(writing5);
		
		writing6.setFont(new Font("Ink Free", Font.BOLD, 15));
		writing6.setBounds(5, 145, 10000, 200);
		background.add(writing6);
		
		writing7.setFont(new Font("Ink Free", Font.BOLD, 15));
		writing7.setBounds(5, 165, 10000, 200);
		background.add(writing7);
		
		writing8.setFont(new Font("Ink Free", Font.BOLD, 15));
		writing8.setBounds(5, 185, 10000, 200);
		background.add(writing8);
		
		heading2.setFont(new Font("Ink Free", Font.BOLD, 20));
		heading2.setBounds(120, 245, 300, 200);
		background.add(heading2);
		
		phoneNumber.setFont(new Font("Ink Free", Font.BOLD, 15));
		phoneNumber.setBounds(5, 285, 300, 200);
		background.add(phoneNumber);
		
		emailAdress.setFont(new Font("Ink Free", Font.BOLD, 15));
		emailAdress.setBounds(5, 305, 500, 200);
		background.add(emailAdress);
		
		backButton.setBounds(5,5,300,150);
		//Turns off Opaque
		backButton.setOpaque(false);
		//Turns off ContentAreaFilled
		backButton.setContentAreaFilled(false);
		//Turns off the BorderPainted
		backButton.setBorderPainted(false);
		//Make the back button have a function 
		backButton.addActionListener(this);
		background.add(backButton);
		
		heading3.setFont(new Font("ink free", Font.BOLD,20));
		heading3.setBounds(530, 5, 1000, 200);
		background.add(heading3);
		
		cpuInfo.setFont(new Font("ink free", Font.BOLD,15));
		cpuInfo.setBounds(457, 45, 1000, 200);
		background.add(cpuInfo);
		
		cpuInfo2.setFont(new Font("ink free", Font.BOLD,15));
		cpuInfo2.setBounds(457, 65, 1000, 200);
		background.add(cpuInfo2);
		
		cpuInfo3.setFont(new Font("ink free", Font.BOLD,15));
		cpuInfo3.setBounds(457, 85, 1000, 200);
		background.add(cpuInfo3);
		
		gpuInfo.setFont(new Font("ink free", Font.BOLD,15));
		gpuInfo.setBounds(457, 125, 1000, 200);
		background.add(gpuInfo);
		
		gpuInfo2.setFont(new Font("ink free", Font.BOLD,15));
		gpuInfo2.setBounds(457, 145, 1000, 200);
		background.add(gpuInfo2);
		
		gpuInfo3.setFont(new Font("ink free", Font.BOLD,15));
		gpuInfo3.setBounds(457, 165, 1000, 200);
		background.add(gpuInfo3);
		
		ramInfo.setFont(new Font("ink free", Font.BOLD,15));
		ramInfo.setBounds(457, 205, 1000, 200);
		background.add(ramInfo);
		
		ramInfo2.setFont(new Font("ink free", Font.BOLD,15));
		ramInfo2.setBounds(457, 225, 1000, 200);
		background.add(ramInfo2);
		
		ramInfo3.setFont(new Font("ink free", Font.BOLD,15));
		ramInfo3.setBounds(457, 245, 1000, 200);
		background.add(ramInfo3);
		
		ramInfo4.setFont(new Font("ink free", Font.BOLD,15));
		ramInfo4.setBounds(457, 265, 1000, 200);
		background.add(ramInfo4);
		
		storageInfo.setFont(new Font("ink free", Font.BOLD,15));
		storageInfo.setBounds(457, 305, 1000, 200);
		background.add(storageInfo);
		
		storageInfo2.setFont(new Font("ink free", Font.BOLD,15));
		storageInfo2.setBounds(457, 325, 1000, 200);
		background.add(storageInfo2);
		
		storageInfo3.setFont(new Font("ink free", Font.BOLD,15));
		storageInfo3.setBounds(457, 345, 1000, 200);
		background.add(storageInfo3);
		
		storageInfo4.setFont(new Font("ink free", Font.BOLD,15));
		storageInfo4.setBounds(457, 365, 1000, 200);
		background.add(storageInfo4);
		
		storageInfo5.setFont(new Font("ink free", Font.BOLD,15));
		storageInfo5.setBounds(457, 385, 1000, 200);
		background.add(storageInfo5);
		
		storageInfo6.setFont(new Font("ink free", Font.BOLD,15));
		storageInfo6.setBounds(457, 405, 1000, 200);
		background.add(storageInfo6);
		
		storageInfo7.setFont(new Font("ink free", Font.BOLD,15));
		storageInfo7.setBounds(457, 425, 1000, 200);
		background.add(storageInfo7);
		
		storageInfo8.setFont(new Font("ink free", Font.BOLD,15));
		storageInfo8.setBounds(457, 445, 1000, 200);
		background.add(storageInfo8);
	}
	
	@Override
	//Creates a method for when the user presses the back button
	public void actionPerformed(ActionEvent e) {
	//makes the text appear on the console when you click the button	
		if(e.getSource() == backButton) {
			setVisible(false);
			laptopApplication.titleFrame.setVisible(true);
		}
	}

}