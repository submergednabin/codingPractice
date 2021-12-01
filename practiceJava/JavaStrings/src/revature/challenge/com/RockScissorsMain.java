package revature.challenge.com;

import java.util.Scanner;

public class RockScissorsMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Player1 Input");
		String input1 = sc.nextLine();
		System.out.println("Player2 Input");
		String input2 = sc.nextLine();
		
		if(input1.equals("scissors") || input1.equals("paper") || input1.equals("rock")) {
			
			switch(input2) {
			
				case "rock":{
					if(input1.equals("paper")) {
						System.out.println("Player1 wins");
					}else if(input1.equals("rock")) {
						System.out.println("Tie");
					}else if(input1.equals("scissors")) {
						System.out.println("Player2 wins");
					}else {
						System.out.println("Invalid input");
					}
					break;
				}
				
				case "paper":{
					if(input1.equals("paper")) {
						System.out.println("Tie");
					}else if(input1.equals("rock")){
						System.out.println("Player2 wins");
					}else if(input1.equals("scissors")) {
						System.out.println("Player1 wins");
					}else {
						System.out.println("Invalid input");
					}
					break;
				}
				
				case "scissors":{
					if(input1.equals("paper")){
						System.out.println("Player2 wins");
					}else if(input1.equals("scissors")) {
						System.out.println("Tie");
					}else if(input1.equals("rock")) {
						System.out.println("Player1 wins");
					}else {
						System.out.println("Invalid input");
					}
					break;
				}
			}
		}
	}

}
