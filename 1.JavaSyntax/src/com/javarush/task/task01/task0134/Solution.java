package com.javarush.task.task01.task0134;

/* 
Набираем воду в бассейн
*/

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class Solution {
  public static void main(String[] args) {
    System.out.println(getVolume(25, 5, 2));
  }

  int a = 5;
  int b = 6;
  int c = 7;

    long getVolume = a * b * c;


  public static long getVolume(int a, int b, int c) {
    //напишите тут ваш код
      return a*b*c*1000;

  }
}