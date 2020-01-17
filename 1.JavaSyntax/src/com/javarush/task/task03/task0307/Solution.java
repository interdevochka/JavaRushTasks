package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
  public static void main(String[] args) {
    //напишите тут ваш код
    Zerg zerg1 = new Zerg();
    zerg1.name = "Asya";
    Zerg zerg2 = new Zerg();
    zerg2.name = "Anna";
    Zerg zerg3 = new Zerg();
    zerg3.name = "Alena";
    Zerg zerg4 = new Zerg();
    zerg4.name = "Fekla";
    Zerg zerg5 = new Zerg();
    zerg5.name = "Foma";

    Protoss protoss11 = new Protoss();
    protoss11.name = "Ustinya";
    Protoss protoss12 = new Protoss();
    protoss12.name = "Esmiralda";
    Protoss protoss13 = new Protoss();
    protoss13.name = "Leha";

    Terran terran21 = new Terran();
    terran21.name = "Mary";
    Terran terran22 = new Terran();
    terran22.name = "Gloria";
    Terran terran23 = new Terran();
    terran23.name = "Glaksinia";
    Terran terran24 = new Terran();
    terran24.name = "Polianna";
  }

  public static class Zerg {
    public String name;
  }

  public static class Protoss {
    public String name;
  }

  public static class Terran {
    public String name;
  }
}
