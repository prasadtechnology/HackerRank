package hackerRank;

import java.util.Scanner;

/**
 *
 * @author PRASAD
 */
public class LicaWorkbook {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int no_of_chapters = in.nextInt();
    int no_of_Qtns_page = in.nextInt();
    int page = 1;
    int specialProblems = 0;
    for (int chapterIndex = 0; chapterIndex < no_of_chapters; chapterIndex++) {
      int qtnsPerChapter = in.nextInt();
      for (int i = 1; i <= qtnsPerChapter; i++) {
        if (page == i) {
          specialProblems++;
        }
        if (i % no_of_Qtns_page == 0 && i != qtnsPerChapter) {
          page++;
        }
      }
      page++;
    }
    System.out.println(specialProblems);
    in.close();
  }
}
