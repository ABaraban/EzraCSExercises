package exercises.exercises2;

import support.cse131.ArgsProcessor;

public class FeetInches {

	public static void main(String[] args) {
		//
		// Prompt the user for a number of inches
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("How many inches?");
		// Convert that into feet and inches
		int newVariable = x/12;
		double feetDecimal = (double)x/12;
		double inches = (feetDecimal - newVariable) * 12;
		int inchesReal = (int) Math.round(inches);

		if (newVariable == 1){
			System.out.println(newVariable + " Foot");
			if (inches == 1) {
				System.out.println(inchesReal + "inch");
			}
			else
				System.out.println(inchesReal + "inches");
		}
		else {
			System.out.println(newVariable + "Feet");
			if (inchesReal == 1) {
				System.out.println(inchesReal + "inch");
			}
			else
				System.out.println(inchesReal + "inches");
		}

		//   BUT
		// Be sure to use the singular "foot" or "inch"
		//   where appropriate, as discussed in
		//   the introductory video
		//
		// For example, 61 inches would produce
		//    the output
		//   5 feet and 1 inch
		//

	}

}
