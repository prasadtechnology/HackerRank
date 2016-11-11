package hackerRank;

import java.util.Scanner;

public class MarsExplotion {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    int count = 0;
    for (int i = 0; i < s.length() - 2; i = i + 3) {
      if (s.substring(i, i + 3).equals("SOS")) {
        continue;
      } else {
        String sub = s.substring(i, i + 3);
        char c[] = sub.toCharArray();
        if (sub.charAt(0) != 'S') {
          count++;
        }
        if (sub.charAt(1) != 'O') {
          count++;
        }
        if (sub.charAt(2) != 'S') {
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
