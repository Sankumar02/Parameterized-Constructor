package com.Class.org;

public class EmployeeTimesheet {
	
	String timesheettype;
	String WeekDay;
	//define a parameterized constructor
	//Parameterized constructor has arguments and it is used to provide different values to distinct objects.
	EmployeeTimesheet(String type,String Day ) {
		timesheettype=type;
		WeekDay=Day;
		}

	public void StausOfTimesheet(){
		System.out.println("The Timesheet Type is "+timesheettype+ " and the Day applied is "+WeekDay);
		
	}
	public static void main(String[] args) {
		EmployeeTimesheet timesheet= new EmployeeTimesheet("Training", "Monday.");
		timesheet.StausOfTimesheet();
		EmployeeTimesheet timesheet2= new EmployeeTimesheet("SrumMeet", "Tuesday.");
		timesheet2.StausOfTimesheet();
		

	}

}