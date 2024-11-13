    public class TimeCalc {
        public static void main(String[] args) {
            // The following statement handles the hours part of the input.
            // It concatenates the empty string "" with the leftmost hour-digit. 
            // It then concatenates the resulting string with the rightmost hour-digit,
            // and then uses parseInt to cast the resulting string as an int.
            int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
            // Does the same with the minutes part of the input.
            int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
            
            int minutesToAdd = Integer.parseInt(args[1]);
            
            // Convert to 12-hour format
            //int hourFormat = hours > 12 ? (hours - 12) : hours;
            int hourFormat = hours;
            
            // Calculate total minutes and update hours and minutes
            int totalMinutes = (hourFormat * 60) + minutes + minutesToAdd;
            int totalHours = totalMinutes / 60;
            int newHours = totalHours % 24;
            int newMinutes = totalMinutes - (totalHours * 60);

            // Convert to 12-hour format
            int newHourFormat = newHours == 12 ? (newHours - 12) : newHours;
            
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
