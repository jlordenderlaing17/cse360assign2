/**
 * Name: James Lord Ender Laing
 * Class ID: 460
 * Assignment 2
 * This file is the class for a Calculator object along with its methods
*/

package cse360assign2;

/**
 * This class' purpose is to perform operations relative to the instance variable, total.
 * It has a default constructor that sets total equal to zero,
 * and the history instance variable equal to "0".
 * The operations this class can handle are addition, subtraction, multiplication, and division.
 * It can also return the total instance variable, and the history instance variable.
 */

public class Calculator {

	private int total; // This is the instance variable that can be altered by some of the following methods.
	
	private String history; // This String instance variable holds the entire history of the class' operations.
	
	public Calculator () {
		total = 0;  // not needed - included for clarity.
		history = "0"; // Initiates to 0 because of required format of history.
	}
	
/**
 * Returns the total instance variable.
 * @return	the instance variable, total
 */
	public int getTotal () {
		return total;
	}
	
/**
 * Adds a number to the total instance variable, and assigns the sum to total.
 * <p>
 * Also adds the operation done on the total instance variable to the history instance variable.
 * @param value an integer that is added to the total.
 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}

/**
 * Subtracts a number from the total instance variable, and assigns the difference to total.
 * <p>
 * Also adds the operation done to the total instance variable to the history instance variable.
 * @param value an integer that is subtracted from the total instance variable
 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
/**
 * Multiplies a number by the total instance variable, and then assigns the product to
 * total.
 * <p>
 * Also adds the operation done to the total instance variable to the history instance variable.
 * @param value an integer that is multiplied by the total instance variable
 */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	
/**
 * Divides the total instance variable by a number, and then assigns that quotient to total.
 * <p>
 * If the number total is divided by is zero, total is just set to zero.
 * This method is not properly implemented yet. It also adds the operation 
 * done to the total instance variable to the history instance variable.
 * @param value an integer that divides the total instance variable.
 */
	public void divide (int value) {
		if(value == 0)
		{
			total = 0;
		}
		else
		{
			int temporaryQuotient = total/value;
			total = temporaryQuotient;
		}
		history = history + " / " + value;
	}
	
/**
 * Returns the history instance variable.
 * @return the instance variable, history.
 */
	public String getHistory () {
		return history;
	}
}