// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	     // Parse the highest seed N, for which the test will be taken 
		int highestSeed = Integer.parseInt(args[0]);
		// Parse the mood to run - verbose or concise
		String mood = args[1];

		int currentHailstone = 0;

		if (mood.equals("v")) {
			for(int i = 1; i <= highestSeed; i++){
			
				// Reset the steps counter
				int steps = 1;			
				
				// Initial the first Hailstone for the test and print it
				currentHailstone = i;
				System.out.print(currentHailstone + " ");
				
				// Handle edge case of starting with 1 as a seed
				if (currentHailstone == 1) {
					currentHailstone = (currentHailstone * 3) + 1;
					System.out.print(currentHailstone + " ");
					steps++;
				}
	
				// Run the Collatz conjecture test for all seeds between 1 and highestSeed
				while (currentHailstone != 1) {
					if (currentHailstone % 2 ==0) {
						currentHailstone = currentHailstone / 2;
						System.out.print(currentHailstone + " ");
						steps++;
					}
					else{
						currentHailstone = (currentHailstone * 3) + 1;
						System.out.print(currentHailstone + " ");
						steps++;
					}
				}
				System.out.println("(" + steps + ")");
			}	
			System.out.println("Every one of the first " + highestSeed + " hailstone sequences reached 1.");
		}
		else {
			for(int i = 1; i <= highestSeed; i++){
			
				// Initial the first Hailstone for the test
				currentHailstone = i;
				
				// Handle edge case of starting with 1 as a seed
				if (currentHailstone == 1) {
					currentHailstone = (currentHailstone * 3) + 1;
				}
	
				// Run the same Collatz conjecture testbut witout verbose and without counting steps.
				while (currentHailstone != 1) {
					if (currentHailstone % 2 ==0) {
						currentHailstone = currentHailstone / 2;
					}
					else{
						currentHailstone = (currentHailstone * 3) + 1;
					}
				}
			}	
			System.out.println("Every one of the first " + highestSeed + " hailstone sequences reached 1.");
		}
		}	
}
