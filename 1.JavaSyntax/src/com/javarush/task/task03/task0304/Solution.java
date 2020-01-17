package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
  public static double addTenPercent(int i) {
    //напишите тут ваш код

    double addTenPercent = i * 1.1;
    return addTenPercent;

  }

  public static void main(String[] args) {

    int i = 9;
    System.out.println(addTenPercent(9));
  }
}
