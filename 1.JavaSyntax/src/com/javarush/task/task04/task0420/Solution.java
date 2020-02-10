package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

    if (a >= b && b >= c && a >= c) {
      System.out.println(a + " " + b + " " + c);
    } else if (b >= a && b >= c && a >= c) {
      System.out.println(b + " " + a + " " + c);
    } else if (c >= a && c >= b && a >= b) {
      System.out.println(c + " " + a + " " + b);
    } else if (c >= b && c >= a && b >= a) {
      System.out.println(c + " " + b + " " + a);
    } else if (b >= c && b >= a && c >= a) {
        System.out.println(b + " " + c + " " + a);
    } else if (a >= c && c >= b && a >= c) {
        System.out.println(a + " " + c + " " + b);
    }

  }
}
