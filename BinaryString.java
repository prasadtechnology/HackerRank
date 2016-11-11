package hackerRank;

import java.util.Scanner;

public class BinaryString {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int count = 0;
    String s = in.next();
    for (int i = 0; i < n - 2;) {
      if (s.charAt(i) == '1') {
        i = i + 1;
        continue;
      }
      if ("010".equals(s.substring(i, i + 3))) {
        i = i + 3;
        count++;
      } else {
        i++;
      }
    }
    System.out.println(count);
  }
}
