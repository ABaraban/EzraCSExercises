package exercises.exercises2;

public class Die {

	public static void main(String[] args) {

		//
		// Use the random number generator
		//    (Math.random())
		double rand = Math.random();
		double rand2 = 6 * rand;
		// so that this program prints out one of
		// the following integers:
		//   1 2 3 4 5 6
		// with equal probability
		//
		if (rand2 <= 1) {
			System.out.println("1");
		}
		else if (rand2 <= 2) {
			System.out.println("2");

		}
		else if (rand2 <= 3) {
			System.out.println("3");

		}
		else if (rand2 <= 4) {
			System.out.println("4");

		}
		else if (rand2 <= 5) {
			System.out.println("5");

		}
		else {
			System.out.println("6");

		}
		// Note this program does not prompt the user
		//  for input, it just produces one of the
		//  above integers as output, as if by 
		//  throw of a die
		//

	}

}
