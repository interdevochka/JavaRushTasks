package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat catVaska = new Cat("Vaska", 4, 8, 1);
        Cat catBarsik = new Cat("Barsik", 12, 18, 2);
        Cat catMurzik = new Cat("Murzik", 15, 3, 7);

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}