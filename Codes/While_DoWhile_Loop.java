package Codes;
import java.util.Scanner;
public class While_DoWhile_Loop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); //Instantiation

		int lives = 3; //variables
		String answer;
		String question = "What word is always pronounced wrong?"; 
		String rightAnswer = "Wrong"; 
		
		System.out.println("You have 3 lives");
		System.out.println("Answer this question to win: " + question);
		
		System.out.println();
		System.out.print("Typer Your Answer: ");
		answer = scan.nextLine(); //call of user
		
		while(lives < 4) {
			
			if(answer.equalsIgnoreCase(rightAnswer)) {//condition if got the correct answer
				
				System.out.println();
				System.out.println("YOU WON!");
				lives--;
				break;
			}
			else if(answer != rightAnswer) {//condition if not
				
				lives--;
				System.out.println();
				System.out.println("You have " + lives + " live/s left");
				System.out.println("Answer this question to win: " + question);
				System.out.print("Typer Your Answer: ");
				answer = scan.nextLine();
				
				if(lives == 1) {//condition if the user lost the three lives
					
					System.out.println();
					System.out.println("YOU LOST!");
					break;
				}

			}

		} 	
	
		
		scan.close();
	}

}
