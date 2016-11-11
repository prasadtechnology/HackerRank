/*
 *Did some research and based on that implemented conditions
 */
package hackerRank;

import java.util.Scanner;

public class CircularRotation {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    int no_of_rotations = in.nextInt();
    int test = in.nextInt();
    for (int j = 0; j < arr.length; j++) {
      arr[j] = in.nextInt();
    }
    if (no_of_rotations >= n) {
      no_of_rotations = no_of_rotations % n;
    }
    for (int i = 0; i < test; i++) {
      int position = in.nextInt();
      int index = 0;
      if (position == 0) {
        index = n - no_of_rotations;
      }
      if (position == no_of_rotations) {
        index = 0;
      }
      if (no_of_rotations > position) {
        index = n - (no_of_rotations - position);
      } else {
        index = n - (n - position + no_of_rotations);
      }
      System.out.println(arr[index]);
    }
  }
}
