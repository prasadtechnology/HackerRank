/*
Take two variables
one variable to store current element
another variable for counter
take one variable greater than one
 */
package hackerRank;

import java.util.Scanner;

public class DivisibleSumPairs {

  public static void main(String args[]) {
    int pairCounter = 0;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int a[] = new int[n];
    for (int a_i = 0; a_i < n; a_i++) {
      a[a_i] = in.nextInt();
    }
    for (int loopIndex = 0; loopIndex < a.length - 1; loopIndex++) {
      for (int nextIndex = loopIndex + 1; nextIndex < a.length; nextIndex++) {
        if ((a[loopIndex] + a[nextIndex]) % k == 0) {
          pairCounter++;
        }
      }
    }
    System.out.println(pairCounter);
  }
}
