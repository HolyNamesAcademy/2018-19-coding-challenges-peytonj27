package challenges;

public class NumberThree {

    /**
     * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
     *
     * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
     * Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
     *
     * The method should return a new string representing the input time in 24 hour format.
     *
     * timeConversion has the following parameter(s):
     *
     * Example:
     * s: 07:05:45AM
     * return: 07:05:45
     *
     * Example:
     * s: 07:05:45PM
     * return: 19:05:45
     *
     * @param s a string representing time in 12 hour format
     * @return the string s in 24 hour format
     */
    public String timeConversion(String s)
    {
        String letters = s.substring(s.length()-2);
        String firstTwoNumbers = s.substring(0, 2);
        String time = "";
        if(letters.equals("AM") && !firstTwoNumbers.equals("12"))
        {
            time = s.substring(0, s.length()-2);
        }
        if(letters.equals("AM") && firstTwoNumbers.equals("12"))
        {
            time = "00" + s.substring(2, s.length()-2);
        }
        if(letters.equals("PM") && !firstTwoNumbers.equals("12"))
        {
            int numbers = Integer.parseInt(firstTwoNumbers);
            numbers += 12;
            time = numbers + s.substring(2, s.length()-2);
        }
        if(letters.equals("PM") && firstTwoNumbers.equals("12"))
        {
            time = s.substring(0, s.length()-2);
        }
        return time;
    }
}
