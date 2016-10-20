/**
 * The MonthDays Class simulates a calendar
 */

/**
 * @author Taylor Jenkins
 *
 */
public class MonthDays {
	//Fields
	private int month; //The number that corresponds to the month of the year
	private int year; //The year
	
	/**
	 * The constructor 
	 * @param numMonth The number of the month
	 * @param numYear The year
	 */
	public MonthDays(int numMonth, int numYear){
		this.month = numMonth;
		this.year = numYear;
	}
	
	
	//Getters
	public int getMonth(){
		return this.month;
	}
	public int getYear(){
		return this.year;
	}
	
	//Method to determine days in the year
	public int getNumberOfDays(){
		int daysInMonth= 0;
		
		//Determine if the year is a leap year or not
		boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
		
		//Determine days in month based on year
		switch(month){		
		//Thirty days hath September, April, June, and November
		case 4:	
		case 6:
		case 9:
		case 11:
			daysInMonth = 30;
			break;
		//All the rest have 31
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			daysInMonth = 31;
			break;
		//Except for February alone. It has twenty-eight days clear, and twenty-nine, each leap year
		case 2:
			if(isLeapYear){
				daysInMonth = 29;
			}
			else{
				daysInMonth = 28;
			}
			break;
		}
		return daysInMonth;
	}
}
