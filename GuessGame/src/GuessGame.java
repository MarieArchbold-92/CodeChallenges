import java.util.Random;
import java.util.Scanner;

public class GuessGame {
	public static void main (String [] args){
		
		int userInput = 0;
		int guesses = 0;
		int[] numbersGuessed = new int[20];
		
		
		//Generating random numbers
		Scanner scan = new Scanner(System.in);
		Random random = new Random(System.nanoTime());
		int rnd = random.nextInt(19) +1;

		boolean isPlaying = true;
		boolean alreadyGuessed = false;
		
		System.out.println("Welcome to Guess Game!");

		for(;isPlaying;){
			
			//Reset alreadyGuessed to false
			alreadyGuessed = false;
			
			//Get user input and validate that it is a number.
			System.out.println("Please enter a number between 1 and 20:");
			try{
				String input = scan.next();
				
				userInput = Integer.parseInt(input);
				
				
			}catch(Exception e){
				System.out.println("Invalid input, please enter a number.");
				continue;
			}
			
			//Validate that the input number is in the correct range.
			if(userInput < 1 || userInput > 20){
				System.out.println("You must enter a number between 1 and 20. Try again.");
				continue;
			}
			
			//Validate that the user had not already guessed the input number.
			for(int i : numbersGuessed){
				if(i == userInput){
					System.out.println("You already guessed that number, guess again.");
					
					//display numbers already guessed
					System.out.println("Numbers already guessed are: " + userInput + random.nextInt(19));
					alreadyGuessed = true;
					break;
				}
				
			}
			if(alreadyGuessed){
				continue;
			}
			numbersGuessed[guesses] = userInput;
			guesses++;
			if(userInput == rnd){

				System.out.println("Congratulations! The correct number was " + rnd + "!");
				System.out.println("It took you " + guesses + " guesses.");
				while(true){
					guesses = 0;
					System.out.println("Do you wish to play again (Y/N)?");
					String tempInput = scan.next();
					if(tempInput.length() > 1){
						System.out.println("Please enter only one character.");
						continue;
					}
					char playAgainChar = tempInput.charAt(0);
					
					if(playAgainChar == 'Y'){
						userInput = 0;
						rnd = random.nextInt(19) +1;
						for(int i = 0; i < numbersGuessed.length; i++){
							numbersGuessed[i] = 0;
						}
						break;
					}else if(playAgainChar == 'N'){
						System.out.println("Thank you for playing, goodbye.");
						isPlaying = false;
						break;
					}else{
						System.out.println("Incorrect input, try again!");
					}
				}

			}

		}


		//System.out.println("Hello World");
	}
}

