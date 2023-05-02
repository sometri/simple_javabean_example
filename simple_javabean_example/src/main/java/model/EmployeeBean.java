//source: https://www.youtube.com/watch?v=6JZs8zJsyJE
package model;

import java.io.Serializable;

public class EmployeeBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; // add default serial version ID
	private String firstName; // employee first name
	private String LastName; // employee last name
	private int startYear; // the year of starting employment
	private double payRate; // the hourly pay rate
	
	/**
	 * 
	 */
	public EmployeeBean() {
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param startYear
	 * @param payRate
	 */
	public EmployeeBean(String firstName, String lastName, int startYear, double payRate) {
		this.firstName = firstName;
		this.LastName = lastName;
		this.startYear = startYear;
		this.payRate = payRate;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}

	/**
	 * @return the startYear
	 */
	public int getStartYear() {
		return startYear;
	}

	/**
	 * @param startYear the startYear to set
	 */
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}

	/**
	 * @return the payRate
	 */
	public double getPayRate() {
		return payRate;
	}

	/**
	 * @param payRate the payRate to set
	 */
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

}
