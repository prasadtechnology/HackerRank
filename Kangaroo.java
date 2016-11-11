package hackerRank;

import java.util.Scanner;

public class Kangaroo {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    long k1 = input.nextInt();
    long k1s = input.nextInt();
    long k2 = input.nextInt();
    long k2s = input.nextInt();
      System.out.println("start : "+(k2 - k1));
      System.out.println("step : "+(k2s - k1s));
    if ((k2 - k1) * (k2s - k1s) < 0
            && (k2 - k1) % (k2s - k1s) == 0) {
      System.out.println("YES");

      return;
    } else {
      System.out.println("NO");
      return;
    }
  }
}
//      if ((k1 < k2 && k1s < k2s) || (k1 > k2 && k1s > k2s) || (k1 != k2 && k1s == k2s)) {
//        System.out.println("NO");
//        return;
//      } else if (k1 + (k1s * loopIndex) == k2 + (k2s * loopIndex) || (k1 == k2 && k1s == k2s)) {
//        System.out.println("K1 YES : " + k1 + (k1s * loopIndex));
//        System.out.println("K2 YES : " + k2 + (k2s * loopIndex));
//        return;
//      }
