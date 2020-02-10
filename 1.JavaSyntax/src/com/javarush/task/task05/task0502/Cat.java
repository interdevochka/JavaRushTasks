package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/


public class Cat {
  public int age;
  public int weight;
  public int strength;

  public Cat() {
  }

  public boolean fight(Cat anotherCat) {
    //напишите тут ваш код
    int cat1Sum = 0;
    int cat2Sum = 0;

    if (this.age > anotherCat.age) {
      cat1Sum = cat1Sum + 1;
    } else if(anotherCat.age > this.age) {
      cat2Sum = cat2Sum + 1;
    }

    if (this.weight > anotherCat.weight) {
      cat1Sum = cat1Sum + 1;
    } else if (anotherCat.weight > this.weight) {
      cat2Sum = cat2Sum + 1;
    }

    if (this.strength > anotherCat.strength) {
      cat1Sum = cat1Sum + 1;
    } else if (anotherCat.strength > this.strength) {
      cat2Sum = cat2Sum + 1;
    }
    return cat1Sum > cat2Sum;
  }

    public static void main (String[]args){
      Cat cat1 = new Cat();
      cat1.age = 5;
      cat1.weight = 5;
      cat1.strength = 5;

      Cat cat2 = new Cat();
      cat2.age = 5;
      cat2.weight = 5;
      cat2.strength = 5;

      boolean result = cat1.fight(cat2);

      System.out.println(result);
    }
  }
