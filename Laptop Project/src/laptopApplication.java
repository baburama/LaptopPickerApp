/* 
Name: 
Group #3; Rupert Maiti,Elliot Lai, Winnie Li, Vithursh Thananchayan
Date:
May 5, 2022
Course Code:
ICS3U1-04 Mr.Lee
Title:
Laptop store
Description:
We created a virtual laptop store. It was an education frame that teaches the user about the different parts of the laptop. It has an inventory frame where users can see all the laptops in stock and can sort and filter them. It has a survey frame where the user can pick what they want in their laptop. THere is the results frame where the program picks 3 laptops for the user based on their choices. The title frames hasa buttons leading to survey, education and inventory frames. All these frames have back buttons that lead back to the title frame. Out application also has background music.
Major Skills:
Arrays
ArrayLists
Java swing components
Action listeners
Audio libraries
Added Features:
Background music
Inventory can filter laptops
User can change background colour of survey frame

Areas of Concern:
If after finishing the survey, 3 laptops that meet all the criteria selected by user cannot be found, program selects 3 laptops that best meet criteria
Filter buttons on inventory frame print results on console window

Contribution to Assignment:
Student Name:Rupert Maiti
Which Java file(s) did you contribute to completing the assignment?	
Laptop.java
laptopApplication.java
laptopStoreSurveyFrame.java
DId all the work for these java classes
Student Name:Elliot Lai
Which Java file(s) did you contribute to completing the assignment?	
LaptopTitle
LaptopInventory


Student Name:Winnie Li
Which Java file(s) did you contribute to completing the assignment?	
File Input
Results

Student Name:Vithursh Thananchayan
Which Java file(s) did you contribute to completing the assignment?	
LaptopEducationFrame




 */

public final class laptopApplication {
	
	//create laptop array public to all classes in projecct
	public static Laptop[] laptopArray = new Laptop[40];
	
	//create title frame object
	public static LaptopTitle titleFrame;

	public static void main(String[] args) {
		//input data from files
		new FileInput();
		
		//open title frame
		titleFrame = new LaptopTitle();
		
	}

}