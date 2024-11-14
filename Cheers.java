// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                // Parse the user's text and convert it to upper case
		String cheeringMessage = (args[0]).toUpperCase();
                // Parse the number of times to print the cheering Message
		int numberOfCheeringLines = Integer.parseInt(args[1]);

                // vowels and letters to notice while printing the message
                String specialLetters = "AEFHILMNORSX";

                for( int i = 0; i < cheeringMessage.length(); i++ ) {
                        // store the current letter in a var for efficiency
                        char currentLetter = cheeringMessage.charAt(i);
                        
                        // print a modified Message for special and regular letters
                        if (specialLetters.indexOf(cheeringMessage.charAt(i)) != -1) {
                                System.out.println("Give me an " + currentLetter + ": " + currentLetter + "!");
                        }
                        else{
                                System.out.println("Give me a  " + currentLetter + ": " + currentLetter + "!");
                        }
                }

                // print the cheering Message the number of times requested
                System.out.println("What does that spell?");
                for(int j = 0; j < numberOfCheeringLines; j++){
                        System.out.println(cheeringMessage + "!!!");
                }


        }
}
