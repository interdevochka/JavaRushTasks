package com.javarush.task.task05.task0508;

/* 
Геттеры и сеттеры для класса Person
*/
public class Person {
  private String name;
  private int age;
  private char sex;

  public void setName (String newName){
    this.name = newName;
  }
  public String getName () {
    return name;
  }
  public void setAge ( int newAge){
    this.age = newAge;
  }
  public int getAge () {
    return age;
  }
  public void setSex ( char newSex){
    this.sex = newSex;
  }
  public char getSex () {
    return sex;
  }

  //напишите тут ваш код
  public static void main (String[] args) {

  }

}