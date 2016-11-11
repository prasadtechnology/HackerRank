/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerRank;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Gemstones {

  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);
    int GemStones = 0;
    int min = 0;
    int minIndex = 0;
    int test = in.nextInt();
    String s[] = new String[test];

    for (int i = 0; i < test; i++) {
      s[i] = in.next();
      if (i == 0) {
        min = s[i].length();
        minIndex = i;
      } else if (min > s[i].length()) {
        min = s[i].length();
        minIndex = i;
      }
    }
    char c[] = removeDupCharacters(s[minIndex]).toCharArray();
    for (int j = 0; j < c.length; j++) {
      int count = 0;

      for (int k = 0; k < s.length; k++) {
        if (s[k].contains(Character.toString(c[j]))) {
          count++;
        }
      }
      if (count == s.length) {
//        System.out.println("This character exist in all:" + c[j]);
        GemStones++;
      }
    }
    System.out.println(GemStones);

  }

  public static String removeDupCharacters(String input) {
    Set<Character> set = new LinkedHashSet<Character>();
    char c[] = input.toCharArray();
    for (char d : c) {
      set.add(d);
    }
    StringBuilder output = new StringBuilder();
    for (Character s : set) {
      output.append(s);
    }
    return output.toString();
  }
}
