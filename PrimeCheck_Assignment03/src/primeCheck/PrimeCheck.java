/**
 * Name: Kyle Marler, John Locklear, Ben Tenhover
 * Assignment: Assignment03
 * Due Date: 2/1/2018
 * Course/Section/Semester: 2045C/002/Spring 2018
 * Email: tenhovbe@mail.uc.edu, Locklejr@mail.uc.edu, marlerkw@mail.uc.edu
 * Citations: Each other, In class work
 * Description: Work together to complete a class that determines whether or not a BigInteger is a prime number or not, as well as a 
 * main class to display testing for our prime check class.		
 */ 
package primeCheck; 

import java.math.BigInteger;

/**
 * A class that will be used to check whether a number, recorded as a string, then converted into a BigInteger, is a prime number.
 * @author Kyle Marler, John Locklear, Ben Tenhover
 *
 */
public class PrimeCheck {
	private String num; // String called num that will be used to create a BigInteger in the isPrime method
	/**
	 * Getter for the num string
	 * @return
	 */
	public String getNum() {
		return num;
	}
	/**
	 * Setter for the num string
	 * @param num
	 */
	public void setNum(String num) {
		this.num = num;
	}
	/**
	 * Constructor for PrimeCheck Class, entered as a string.
	 * @param num
	 */
	public PrimeCheck(String num) {
		this.num = num;
	}
	/**
	 * Checks if a number is prime in BigInteger form
	 * @param prime
	 * @return False if it is a composite number. True if it is prime.
	 */
	public boolean isPrime() {
		BigInteger zero = new BigInteger("0"); // Instantiates a BigInt named zero wit the value of zero
		BigInteger two = new BigInteger("2"); // Instantiates a BigInt named two with the value of two
		BigInteger num1 = new BigInteger(num); // Converts the string num into a BigInt
		
		
		if (num1.equals(two)) { // Checks if num1 is equal to 2, since 2 is prime.
			return true;
		}
		if (zero.equals(num1.mod(two))) { // Checks if the number is fully divisible by two with a remainder of zero.
			return false;						  // If so, will return false. We use this to rule out even numbers as soon as possible.
		}															
		for (BigInteger c = new BigInteger("3"); c.multiply(c).compareTo(num1) < 1; c = c.add(two)) { // Establishes a counter for BigInt. Next will find whether c squared is still less than num1.  
			if (zero.equals(num1.mod(c))) {															// We add two to the counter because we only need to check the odd factors, since we already checked for all the even factors.

				return false; 					// Checks whether the number is divisible by the counter value with a remainder of zero, returns false if it is.
			}
		}
		return true; // If it passes all the tests, this will return true, meaning it is a prime factor. 
	}
	/**
	 * toString method that will print the value of the number.
	 */
	public String toString() {
		return num + " is a prime number: "; 
	}
}
