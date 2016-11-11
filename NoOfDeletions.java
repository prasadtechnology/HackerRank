/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerRank;

import java.util.Scanner;

public class NoOfDeletions {

  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);
    int test = in.nextInt();
    for (int i = 0; i < test; i++) {
      int count = 0;
      String s = in.next();
      char c[] = s.toCharArray();
      for (int j = 0; j < c.length - 1; j++) {
        if (c[j] == c[j + 1]) {
          count++;
        }
      }
      System.out.println(count);
    }
  }
}
