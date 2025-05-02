package Labs;
// Lab3A.java
// Part 1
import java.util.Scanner;


public class Lab3A {
	public static void main(String[] args) {
		// oddEvenChecker tests
		System.out.println("\nTesting oddEvenChecker:");

		oddEvenChecker(3); // Should print "3 is an odd number"
		oddEvenChecker(8); // Should print "8 is an even number"
		// Additional tests added for question no. 3
		oddEvenChecker(99);
		oddEvenChecker(-7);


		// multipleOfChecker tests
		System.out.println("\nTesting multipleOfChecker:");
		multipleOfChecker(16, 4); // Should print "16 is a multiple of 4"
		multipleOfChecker(11, 3); // Should print "11 is not a multiple of 3"
		// Additional tests added for question no. 3
		multipleOfChecker(99, 9); //Should print "99 is a multiple of 9"
		multipleOfChecker(-70, 3);//Should print "-70 is not a multiple of 3"

		// sqrtSumBucketer tests
		System.out.println("\nTesting sqrtSumBucketer:");
		sumSqrtBucketer(); //user should input tests
	}

	// oddEvenChecker
	// Determine if num is odd or even.
	// num: the integer to check
	public static void oddEvenChecker(int num){
		if (num%2 == 0){
			System.out.println(num + " is an even number");
		} else {
			System.out.println(num + " is an odd number");
		}
	}

	// multipleOfChecker
	// Determine if num is a multiple of base.
	// num: the integer to check
	// base: the integer base against which to check
	public static void multipleOfChecker(int num, int base){
		if (num % base == 0){
			System.out.println(num + " is a multiple of " + base);
		} else {
			System.out.println(num + " is not a multiple of " + base);
		}
	}


	// sumSqrtBucketer
	// Sums the square roots of two doubles (input from user) and
	// sorts results into bucket, printing result
	public static void sumSqrtBucketer() {
		// TODO: Declare scanner
		Scanner input = new Scanner(System.in);
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();

		if (num1 < 0 || num2 < 0){
			System.out.println("Those inputs are invalid.");
		} else {
			double rootSum = Math.sqrt(num1) + Math.sqrt(num2);

			if (rootSum < 10) {
				System.out.println("Less than 10");
			} else if (rootSum < 20) {
				System.out.println("Between 10 and 20");
			} else if (rootSum < 30) {
				System.out.println("Between 20 and 30");
			} else {
				System.out.println("Greater than 30.");
			}
		}
	}
}
