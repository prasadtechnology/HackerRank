package hackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LadyBugs {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int test = in.nextInt();
    for (int i = 0; i < test; i++) {
      int n = in.nextInt();
      String str = in.next();
      char c[] = str.toCharArray();
      Arrays.sort(c);
      String newString = new String(c);
      Map<Character, Integer> map = new HashMap();
      for (char ch : newString.toCharArray()) {
        map.compute(ch, (key, value) -> (value == null) ? 1 : value + 1);
      }
      for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        if (entry.getKey() != '_' && entry.getValue() < 2) {
          System.out.println("NO");
          break;
        }
      }
      if (newString != "__") {
        System.out.println("YES");
      }
    }

  }
}
