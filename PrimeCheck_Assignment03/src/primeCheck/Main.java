package primeCheck;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		PrimeCheck alpha = new PrimeCheck("11");
		System.out.println(alpha.toString() + alpha.isPrime());
		if (alpha.isPrime() == true) {
			System.out.println("Test alpha passed");
		} else {
			System.out.println("Test alpha failed");
		}
	}

}
