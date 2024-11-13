// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Parse the the number of terms that should be used in the calculation
		int numberOfTerms = Integer.parseInt(args[0]);

		int denominatorForCalc = 1;

		// start with 0.0 as the initial approxed number
		double approximatedPi = 0.0;
		
		// Loop through the number of terms
		for(int i = 0; i < numberOfTerms; i++){
			// add or subtract based on the position of the term
			if (i % 2 == 0) {
				approximatedPi = approximatedPi + (1.0 / denominatorForCalc);
			}
			else{
				approximatedPi = approximatedPi - (1.0 / denominatorForCalc);
			}
			denominatorForCalc += 2; // Increase the denominator after the calculation
		}

		approximatedPi *= 4; // multiply the result by 4 becuase the sum converges to π / 4.

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:	 " + approximatedPi);
	}
}
