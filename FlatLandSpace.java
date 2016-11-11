/*
 * compare non space station with other space stations
 * 
 * and open the template in the editor.
 */
package hackerRank;

import java.util.Scanner;

public class FlatLandSpace {

  public static void main(String args[]) {
    int maxDisFromSpace = 0;
    int minDisFromSpace = 0;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int c[] = new int[m];
    for (int c_i = 0; c_i < m; c_i++) {
      c[c_i] = in.nextInt();
    }
//    for (int cityIndex = 0; cityIndex < n; cityIndex++) {
//      for (int spaceIndex = 0; spaceIndex < c.length; spaceIndex++) {
//        if (minDisFromSpace > c[spaceIndex] - cityIndex) {
//          minDisFromSpace = Math.abs(c[spaceIndex] - cityIndex);
//        }
//      }
//      System.out.println("min is :" + minDisFromSpace);
//      if (maxDisFromSpace < minDisFromSpace) {
//        maxDisFromSpace = minDisFromSpace;
//      }
//    }
    System.out.println("Ressult is :" + maxDisFromSpace);
  }

}
