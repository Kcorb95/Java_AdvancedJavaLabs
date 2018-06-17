import java.util.Scanner;

/**
 * Created by Kevin Corbett on 10/7/15.
 */
public class Lab8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fFormat = scanner.nextLine();
        if (!fFormat.equals("P2")) {
            System.out.println("Please use the correct format: P2");
            System.exit(0);
        }

        int nCols = scanner.nextInt();
        int nRows = scanner.nextInt();
        int maxVal = scanner.nextInt();

        int[][] theData = new int[nRows][nCols];

        for (int i = 0; i < theData.length; i++) {
            for (int j = 0; j < theData[0].length; j++) {
                theData[i][j] = scanner.nextInt();
            }
        }
        printResult(maxVal, theData);
        int[][] mapArray = getMapArray(theData, maxVal);

        for (int i = 0; i < theData.length; i++) {
            for (int j = 0; j < theData[0].length; j++) {
                theData[i][j] = mapArray[theData[i][j]][1];
            }

        }
        printResult(255, theData);

    }

    public static int[][] getMapArray(int[][] theData, int maxVal) {
        int[][] mapArray = new int[maxVal + 1][2];
        for (int i = 0; i < theData.length; i++) {
            for (int j = 0; j < theData[0].length; j++) {
                mapArray[theData[i][j]][0]++;
            }
        }

        int countNonZeros = 0;
        for (int i = 0; i < mapArray.length; i++) {
            if (mapArray[i][0] > 0) {
                countNonZeros++;
            }
        }

        int theMap = (int) Math.floor(255.0 / (double) (countNonZeros - 1));
        mapArray[mapArray.length - 1][1] = 255;
        int aCounter = 1;
        for (int i = 1; i < mapArray.length - 1; i++) {
            if (mapArray[i][0] > 0) {
                mapArray[i][1] = i * theMap;
                aCounter++;
            }
        }
        return mapArray;
    }

    public static void printResult(int maxVal, int[][] theData) {
        System.out.println("P2");
        System.out.println("Number of columns: " + theData[0].length + "\nNumber of Rows: " + theData.length);
        System.out.println("The maximum value is: " + maxVal);

        for (int i = 0; i < theData.length; i++) {
            for (int j = 0; j < theData[0].length; j++) {
                System.out.printf("%d ", theData[i][j]);
            }
            System.out.println();
        }
    }
}