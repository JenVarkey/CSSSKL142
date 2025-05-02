package Labs;
// Lab3C.java
// Part 3
import java.util.Scanner;

public class Lab3C {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Let's play Rock-Paper-Scissors!");
		System.out.println("Throw your choice! Rock = 0, Paper = 1, Scissors = 2");
		//get choices for rock paper scissors game
		int playerChoice = input.nextInt();
		int computerChoice = (int)(Math.random()*3);

		//check if player choice is valid
		if (playerChoice <=2){
			//print the results of the game into a single line
			chooseString("You", playerChoice);
			chooseString("I", computerChoice);
			System.out.println(findWinner(playerChoice, computerChoice));
		} else {
			//if player selection is invalid, game cannot be won
			System.out.println("Invalid Selection, please try game again.");
		}
	}

	// intToWord
	// Convert from an integer to the relevant string, using a switch
	// choice: the integer to convert
	public static String intToWord(int choice){
		switch(choice){
			case 0:
				return "rock";
			case 1:
				return "paper";
			case 2:
				return "scissors";
			default:
				System.out.println("invalid selection");
				return "";

		}
	}

	// findWinner
	// Determine the winner from two choices
	// userChoice: the user's integer
	// compChoice: the computer's integer
	public static String findWinner(int userChoice, int computerChoice){
		//check if player's choice beats computer choice
		if ((userChoice == 0 && computerChoice == 2) || userChoice > computerChoice){
			return intToWord(userChoice) + " beats " + intToWord(computerChoice) + ". You win.";

			//check if computer choice beats player choice
		} else if ((computerChoice == 0 && userChoice == 2) || computerChoice > userChoice){
			return intToWord(computerChoice) + " beats " + intToWord(userChoice) + ". I win.";
		}
		//if neither condition above is true, the game must be a tie.
		return "Tie.";
	}
	
	// chooseString
	// prints "<player> chose <string value of choice>."
	// player: a string that is either "You" or "I"
	// choice: the player's integer
	public static void chooseString(String player, int choice){
		//print used to ensure final game results are printed into one line
		System.out.print(player + " chose " + intToWord(choice) + ". ");
	}

}
