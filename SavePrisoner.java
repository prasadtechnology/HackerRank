/*
 * If sweets greater than prisoners then reduce to less than prisoners
 * Now you can find last prisoner
 * 
 */
package hackerRank;

import java.util.Scanner;

public class SavePrisoner {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int testCases = in.nextInt();

    for (int testIndex = 0; testIndex < testCases; testIndex++) {
      int prisoners = in.nextInt();
      int sweets = in.nextInt();
      int startPrisoner = in.nextInt();
      int lastPrisoner = 0;

      if (sweets > prisoners) {
        sweets = sweets % prisoners;
      }
      int current = (sweets + startPrisoner - 1);
      lastPrisoner = (current > prisoners) ? current % prisoners : current;
      System.out.println(lastPrisoner);
    }
  }
}
