/*
 * Lab1b.java
 *
 * This program produces the song output detailed in CSSSKL142 Lab 1 Part 3.
 * Authors: Samantha Smith, you
 */

public class Lab1B{
	public static void main(String[] args) {
		//increment from 5 -> 0
		for(int i = 5; i > 0; i--){
			//if not the final verse, print the last line from the verse before it
			if (i != 5){
				botBeer(i);
				System.out.println();
			}
			onWall(i);
			botBeer(i);
			takeOneDown(i);
		}
		System.out.println("No more bottles of root beer on the wall");
	}

	/**
	 * onWall
	 *
	 * Print the unchanging element of the line "<numBottle> bottles of beer on the wall"
	 */
	 public static void onWall(int botNum) {
		 //if the bottles on the wall are equal to one, print only one bottle
		 if (botNum == 1){
			 System.out.println(botNum + " bottle of root beer on the wall");
		 } else {
			 System.out.println(botNum + " bottles of root beer on the wall");
		 }
	 }

	/**
	 * botBeer
 	 * Note: beer was changed to root beer to match example
 	 * Print the unchanging element of the line "<numBottle> bottles of beer"
 	 */
	public static void botBeer(int botNum) {
		if (botNum == 1){
			System.out.println(botNum + " bottle of root beer");
		} else {
			System.out.println(botNum + " bottles of root beer");
		}
	}

	/**
	 * takeOneDown
	 *
	 * Print the line "Take one down and pass it around"
	 */
	 // TODO: You figure out the declaration and the method!
	public static void takeOneDown(int numBottles){
		if (numBottles == 2){
			System.out.println("If one of those bottles should happen to fall");
		} else {
			System.out.println("Take one down and pass it around");
		}
	}
}
