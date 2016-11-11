/*
 * Check next element is to be swapped or not
 * If not check next element can be swapped or not
 * If not Too chaotic
 */
package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class NewYearChaos {

  public static void main(String[] args) {
    int temp = 0;
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    for (int a0 = 0; a0 < T; a0++) {
      int count = 0;
      int n = in.nextInt();
      int q[] = new int[n];
      for (int q_i = 0; q_i < n; q_i++) {
        q[q_i] = in.nextInt();
      }
      for (int chacoIndex = 0; chacoIndex < q.length - 2; chacoIndex++) {
        if (q[chacoIndex] + 1 == q[chacoIndex + 1]) {
          continue;
        }
        if (q[chacoIndex] > q[chacoIndex + 1] && q[chacoIndex] - q[chacoIndex + 1] == 1) {
          temp = q[chacoIndex];
          q[chacoIndex] = q[chacoIndex + 1];
          q[chacoIndex + 1] = temp;
          count++;
        }
        if (q[chacoIndex + 1] > q[chacoIndex + 2] && q[chacoIndex + 2] - q[chacoIndex] == 1) {
          temp = q[chacoIndex + 2];
          q[chacoIndex + 2] = q[chacoIndex + 1];
          q[chacoIndex + 1] = temp;
          count++;
        }
      }
      if (count == 0) {
        System.out.println("Too chaotic");
      } else {
        System.out.println(count);
      }
    }
  }
}
