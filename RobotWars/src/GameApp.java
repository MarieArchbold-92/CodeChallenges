

import java.util.Random;
import java.util.Scanner;


public class GameApp {


	public static void main(String[] args) {
		GameApp game = new GameApp();
		int choice=game.runMenu();


		switch(choice){
		case 1:
			System.out.println("Welcome to the battle for humanity\nBattle Mode"
					+ " <ACTIVATED>..........RUN PROGRAM..........<FIGHT>");
			game.runProgram();
			break;
		case 2:
			System.out.println("Welcome to the battle for humanity\nLastman Standing Game Mode"
					+ " <ACTIVATED>..........RUN PROGRAM..........<FIGHT>");
			game.runLastManStanding();
			break;
		case 3:
			System.out.println("Thank you Good Bye");
			break;
		}


	}
	private void runLastManStanding() {


	}
	private void runProgram() {
		String[] Human = new String[]{"Pilot","Foot soldier", "Sniper","Engineer","Support"};//5 humans
		String humanType;
		String[] Robot = new String[]{"Droid","Magnaguards","Assassin Droid","Battle droid","Droideka"};//5 robots
		String robotType;
		
		
		
		int hunmanWins=0;
		int robotWins=0;
		int humanLosses=0;
		int robotLosses=0;
		int draws=0;
		
		//Randomly setting the power value and randomly choosing the human types
		Random humanPower = new Random();
		int rndHValue = humanPower.nextInt(100);
		humanType= Human[humanPower.nextInt(Human.length)];
		
		//Randomly setting the power value and randomly choosing the human types
		Random robotPower = new Random();
		int rndRValue = robotPower.nextInt(100);
		robotType = Robot[robotPower.nextInt(Robot.length)];

	}
	public int runMenu(){

		Scanner Scan = new Scanner(System.in);
		System.out.println("1)Plays battle mode\n2)Plays lastman standing mode\n3)Exits the program");
		return Scan.nextInt();




	}

}
