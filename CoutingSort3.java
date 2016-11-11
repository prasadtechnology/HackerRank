package hackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CoutingSort3 {

  public static void main(String args[]) {
    int sum = 0;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Map<Integer, Integer> map = new HashMap();
    for (int i = 0; i < n; i++) {
      int key = Integer.parseInt(in.next());
      in.next();
      if (map.containsKey(key)) {
        map.put(key, map.get(key) + 1);
      } else {
        map.put(key, 1);
      }
    }
    for (int j = 0; j <= 99; j++) {
      if (map.get(j) != null) {
        sum += map.get(j);
      }
      System.out.print(sum + " ");
    }
  }
}
