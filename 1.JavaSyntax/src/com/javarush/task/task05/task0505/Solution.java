package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {

  public static void main(String[] args) {
    //напишите тут ваш код

    Cat cat1 = new Cat("Barsik", 4, 8, 10);
    Cat cat2 = new Cat("Murzik", 8, 9, 11);
    Cat cat3 = new Cat("Pushok", 4, 11, 13);


    boolean result1 = cat1.fight(cat2);
    boolean result2 = cat2.fight(cat3);
    boolean result3 = cat1.fight(cat3);
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
  }

  public static class Cat {

    protected String name;
    protected int age;
    protected int weight;
    protected int strength;

    public Cat(String name, int age, int weight, int strength) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
      int ageScore = Integer.compare(this.age, anotherCat.age);
      int weightScore = Integer.compare(this.weight, anotherCat.weight);
      int strengthScore = Integer.compare(this.strength, anotherCat.strength);

      int score = ageScore + weightScore + strengthScore;
      return score > 0; // return score > 0 ? true : false;
    }
  }
}
