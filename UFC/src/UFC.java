import java.util.Scanner;

public class UFC {

	public static void main(String[] args){
		float userWeightPounds = 0.0F;
		boolean invalidInput = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("1.Enter weight in pounds: \n2.Enter weight in kg: ");
		do{
			
			System.out.print("Please enter choice: ");
			int weightChoice = scan.nextInt();
			//System.out.println(weightChoice);

			if(weightChoice == 1){
				System.out.print("Enter your weight(lb): ");
				userWeightPounds = scan.nextInt();
				invalidInput = false;
			} else if(weightChoice == 2){
				System.out.print("Enter your weight(kg): ");
				int userWeight = scan.nextInt();
				userWeightPounds = userWeight * 2.2F;
				invalidInput = false;
			} else {
				System.out.println("Please enter valid choice");
				invalidInput = true;
			}
		} while (invalidInput);
		
		if(userWeightPounds > 265){
			System.out.println("You are not eligible to fight in any category.");
		} else if (userWeightPounds > 205){
			System.out.println("You are eligible to fight in the heavyweight category.");
		}else if(userWeightPounds > 185){
			System.out.println("You are eligible to fight in the light heavyweight category.");
		}else if(userWeightPounds > 170){
			System.out.println("You are eligible to fight in the middleweight category.");
		}else if(userWeightPounds > 155){
			System.out.println("You are eligible to fight in the welterweight category.");
		}else if(userWeightPounds > 144){
			System.out.println("You are eligible to fight in the lightweight category.");
		}else{
			System.out.println("You are not eligible to fight in any category.");
		}
	}
}