/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerRank;

import java.util.Scanner;

public class CamelCase {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    int count = 1;
    char c[] = s.toCharArray();
    for (int i = 0; i < c.length; i++) {
      if (Character.isUpperCase(c[i])) {
        count++;
      }
    }
    System.out.println(count);
  }
}
