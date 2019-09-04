package exercises.exercises2;

import support.cse131.ArgsProcessor;

public class Heads {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("How many times would you like to run?");
		int sumFlips = 0;
		for (int i = 1; i < N; i = i + 1) {
			// what are the concepts?
			int numHeads = 0;
			int numFlips = 0;

			// now flip a coin until we see 10 heads
			while (numHeads != 10) {
				boolean isHeads = Math.random() < 0.5;
				if (isHeads) {
					numHeads = numHeads + 1;
				}
				numFlips = numFlips + 1;

			}
			sumFlips = sumFlips + numFlips;
			// here, numHeads should be 10


			System.out.println("Number of flips was " + numFlips);
			System.out.println("The average number of flips is " + (1.0 * sumFlips/i));


		}

	}
}
