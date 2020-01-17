package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
  public static void main(String[] args) {
    //напишите тут ваш код
    int eur = 68;
    double course = 0.9;
      System.out.println(convertEurToUsd(eur, course));
      System.out.println(convertEurToUsd(eur, course));
  }

  public static double convertEurToUsd(int eur, double course) {
    //напишите тут ваш код
      double convertEurToUsd = eur * course;
      return convertEurToUsd;
  }
}
