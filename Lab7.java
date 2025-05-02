//package Labs;
import java.util.Scanner;
/**
 * Write a description of class Lab7 here.
 * 
 * @author Jennifer Varkey
 * @version (a version number or a date)
 */
public class Lab7 {
    public static void main(String[] args) {
        // TODO: Implement user input
        Scanner input = new Scanner(System.in);
        
        
        // TODO: Call each of your methods
        capitalizeFirstLetters(input.nextLine());

        System.out.println(getNameInitials("Jennifer Elizabeth Varkey")); //Should output J.E.V.
        System.out.println(getLexLargest("The quick brown fox jumps over the lazy dog"));//should output "the"
        System.out.println(getLexLargest("I am the very model of a modern major general"));//should output "very"

        System.out.println(getLargestByLength("The quick brown fox jumps over the lazy dog")); //should output "jumps"
        System.out.println(getLargestByLength("I am the very model of a modern major general"));//should output "general"
          
    }


    /**
     * capitalizeFirstLetters capitalizes the first letter of each word in a sentence
     * @param input indicates what String the user wants capitalizeFirstLetters to parse
     * @return newString - the value of input with all the first letters of each word capitalize
     */
    public static void capitalizeFirstLetters(String input) {
        // TODO: Parse input for words and capitalize each one.
        Scanner processString = new Scanner(input);
        String newString = "";
        while(processString.hasNext()){
            String word = processString.next();
            newString += word.substring(0,1).toUpperCase() + word.substring(1) + " ";

        }
        System.out.println(newString);
    }
    /**
     * getNameInitials takes a string as input, and gets the initials from each word
     * each intial is capitalized and followed by a period
     * @param input indicates what String the user wants getNameInitials to parse
     * @return initials - the list of initials as separated by .
     */
    public static String getNameInitials(String input){
        String initials = "";
        //declare scanner to process
        Scanner processString = new Scanner(input);
        while(processString.hasNext()){
            String word = processString.next();
            initials += word.substring(0,1).toUpperCase() + ".";

        }
        return initials;
    }

    /**
     * getLexLargest parses each word in a sentence to see which comes latest in a dictionary
     * @param input indicates what String the user wants getLexLargest to parse
     * @return largestWord - the lexographically largest word in the string
     */
    public static String getLexLargest(String input){
        //use scanner to process string
        Scanner processString = new Scanner(input);
        //failsafe to prevent potential scanner error
        if(!processString.hasNext()){
            return "";
        }
        String largestWord = processString.next();
        //keep running until every word is processed
        while(processString.hasNext()){
            String currentWord = processString.next();
            //use compareTo to see if the current word is lexographically larger, elsewise do nothing
            if(currentWord.compareTo(largestWord) > 0){
                largestWord = currentWord;
            }
        }
        //close Scanner and return value
        processString.close();
        return largestWord;
    }
    /**
     * getLexLargest parses each word in a sentence to see which comes latest in a dictionary
     * @param input indicates what String the user wants getLargestByLength to parse
     * @return largest - the largest word in the string
     */
    public static String getLargestByLength(String input){
        //if largest ends as an empty string, return ""
        String largest = "";
        int largestSize = 0;
        //declare scanner to process sentence
        Scanner processString = new Scanner(input);

        while(processString.hasNext()){
            String word = processString.next();
            if(word.length() > largestSize){
                largest = word;
                largestSize = word.length();
            }

        }
        return largest;
    }




}  
