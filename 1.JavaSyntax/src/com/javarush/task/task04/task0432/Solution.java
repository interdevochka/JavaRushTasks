package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) throws Exception {
      //напишите тут ваш код
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String name = reader.readLine();
      int N = Integer.parseInt(reader.readLine());
      int countN = 0;

      while (countN <N) {
          if (N > 0)
          System.out.print(name);
          System.out.println();
          countN++;
      }
  }
}
