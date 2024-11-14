    public class TimeCalc {
        public static void main(String[] args) {
            // Parse hours and minutes from the first argument in "hh:mm" format
            int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
            int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
            
            // Parse minutes to add from the second argument
            int minutesToAdd = Integer.parseInt(args[1]);
            
            // Calculate total minutes and update hours and minutes
            int totalMinutes = (hours * 60) + minutes + minutesToAdd;
            int totalHours = totalMinutes / 60;
            int newHours = totalHours % 24;
            int newMinutes = totalMinutes - (totalHours * 60);
            
            // Add padding of '0' to digits as needed
            String outputHour = (newHours < 10 ? "0" : "") + newHours;
            String outputMinute = (newMinutes < 10 ? "0" : "") + newMinutes;

            // Final output message
            System.out.println(outputHour + ':' + outputMinute);
        }
    }
