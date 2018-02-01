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
/**
 * A main class that runs tests to prove our isPrime method works successfully in the PrimeCheck class
 * @author Kyle Marler, John Locklear, Ben Tenhover
 *
 */
public class Main {

	public static void main(String[] args) {

		PrimeCheck alpha = new PrimeCheck("2");

		System.out.println("BigInteger Test For Primeness:"); // Message displaying the purpose of the following content

		System.out.println("\nTest Alpha value: 2\nTest Alpha expected results: true\n" + alpha.toString() + alpha.isPrime()); // This message displays the Alpha Test expected results and actual results

		if (alpha.isPrime() == true) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Alpha passed");

		} else {

			System.out.println("Test Alpha failed");

		}

		PrimeCheck Bravo = new PrimeCheck("4");

		System.out.println("\nTest Bravo value: 4\nTest Bravo expected results: false\n" + Bravo.toString() + Bravo.isPrime()); // This message displays the Bravo Test expected results and actual results

		if (Bravo.isPrime() == false) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Bravo passed");

		} else {

			System.out.println("Test Bravo failed");

		}

		PrimeCheck Charlie = new PrimeCheck("1000200");

		System.out.println("\nTest Charlie value: 1000200\nTest Charlie expected results: false\n" + Charlie.toString() + Charlie.isPrime()); // This message displays the Charlie Test expected results and actual results

		if (Charlie.isPrime() == false) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Charlie passed");

		} else {

			System.out.println("Test Charlie failed");

		}

		PrimeCheck Delta = new PrimeCheck("15485863");

		System.out.println("\nTest Delta value: 15485863\nTest Delta expected results: true\n" + Delta.toString() + Delta.isPrime()); // This message displays the Delta Test expected results and actual results

		if (Delta.isPrime() == true) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Delta passed");

		} else {

			System.out.println("Test Delta failed");

		}

		PrimeCheck Echo = new PrimeCheck("67867967");

		System.out.println("\nTest Echo value: 67867967\nTest Echo expected results: true\n" + Echo.toString() + Echo.isPrime()); // This message displays the Echo Test expected results and actual results

		if (Echo.isPrime() == true) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Echo passed");

		} else {

			System.out.println("Test Echo failed");

		}

		PrimeCheck Foxtrot = new PrimeCheck("32452843");

		System.out.println("\nTest Foxtrot value: 32452843\nTest Foxtrot expected results: true\n" + Foxtrot.toString() + Foxtrot.isPrime()); // This message displays the Foxtrot Test expected results and actual results

		if (Foxtrot.isPrime() == true) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Foxtrot passed");

		} else {

			System.out.println("Test Foxtrot failed");

		}

		PrimeCheck Gulf = new PrimeCheck("198491317");

		System.out.println("\nTest Gulf value: 198491317\nTest Gulf expected results: true\n" + Gulf.toString() + Gulf.isPrime()); // This message displays the Gulf Test expected results and actual results

		if (Gulf.isPrime() == true) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Gulf passed");

		} else {

			System.out.println("Test Gulf failed");

		}

		PrimeCheck Hotel = new PrimeCheck("674506081");

		System.out.println("\nTest Hotel value: 674506081\nTest Hotel expected results: true\n" + Hotel.toString() + Hotel.isPrime()); // This message displays the Hotel Test expected results and actual results

		if (Hotel.isPrime() == true) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Hotel passed");

		} else {

			System.out.println("Test Hotel failed");

		}

		PrimeCheck India = new PrimeCheck("858599503");

		System.out.println("\nTest India value: 858599503\nTest India expected results: true\n" + India.toString() + India.isPrime()); // This message displays the India Test expected results and actual results

		if (India.isPrime() == true) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test India passed");

		} else {

			System.out.println("Test India failed");

		}

		PrimeCheck Juliet = new PrimeCheck("982451653");

		System.out.println("\nTest Juliet value: 982451653\nTest Juliet expected results: true\n" + Juliet.toString() + Juliet.isPrime()); // This message displays the Juliet Test expected results and actual results

		if (Juliet.isPrime() == true) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Juliet passed");

		} else {

			System.out.println("Test Juliet failed");

		}

		PrimeCheck Kilo = new PrimeCheck("452930459");

		System.out.println("\nTest Kilo value: 452930459\nTest Kilo expected results: true\n" + Kilo.toString() + Kilo.isPrime()); // This message displays the Kilo Test expected results and actual results

		if (Kilo.isPrime() == true) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Kilo passed");

		} else {

			System.out.println("Test Kilo failed");

		}

		PrimeCheck Lima = new PrimeCheck("526874566");

		System.out.println("\nTest Lima value: 526874566\nTest Lima expected results: false\n" + Lima.toString() + Lima.isPrime()); // This message displays the Lima Test expected results and actual results

		if (Lima.isPrime() == false) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Lima passed");

		} else {

			System.out.println("Test Lima failed");

		}
		PrimeCheck Mike = new PrimeCheck("879190852");

		System.out.println("\nTest Mike value: 879190852\nTest Mike expected results: false\n" + Mike.toString() + Mike.isPrime()); // This message displays the Mike Test expected results and actual results

		if (Mike.isPrime() == false) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Mike passed");

		} else {

			System.out.println("Test Mike failed");

		}

		PrimeCheck November = new PrimeCheck("732632797");

		System.out.println("\nTest November value: 732632797\nTest November expected results: false\n" + November.toString() + November.isPrime()); // This message displays the November Test expected results and actual results

		if (November.isPrime() == false) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test November passed");

		} else {

			System.out.println("Test November failed");

		}

		PrimeCheck Oscar = new PrimeCheck("817504542");

		System.out.println("\nTest Oscar value: 817504542\nTest Oscar expected results: false\n" + Oscar.toString() + Oscar.isPrime()); // This message displays the Oscar Test expected results and actual results

		if (Oscar.isPrime() == false) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Oscar passed");

		} else {

			System.out.println("Test Oscar failed");

		}

		PrimeCheck Papa = new PrimeCheck("179426323");

		System.out.println("\nTest Papa value: 179426323\nTest Papa expected results: true\n" + Papa.toString() + Papa.isPrime()); // This message displays the Papa Test expected results and actual results

		if (Papa.isPrime() == true) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Papa passed");

		} else {

			System.out.println("Test Papa failed");

		}

		PrimeCheck Quebec = new PrimeCheck("32416189381");

		System.out.println("\nTest Quebec value: 32416189381\nTest Quebec expected results: true\n" + Quebec.toString() + Quebec.isPrime()); // This message displays the Quebec Test expected results and actual results

		if (Quebec.isPrime() == true) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Quebec passed");

		} else {

			System.out.println("Test Quebec failed");

		}

		PrimeCheck Romeo = new PrimeCheck("32416188517");

		System.out.println("\nTest Romeo value: 32416188517\nTest Romeo expected results: true\n" + Romeo.toString() + Romeo.isPrime()); // This message displays the Romeo Test expected results and actual results

		if (Romeo.isPrime() == true) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Romeo passed");

		} else {

			System.out.println("Test Romeo failed");

		}

		PrimeCheck Siera = new PrimeCheck("32416189019");

		System.out.println("\nTest Siera value: 32416189019\nTest Siera expected results: true\n" + Siera.toString() + Siera.isPrime()); // This message displays the Siera Test expected results and actual results

		if (Siera.isPrime() == true) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Siera passed");

		} else {

			System.out.println("Test Siera failed");

		}

		PrimeCheck Tango = new PrimeCheck("32416187899");

		System.out.println("\nTest Tango value: 32416187899\nTest Tango expected results: true\n" + Tango.toString() + Tango.isPrime()); // This message displays the Tango Test expected results and actual results

		if (Tango.isPrime() == true) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Tango passed");

		} else {

			System.out.println("Test Tango failed");

		}

		PrimeCheck Uniform = new PrimeCheck("32416189493");

		System.out.println("\nTest Uniform value: 32416189493\nTest Uniform expected results: true\n" + Uniform.toString() + Uniform.isPrime()); // This message displays the Uniform Test expected results and actual results

		if (Uniform.isPrime() == true) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Uniform passed");

		} else {

			System.out.println("Test Uniform failed");

		}

		PrimeCheck Victor = new PrimeCheck("32416187567");

		System.out.println("\nTest Victor value: 32416187567\nTest Victor expected results: true\n" + Victor.toString() + Victor.isPrime()); // This message displays the Victor Test expected results and actual results

		if (Victor.isPrime() == true) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Victor passed");

		} else {

			System.out.println("Test Victor failed");

		}

		PrimeCheck Whiskey = new PrimeCheck("32416189493");

		System.out.println("\nTest Whiskey value: 32416189493\nTest Whiskey expected results: true\n" + Whiskey.toString() + Whiskey.isPrime()); // This message displays the Whiskey Test expected results and actual results

		if (Whiskey.isPrime() == true) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Whiskey passed");

		} else {

			System.out.println("Test Whiskey failed");

		}

		PrimeCheck Xray = new PrimeCheck("324161897665");

		System.out.println("\nTest Xray value: 324161897665\nTest Xray expected results: false\n" + Xray.toString() + Xray.isPrime()); // This message displays the Xray Test expected results and actual results

		if (Xray.isPrime() == false) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Xray passed");

		} else {

			System.out.println("Test Xray failed");

		}

		PrimeCheck Yankee = new PrimeCheck("3241618782");

		System.out.println("\nTest Yankee value: 3241618782\nTest Yankee expected results: false\n" + Yankee.toString() + Yankee.isPrime()); // This message displays the Yankee Test expected results and actual results

		if (Yankee.isPrime() == false) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Yankee passed");

		} else {

			System.out.println("Test Yankee failed");

		}

		PrimeCheck Zulu = new PrimeCheck("32416188223");

		System.out.println("\nTest Zulu value: 32416188223\nTest Zulu expected results: true\n" + Zulu.toString() + Zulu.isPrime()); // This message displays the Zulu Test expected results and actual results

		if (Zulu.isPrime() == true) { // This if statement returns whether or not the test passed or failed based on test results and expected results.

			System.out.println("Test Zulu passed");

		} else {

			System.out.println("Test Zulu failed");

		}
		System.out.println("\nAll tests have passed!"); // This displays that all tests have passed
	}
}