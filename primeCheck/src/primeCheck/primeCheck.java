/**

 * Kyle Marler, John Lockleer, Ben Tenhover

 * Assignment03

 * Due Date: 2/1/2018

 * 

 */

package primeCheck;



import java.math.BigInteger;



/**

 * A class that will be used to check whether a number, recorded as a string, then converted into a BigInteger, is a prime number.

 * @author Kyle Marler

 *

 */

public class primeCheck {

	private String num;

	private String prime;

	/**

	 * 

	 * @return

	 */

	public String getNum() {

		return num;

	}

	/**

	 * 

	 * @param num

	 */

	public void setNum(String num) {

		this.num = num;

	}

	/**

	 * Constructor for PrimeCheck Class

	 * @param num

	 */

	public primeCheck(String num) {

		this.num = num;

	}

	/**

	 * Checks if a number is prime in BigInteger form

	 * @param prime

	 * @return false if it is a composite number. True if it is prime.

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

	

	public String toString() {

		return num + " is a ";

	}

	

	



}