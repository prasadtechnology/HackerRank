package hackerRank;

import java.util.Scanner;

public class BoneTrosule {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int sticsReq = in.nextInt();
    int ActBox = in.nextInt();
    int ReqBox = in.nextInt();
    int total = (ActBox * (ActBox + 1)) / 2;
    if (ReqBox == 1 && sticsReq <= ActBox) {
      System.out.println(sticsReq);;
    }
    if (sticsReq > total) {
      System.out.println("-1");
    }
    for (int i = 1; i <= ActBox - ReqBox; i++) {
      for (int j = i + 1; j < ActBox - ReqBox; j++) {
        int temp = j;
        int sum = 0;
        for (int k = 0; k < ReqBox - 1; i++) {
          sum += temp++;
        }
        if (i + sum == sticsReq) {
          System.out.print(i + " " + (j - 1) + " " + (j - 2));
          return;
        }
      }
    }
  }
}
