/*
 * find it is thunder or ordinary
 * if thunder remove energy - 1 - extralossof energy for thunder
 * else just remove -1
 * if it reaches 0 then quit
 */
package hackerRank;

import java.util.Scanner;

public class JumpingCloudsRevisited {

  public static void main(String[] args) {
    int energy = 100;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int c[] = new int[n];
    for (int c_i = 0; c_i < n; c_i++) {
      c[c_i] = in.nextInt();
    }
    for (int cloudIndex = 0; cloudIndex <= c.length - k; cloudIndex = cloudIndex + k) {
      if (cloudIndex + k == c.length || c[cloudIndex + k] == 0) {
        energy = energy - 1;
      } else {
        energy = energy - 3;
      }
    }
    if (c[0] == 1) {
      energy = energy - 2;
    }
    System.out.println("Final energy :" + energy);
  }
}
