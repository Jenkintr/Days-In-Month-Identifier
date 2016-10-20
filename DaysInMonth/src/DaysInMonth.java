/**
 * This program will identify the number of days in a month of any given year based on user input
 */

import java.util.Scanner; //needed for scanner input

/**
 * @author Taylor Jenkins
 *
 */
public class DaysInMonth {

	public static void main(String[] args) {
		//Create scanner object for user input
		Scanner keyboard = new Scanner (System.in);
		String[] monthName = {"", "January", "February", "March", 
							"April", "May", "June", "July", "August",
							"September", "October", "November", "December"};
		
		System.out.print("Enter a Month (1-12):");
		int month = keyboard.nextInt();
		
		System.out.print("Enter a Year: ");
		int year = keyboard.nextInt();
		
		MonthDays identifyNumOfDays = new MonthDays(month, year);
		
		
		System.out.println("There are " + identifyNumOfDays.getNumberOfDays() + " days in " + monthName[month]  + " " + identifyNumOfDays.getYear() );
		
		keyboard.close();
		}
}

