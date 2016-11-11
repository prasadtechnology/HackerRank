/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerRank;
//07:05:45PM

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwlvHourToTFurHours {

  public static void main(String[] args) {
    String timeSplit[];
    int hours;
    Scanner in = new Scanner(System.in);
    String time = in.next();
    timeSplit = time.split(":");
    hours = Integer.parseInt(timeSplit[0]);
    if (time.contains("PM")) {
      if (hours != 12) {
        hours = hours + 12;
      }
    } else if (time.contains("AM") && hours == 12) {
      hours = 0;
    }
    time = time.replace(timeSplit[2].substring(2, timeSplit[2].length()), "");
    time = time.replace(timeSplit[0], Integer.toString(hours).length() == 1 ? "0" + Integer.toString(hours) : Integer.toString(hours));
    System.out.println(time);
  }
}
