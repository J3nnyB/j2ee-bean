/*
	Name: Jennifer Byrne
	Date: March 6, 2020
	Notes: ENTD481 Week 5 Assignment - This is the Java Bean program that corresponds to the JSP page, which displays the current date.
 */
// Package statement
package week5bean;

// Import the following Java libraries
import java.io.Serializable;
import java.time.*;
import java.time.format.*;

// Class declaration - Java Beans are required to implement Serializable/Externalizable interfaces
public class DateBean implements Serializable {

	// Default serial version UID - still not quite sure what this does
	private static final long serialVersionUID = 1L;
	
	// Global String variable 'date' set to private
	private String date;
	
	// Public zero-argument constructor - Java Bean requirement	
	public DateBean() {
		
		// Creates LocalDate object 'locDate' and sets the value to the current local date
		LocalDate locDate = LocalDate.now();
		
		// Sets the value of 'date' to the formatted version of the LocalDate object 'locDate'
		// Format.Style.FULL displays the day of the week, month, day, year 
		date = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(locDate);
	}
	// Getter method for "date" property
	public String getDate() {
		
		// Returns the value of String variable 'date'
		return date;
	}
	// Setter method for "date" property
	public void setDate(String date) {
		
		// Global variable 'date' is set to the value of the passed parameter 'date'
		this.date = date;		
	}
}
