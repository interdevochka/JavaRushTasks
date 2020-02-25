package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
  public static void main(String[] args) {
    // Создай 10 котов
    Cat catOne = new Cat();
    Cat catTwo = new Cat();
    Cat catThree = new Cat();
    Cat catFour = new Cat();
    Cat catFive = new Cat();
    Cat catSix = new Cat();
    Cat catSeven = new Cat();
    Cat catEight = new Cat();
    Cat catNine = new Cat();
    Cat catTen = new Cat();

    // Выведи значение переменной catCount
    System.out.println(Cat.catCount);
  }

  public static class Cat {
    // Создай статическую переменную catCount
    public static int catCount = 0;

    // Создай конструктор
    public Cat() {
      catCount = catCount + 1;

    }

  }
}
