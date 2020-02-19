package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle() {

    }

    public Circle(double x) {
        this.x = x;
    }

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    //напишите тут ваш код

    public static void main(String[] args) {

    }
}