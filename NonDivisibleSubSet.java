//we can get good knowledge here
package hackerRank;

import java.util.Scanner;

public class NonDivisibleSubSet {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    int[] remainders = new int[k];
    for (int i = 0; i < n; i++) {
      int ai = sc.nextInt();
      remainders[ai % k]++;
    }
    for (int rem : remainders) {
      System.out.print(rem + " ");
    }
    System.out.println("");
    int result = 0;
    for (int i = 0; i * 2 <= k; i++) {
      int opposite = (k - i) % k;
      if (i == opposite) {
        result += Math.min(remainders[i], 1);
      } else {
        result += Math.max(remainders[i], remainders[opposite]);
      }
      System.out.println("result : " + result);
    }
    System.out.println(result);

    sc.close();
  }
}
