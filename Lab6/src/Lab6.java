/**
 * Created by Kevin Corbett on 9/23/15.
 */
public class Lab6 {
    public static void main(String[] args) {
        double years = 0.0;
        double months = 0.0;
        double weeks = 0.0;
        double days = 0.0;
        double hours = 0.0;
        double minutes = 0.0;
        double seconds = 0.0;
        if (printResult(years, months, weeks, days, hours, minutes, seconds) == true) {
            System.out.println("Dude, with all due respect, ust give up!");
        }
    }

    public static boolean printResult(double years, double months, double weeks, double days, double hours, double minutes, double seconds) {

        System.out.println("It will take you ");
        System.out.printf("%.0f years, ", years);
        System.out.printf("%.0f months, ", months);
        System.out.printf("%.0f weeks, ", weeks);
        System.out.printf("%.0f days, ", days);
        System.out.printf("%.0f hours, ", hours);
        System.out.printf("%.0f minutes, ", minutes);
        System.out.printf("%.0f seconds, ", seconds);

        return (years > 1.0);
    }
}