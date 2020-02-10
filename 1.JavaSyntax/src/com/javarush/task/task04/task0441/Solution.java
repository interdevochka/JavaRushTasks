package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) throws Exception {
    //напишите тут ваш код

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    int c = Integer.parseInt(reader.readLine());
    if (a >= b && b > c && a > c) {
      System.out.println(b);
    } else if (a >= c && c > b && a > b) {
      System.out.println(c);
    } else if (b >= a && a > c && b > c) {
        System.out.println(a);
    } else if (c >= a && a > b && c > b) {
        System.out.println(a);
    } else if (c >= b && b > a && c > a) {
      System.out.println(b);
    } else if (a == b && b == c && a == c) {
        System.out.println(a);
    } else if (a == c && a < b) {
      System.out.println(a);
    } else if (a < c && c < b) {
      System.out.println(c);
    } else {
      System.out.println(b);
    }
  }
}
