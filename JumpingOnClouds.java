/*
 * Check next step is 0 or not
 * if zero check next value is zero or not
 * if zero steps 2 else step 1 
 */
package hackerRank;

import java.util.Scanner;

public class JumpingOnClouds {

  public static void main(String[] args) {
    int stepCount = 0;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int c[] = new int[n];
    for (int c_i = 0; c_i < n; c_i++) {
      c[c_i] = in.nextInt();
    }
    for (int cloudIndex = 0; cloudIndex < c.length - 1;) {
      if (c[cloudIndex + 1] == 0) {
        if ((cloudIndex + 2) != c.length && c[cloudIndex + 2] == 0) {
          cloudIndex = cloudIndex + 2;
        } else {
          cloudIndex++;
        }
      } else {
        cloudIndex = cloudIndex + 2;
      }
      stepCount++;
    }
    System.out.println(stepCount);
  }
}
