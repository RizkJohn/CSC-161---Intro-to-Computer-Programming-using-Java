package chapter_5;

import java.util.Scanner;

public class SubtractionQuizLoop2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//this app asks user N math questions
		long startTime = 0;
		final int NUMBER_OF_QUESTION = 3; //constant value
		int correctCount = 0; //to keep track of correct answers
		 //number of questions we are on
		
		//this app also measures time while the user answers questions...
		for(int count = 0; count < NUMBER_OF_QUESTION; count++) {
			startTime = System.currentTimeMillis();
			int number1 = (int)(Math.random() * 100);
			int number2 = (int)(Math.random() * 100);
			System.out.print(number1 + " - " + number2 + " = ? ");
			int answer = input.nextInt();
			
			if (answer == (number1 - number2)) {
				correctCount++;
				System.out.println("Correct");
			}else {
				System.out.println("Incorrect. The correct answer is " + (number1 - number2));
			}
		}//endOfWhile
		
		long stopTime = System.currentTimeMillis();
		System.out.println("You answered " + correctCount + " questions correctly, in " + (stopTime - startTime) / 1000 + " seconds");
		System.out.println("Thanks for playing!!!");

	}

}
