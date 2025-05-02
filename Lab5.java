//Lab5.java
package Labs;
import java.util.Scanner;

public class Lab5 {

    public static void main(String[] args)  {
        getRichQuick();
        isPrime();
       isPrime();
       palindromeCheck();
					
    }
    
    //getRichQuick
    //Calculates days to earn $1 million
    public static void getRichQuick() {
        double moneyTotal = 1.00;
        int dayNum = 1;
        System.out.println("Day " + dayNum + ": $" + moneyTotal);
        while(moneyTotal < 1000000){
            //print the day and earnings formatted
            dayNum++;
            System.out.printf("Day " + dayNum + ": $%.2f + ($1 + %.2f) = $", moneyTotal,moneyTotal/2);
            moneyTotal = (1.0 + (moneyTotal + moneyTotal/2));
            System.out.printf("%.2f\n",moneyTotal);
        }

        
    }
    
    //isPrime
    //Prints a message if a number is prime or not 
    public static void isPrime() {
        Scanner input = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Input a positive integer: ");
            if(input.hasNextInt()){
                num = input.nextInt();
            }
        }while(num < 0);
        boolean isPrime = true;
        //keep dividing num by increasing factors until factors are equal to num
        for(int i = 2; i < num; i++){
            if (num%i == 0){
                isPrime = false;
                System.out.println("This number is not prime");
                break;
            }
        }
        if(isPrime){
            System.out.println("This number is prime");
        }

    }
    
	//palindromeCheck 
    //This program reads words, identifies, counts and writes all the palindromes and the total
    //palindrome count.
    //hint 1: Using input.next() will only return what comes before a space.
    //hint 2: Using input.nextLine() automatically reads the entire current line.
    public static void palindromeCheck(){
        String userInput = ""; // Stores words read from user input
        int palindromeCount = 0; // Keeps track of palindrome words only
        int totalWords = 0; // Counts the total number of lines read from the given text file

        System.out.println("Enter some words separated by white space. Enter 0 to exit"); // Ask
        Scanner keyboard = new Scanner(System.in); // Declare your Scanner object here
        String fullLine = "";
        while (keyboard.hasNext()) { // for each word user enters
            userInput = keyboard.next(); // Store each word in a string variable and then do your operations
            fullLine += userInput + " ";
             // Increment number of words as you read each one
            if(userInput.equals("0")){
                break;
            }
            totalWords++;
        }

        // TODO: Call your helper method to check if the word is a palindrome and print the results
        int i = 0;
        int palindromeNum = 0;
        //keep running loop until every word is processes
        while(i < totalWords){
            //get current word being processed
            String currentWord = fullLine.substring(0, fullLine.indexOf(" "));
            //get palindromes
            if(checkForPalindrome(currentWord)){
                System.out.println(currentWord);
                palindromeNum++;
            }
            //check if we've reached the last word
            if(!(fullLine.indexOf(" ") >= fullLine.length())){
                fullLine = fullLine.substring(fullLine.indexOf(" ") + 1);
            } else {
                break;
            }
            i++;


        }
        System.out.println("There is " + palindromeNum + " out of " + totalWords + " provided by user");

    }

    public static Boolean checkForPalindrome(String word){
        String result = "";
        for(int i = word.length()-1; i>=0; i--){
            result += word.substring(i, i+1);
        }
        if(result.equals(word)){
            //System.out.println(word + " is a palindrome");
            return true;
        } else {
            //System.out.println(word + " is not a palindrome");
            return false;
        }
    }

}
	

