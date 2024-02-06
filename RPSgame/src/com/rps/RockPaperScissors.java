package com.rps;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		while(true) {
		String[] rps= {"r", "p", "s"};
		String computerMove=rps[new Random().nextInt(rps.length)];
	
		String playerMove;
		while(true) {
		    System.out.println("Please enter your move (r, p, s)");
		    playerMove = scanner.nextLine();
		    if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")){
		    	break;
		    }
		    System.out.println(playerMove+" is not valid move");
		}
		
		System.out.println("Computer played: "+ computerMove);
		
		if (playerMove.equalsIgnoreCase(computerMove)) {
			System.out.println("The game was tie!");
		}
		else if (playerMove.equalsIgnoreCase("r")) {
			if (computerMove.equalsIgnoreCase("p")) {
				System.out.println("You lose!");
			}else if (computerMove.equalsIgnoreCase("s")) {
				System.out.println("You Win!");
			}
		} 		else if (playerMove.equalsIgnoreCase("p")) {
			if (computerMove.equalsIgnoreCase("r")) {
				System.out.println("You Win!");
			}else if (computerMove.equalsIgnoreCase("s")) {
				System.out.println("You lose!");
			}
		} 		else if (playerMove.equalsIgnoreCase("s")) {
			if (computerMove.equalsIgnoreCase("p")) {
				System.out.println("You Win!");
			}else if (computerMove.equalsIgnoreCase("r")) {
				System.out.println("You lose!");
			}
		}
      	System.out.println("Let's Play again!");
		}	
	}
}





























