package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) throws Exception {
    //напишите тут ваш код

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String Имя = reader.readLine();
    String число1 = reader.readLine();
    String число2 = reader.readLine();
    System.out.println(Имя + " " + "получает" + " " + число1 + " " + "через" + " " + число2 + " " + "лет.");
  }
}
