/**
 * Created by Kevin Corbett on 11/18/15.
 */

package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WiFi {
  private int[] myArray;
  private int bandwidth;

  public WiFi() {
    bandwidth = 150;
  }

  public int getValue(int value) {
    return myArray[value];
  }

  public void initArray(File file) {
    try {
      Scanner scanner = new Scanner(file);
      int count = 0;
      myArray = new int[scanner.nextInt()];
      while (scanner.hasNext()) {
        myArray[count] = scanner.nextInt();
        //System.out.println(myArray[count]);
        count++;
      }
    } catch (FileNotFoundException exception) {
      System.out.println("File Not Found");
    }
  }

  public double calcBandwidth(int numGuests) {
    if (numGuests == 0)
      return 0;
    else
      return (double) bandwidth / numGuests;
  }

  public double calcAvgBandwidth() {
    double avg = 0;
    for (int i = 0; i < myArray.length; i++) {
      avg += calcBandwidth(myArray[i]);
    }
    avg /= myArray.length;
    return Double.parseDouble(String.format("%.2f", avg));
  }

  public int getSize() {
    return myArray.length;
  }

  public void bubbleSort() {
    int timesToRun = 100;
    double totalComparisons = 0;
    while (timesToRun != 0) {
      int[] thisArray = new int[10];
      for (int i = 0; i < thisArray.length; i++) {
        thisArray[i] = (int) (Math.random() * 100);
      }
      int n = thisArray.length;
      int temp;
      int comparisons = 0;
      for (int i = 0; i < n; i++) {
        for (int j = 1; j < (n - 1); j++) {
          comparisons++;

          if (thisArray[j - 1] > thisArray[j]) {
            temp = thisArray[j - 1];
            thisArray[j - 1] = thisArray[j];
            thisArray[j] = temp;
          }
        }
      }
      System.out.println(101 - timesToRun + ". Number of comparisons: " + comparisons);
      totalComparisons += comparisons;
      timesToRun--;
    }
    System.out.println("Average comparisons for running 10 times: " + totalComparisons / 100);
  }

  public static void main(String[] args) {
    WiFi wifi = new WiFi();
    File file = new File("/home/archangel/Google Drive/School/CMPT 220/Labs/Lab 12/src/main/array1.txt");
    wifi.initArray(file);
    for (int i = 0; i < wifi.getSize(); i++) {
      System.out.println("Average available bandwidth with " + wifi.getValue(i) + " guests: " + wifi.calcBandwidth(wifi.getValue(i)));
    }
    System.out.println("Average total bandwidth: " + wifi.calcAvgBandwidth());

    try {
      PrintWriter printWriter = new PrintWriter("kevin.txt");
      for (int i = 0; i < wifi.getSize(); i++) {
        printWriter.println("Average available bandwidth with " + wifi.getValue(i) + " guests: " + wifi.calcBandwidth(wifi.getValue(i)));
      }

      printWriter.println("Average total bandwidth: " + wifi.calcAvgBandwidth());
      printWriter.close();
    } catch (FileNotFoundException exception) {
      System.out.println("File not found");
    }
    wifi.bubbleSort();
  }
}
