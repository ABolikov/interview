package org.bolikov.lesson1.task3;


import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Figure square = new Square("Квадрат", 2);
        Figure rectangle = new Rectangle("Прямоугольник", 2, 10);
        Stream.of(square, rectangle).forEach(Figure::area);
    }
}