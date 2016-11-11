/*
 * Find equal element
 * Substract indexes
 * Print min distance
 */
package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinDistance {

  public static void main(String[] args) {
    int min = 0;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int A[] = new int[n];
    for (int A_i = 0; A_i < n; A_i++) {
      A[A_i] = in.nextInt();
    }
    for (int loopIndex = 0; loopIndex < A.length; loopIndex++) {
      for (int minDisIndex = loopIndex + 1; minDisIndex < A.length; minDisIndex++) {
        if (A[loopIndex] == A[minDisIndex]) {
          if (min == 0) {
            min = minDisIndex - loopIndex;
          } else if (min > minDisIndex - loopIndex) {
            min = minDisIndex - loopIndex;
          }
        }
      }
    }
    if (min == 0) {
      System.out.println(-1);
    } else {
      System.out.println(min);
    }

  }
}
