package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
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
        int countP = 0;
        int countM = 0;

        if (a > 0) {
            countP = countP +1;
        }
        if (b > 0 ) {
            countP = countP +1;
        }
        if (c > 0) {
            countP = countP +1;
        }


        if (a < 0) {
            countM = countM +1;
        }
        if (b < 0 ) {
            countM = countM +1;
        }
        if (c < 0) {
            countM = countM +1;
        }

        System.out.println("количество отрицательных чисел:" + " " + countM);
        System.out.println("количество положительных чисел:" + " " + countP);
    }
}
