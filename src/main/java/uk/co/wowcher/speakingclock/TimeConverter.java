package uk.co.wowcher.speakingclock;


public class TimeConverter {

    private static final String[] ONES = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] TENS = {
            "", "", "twenty", "thirty", "forty", "fifty"
    };

    public static String convertTimeToWords(String time) {
        // Split time string on ":" character
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        String hoursStr;
        switch (hours) {
            case 0:
                hoursStr = "midnight";
                break;
            case 12:
                hoursStr = "noon";
                break;
            default:
                hoursStr = ONES[hours % 12];
        }

        String minutesStr;
        if (minutes == 0) {
            minutesStr = "o'clock";
        } else if (minutes < 20) {
            minutesStr = ONES[minutes];
        } else {
            int tens = minutes / 10;
            int ones = minutes % 10;
            minutesStr = TENS[tens] + (ones > 0 ? " " + ONES[ones] : "");
        }


        if (minutes == 0 && (hours == 0 || hours == 12)) {
            return String.format("It's %s", hoursStr);
        } else {
            return String.format("It's %s %s", hoursStr, minutesStr);
        }
    }
}