package ie.gmit.dip;

import java.util.Scanner;

public class NumberGuessingGame {
	// instance variables are private
	private Scanner s;
	private static final int GUESSES = 12;
	private int num;

	public NumberGuessingGame() {
		s = new Scanner(System.in);
		num = (int) (Math.random() * 100);

	}

	public void start() {
		System.out.println("############################");
		System.out.println("### Number Guessing Game ### ");
		System.out.println("############################");

		boolean notGuessed = true;
		int counter = 0;

		while (notGuessed && counter < GUESSES) {
			System.out.println("Enter a number between 1 and 100");
			int guess = Integer.parseInt(s.next());

			if (guess == num) {
				System.out.println("Correct! Well done");
				notGuessed = false;
			} else if (guess > num) {
				System.out.println("Too high!");
			} else {
				System.out.println("Too low!");
			}
			counter++;
			System.out.println("You have " + ((GUESSES - counter) + " tries remaining..."));
		}

		if (notGuessed) {
			System.out.println("Out of tries... The correct answer was " + num);
		}
	}

	public static void main(String[] args) {
		new NumberGuessingGame().start();
	}
}
