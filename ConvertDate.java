//Santiago Fleiderman
//CSc 2010, Principles of Computer Science
//Spring 2014
//Assignment 6; Convert Date
// Converting the date so that user input will allow spacing in between the lines space and trimming.
//03-6-2014
import java.util.Scanner;


public class ConvertDate {

	public static void main(String[] args) {


			
				
				    {	    	// inputs of day month year
				    	System.out.println("Enter date to be converted : month day, year");
				Scanner sc = new Scanner(System.in);
						String date = sc.nextLine();
						// trims extra spaces
				    	String bff = date.trim();
						//Creates extra spaces in characters
				    	int index1 = bff.indexOf(" ");
				    	int index2 = bff.lastIndexOf(",");
						//This is where the month output is located as well as lowercase and uppercase
				    	String firstLetter = bff.substring(0,1);
				    	String otherLetters = bff.substring(1);
				    	String bff0 = firstLetter.trim().toUpperCase() + otherLetters.trim().toLowerCase();
						// Gets where to find the date
				 		String day = bff0.trim().substring(0, index1).trim();
				    	String month = bff.trim().substring(index1 + 1, index2).trim();
				    	String year = bff.trim().substring(index2 + 1).trim();
				    	
						// Gets the output creating extra spaces
				    
				    System.out.println("Date Converted: " + month + " " + day + " " + year);
				    
				    sc.close();

				    }
				    
				}
	}
