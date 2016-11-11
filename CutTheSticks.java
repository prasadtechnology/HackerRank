/*
 * Sort the array
 * continue if element is zero
 * Find the minimum index 
 * Substract minimum value from minimum index 
 * 
 */
package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class CutTheSticks {

  public static void main(String args[]) {
    int minValue = 0;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for (int arr_i = 0; arr_i < n; arr_i++) {
      arr[arr_i] = in.nextInt();
    }
    for (int loopIndex = 0; loopIndex < arr.length; loopIndex++) {
      Arrays.sort(arr);
      if (arr[loopIndex] == 0) {
        continue;
      }
      minValue = arr[loopIndex];
      for (int startMinIndex = loopIndex; startMinIndex < arr.length; startMinIndex++) {
        arr[startMinIndex] = arr[startMinIndex] - minValue;
      }
      System.out.println(arr.length - loopIndex);
    }

  }

//  public static void printArray(int arr[]) {
//    for (int i : arr) {
//      System.out.print(i + " ");
//    }
//    System.out.println("");
//  }
}
