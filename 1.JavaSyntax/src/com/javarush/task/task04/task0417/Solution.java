package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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

    if (a == b && b == c && c == a) {
      System.out.println(a + " " + b + " " + c);
    } else if (a == b && b != c && c != a) {
      System.out.println(a + " " + b);
    } else if (b == c && a != b && c != a) {
      System.out.println(b + " " + c);
    } else if (c == a && b != c && a != b) {
      System.out.println(c + " " + a);
    }
    }
  }
