package Labs;
//Lab2B.java - revised
import java.util.Scanner;
public class Lab2B {
	public static void main(String[] args){

		//Expected Max: 34.5, Output: 34.5
		double maxNumber1 = Math.max(22.3, 34.5);
		System.out.println("The maximum number is: " + maxNumber1);

		//Expected Min: 3.6/7.2, Output: 3.6/7.2(printed as result: 0.5)
		double minNumber1 = Math.min(3.6/7.2, 3.8/6.9);
		System.out.println("The minimum number is: " + minNumber1);

		//Expected Max: 0.1, Output: 0.1
		double maxNumber2 = Math.max(2/3, 0.1);
		System.out.println("The maximum number is: " + maxNumber2);

		//Expected Min: 13.5555, Output: 13.5555
		double minNumber2 = Math.min(13.5555, 13.5556);
		System.out.println("The minimum number is: " + minNumber2);


		//declare scanner and print prompt to input values
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter you name followed by three numbers (space separated):");

		//Get name using next() to get the first token in the string
		String name = input.next();

		//get three double values
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();



		//calculate maximum by comparing each number to each other and the two
		double max = Math.max(Math.max(num1, num2), Math.max(num2, num3));
		//calculate minimum
		double min = Math.min(Math.min(num1, num2), Math.min(num2, num3));
		//calculate middle value by adding all values together and subtracting min and max
		double mid = (num1 + num2 + num3) - (min + max);
		//print results to the console
		System.out.println( "Hi there, " + name + "! Here are the numbers you entered in descending order:");
		System.out.println(max + " " + mid + " and " + min);

		//display goodbye message
		System.out.println("Thank you for using the three-number-sorting system! Good-bye!");
	}

}
