    public class TimeCalc {
        public static void main(String[] args) {
            // Parse hours and minutes from the first argument in "hh:mm" format
            int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
            int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
            
            // Parse minutesto add from the second argument
            int minutesToAdd = Integer.parseInt(args[1]);
            
            // Convert to 12-hour format
            //int hourFormat = hours > 12 ? (hours - 12) : hours;
            //int hourFormat = hours;
            
            // Calculate total minutes and update hours and minutes
            int totalMinutes = (hours * 60) + minutes + minutesToAdd;
            int totalHours = totalMinutes / 60;
            int newHours = totalHours % 24;
            int newMinutes = totalMinutes - (totalHours * 60);

            // Convert to 12-hour format
            //int newHourFormat = newHours == 12 ? (newHours - 12) : newHours;
            int newHourFormat = newHours;
            
            // Add padding of '0' to digits as needed 
            String outputHour;
            String outputMinute; 
            if (newHourFormat < 10) {
                outputHour = '0' + String.valueOf(newHourFormat);
            }
            else{
                outputHour = String.valueOf(newHourFormat);
            }

            if (newMinutes < 10) {
                outputMinute = '0' + String.valueOf(newMinutes);
            }
            else{
                outputMinute = String.valueOf(newMinutes);
            }

            // Final output message
            System.out.println(outputHour + ':' + outputMinute);
        }
    }
