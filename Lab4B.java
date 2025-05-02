//package Labs;
import java.util.Scanner;
/**
 * Write a description of class Lab4 here.
 * 
 * @author Jennifer Varkey
 * @version 1/31/2025
 */


public class Lab4B {

    public static void main(String[] args) {

        //test straightLineBox with a size of 3 and size of 5 respectively
        straightLineBox(3);
        straightLineBox(5);

        //test boxMaker - test with values 4 and 7
        boxMaker();
        boxMaker();

        //test triangle with values 3 and 6
        triangle(3);
        triangle(6);

        //test xPattern with values 2 and 8
        xPattern(2);
        xPattern(8);

    }

    /**
	 * straightLineBox
	 * 
     * Produces and displays a box of straight lines using asterisks per lab instructions
	 * 
	 * @param size   int  The size of the box
     */
    public static void straightLineBox(int size) {
        System.out.println("For size " + size + ":");
        for(int i = 0; i<size; i++){
            for(int j = 0; j < size; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    /**
	 * boxMaker
	 * 
     * Void method that asks the user for an integer size, and prints box using asterisks
     */
    public static void boxMaker() {
        //get user input for size
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a box size: ");
        int boxSize = input.nextInt();

        //print box top
        for(int i = 0; i < boxSize; i++){
            System.out.print("*");
        }
        System.out.println();

        //print middle of box
        for(int k = 0; k < boxSize - 2; k++){
            System.out.print("*");
            for(int j = 0; j < boxSize - 2; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }

        //print box bottom
        for(int i = 0; i < boxSize; i++){
            System.out.print("*");
        }
        System.out.println();

    }

    /**
	 * triangle
	 * 
     * Void method to print a shape that is a triangular pattern with sides of 6 asterisks
     * Refer to detailed instructions in lab
	 * 
	 * @param   number   int  The width and length of the triangle
     */
    public static void triangle(int number) {
        int triangleSize = number;
       int spaces = 0;
       for(int i = 0; i<triangleSize; i++){
           for(int j = 0; j < spaces; j++){
               System.out.print(".");
           }
           for(int k = 0; k < number; k++){
               System.out.print("*");
           }
           spaces++;
           number--;
           System.out.println();
       }

    }

    /**
	 * xPattern
	 * 
     * void method to print a shape that is an "X" pattern with arms of 3 asterisks each.
     * refer to detailed instructions in lab 
	 * 
	 * @param   number   int  The length of the arms of the "X" 
     */
    public static void xPattern(int number) {
        for(int i = 0; i < number; i++){
            for(int j = 0; j < number; j++){
                if(i == j){
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.print(".");
            for(int j = number - 1; j >= 0; j--){
                if(i == j){
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }

        for(int i = 0; i < number; i++){
            System.out.print(".");
        }
        System.out.print("*");
        for(int i = 0; i < number; i++){
            System.out.print(".");
        }
        System.out.println();
        for(int i = number-1; i >=0; i--){
            for(int j = 0; j < number; j++){
                if(i == j){
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.print(".");
            for(int j = number - 1; j >= 0; j--){
                if(i == j){
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }


} // end class Lab4B
