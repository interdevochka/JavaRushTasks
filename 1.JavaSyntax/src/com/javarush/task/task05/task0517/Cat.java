package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
  //напишите тут ваш код
  private String name;
  private int age;
  private int weight;
  private String address;
  private String color;

  public Cat(String name) {
    this.name = name;
    this.age = 4;
    this.color = "grey";
    this.weight = 5;
  }


  public Cat(String name, int weight, int age) {
    this.name = name;
    this.age = age;
    this.color = "purple";
    this.weight = weight;
  }

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
    this.color = "red";
    this.weight = 4;
  }

  public Cat(int weight, String color) {
    this.age = 13;
    this.color = color;
    this.weight = weight;
  }

  public Cat(int weight, String color, String address) {
    this.age = 14;
    this.color = color;
    this.weight = weight;
    this.address = address;
  }


  public static void main(String[] args) {

  }
}
