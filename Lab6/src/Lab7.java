import java.util.Scanner;

/**
 * Created by Kevin Corbett on 9/30/15.
 */
public class Lab7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[100];
        double average = 0.0;

        System.out.println("The size of the array is: " + intArray.length);
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
            average += intArray[i];
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("%d ", intArray[i]);
        }
        average = average / intArray.length;
        System.out.printf("\nThe average of these numbers is: %f ", average);
        System.out.printf("\nThe amount of numbers above the average is: %d ", getNumAboveGiven(average, intArray));
    }

    public static int getNumAboveGiven(double average, int[] input) {
        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > average) {
                counter++;
            }
        }
        return counter;
    }
}