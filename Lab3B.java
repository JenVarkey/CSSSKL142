// Lab3B.java
// Part 2

public class Lab3B {
	public static void main(String[] args) {

		// greaterOfTwo tests
		System.out.println("\nTesting greaterOfTwo:");
		System.out.println("The larger number between -3 and 6.2 is: " + greaterOfTwo(-3, 6.2)); //output should be 6.2
		System.out.println("The larger number between 8.99999 and 8.9 is: " + greaterOfTwo(8.99999, 8.9)); //output should be 8.99999
		System.out.println("The larger number between 0.9 and 9.0 is: " + greaterOfTwo(0.9, 9.0)); // output should be 9.0


		// smallestOfThree tests
		System.out.println("\nTesting smallestOfThree:");
		System.out.println("The smallest number between 3, 17 and 8 is: " + smallestOfThree(3, 17, 8)); //output should be 3
		System.out.println("The smallest number between 9, 0.9 and 9999.9 is: " + smallestOfThree(9, 0.9, 9999.9)); // output should be 0.9
		System.out.println("The smallest number between -0.2, 4 and 3.4 is: " + smallestOfThree(-0.2, 4, 3.4)); //output should be -0.2
		System.out.println("The smallest number between 17, -5 and -13 is: " + smallestOfThree(17, -5, -13)); //output should be -13


	}

	// greaterOfTwo
	// Return the greater of two doubles without using Math.max or Math.min
	// num1: first value
	// num1: second value

	// TODO: You figure out the declaration and the method!
	public static double greaterOfTwo(double num1, double num2){
		if (num1 > num2){
			return num1;
		} else {
			return num2;
		}

	}

	// smallestOfThree
	// Return the smallest of three doubles without using Math.max or Math.min
	// num1: first value
	// num2: second value
	// num3: third value
	// TODO: You figure out the declaration and the method!
	public static double smallestOfThree(double num1, double num2, double num3){
		//check if num1 is greater than num2
		if (num1 > num2){
			//check if num2 is greater than num3
			if(num2 > num3){
				//if the above conditions are true, num3 is the smallest number
				return num3;
			} else {
				//if the first if statement is true but the second one isn't, num2 is the smallest number
				return num2;
			}
		} else {
			//if num2 is greater than num1, check if num3 is smaller than num1
			if (num1 > num3){
				return num3;
			} else {
				//otherwise num1 is the smallest number and should be returned
				return num1;
			}
		}
	}

}
