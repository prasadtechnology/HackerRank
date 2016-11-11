/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author PRASAD
 */
public class SuperReducedString {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    StringBuilder s = new StringBuilder(in.next());
    for (int i = 0; i < s.length() - 1; i++) {
      if (s.charAt(i) == s.charAt(i + 1)) {
        s.delete(i, i + 2);
        i = -1;
      }
    }
    if (s.length() == 0) {
      System.out.println("Empty String");
    } else {
      System.out.println(s);
    }
  }

}
