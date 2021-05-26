package org.bolikov.lesson1.task3;

public class Square extends Figure {

    public Square(String name, int a) {
        super(name, a, a);
    }

    @Override
    public void area() {
        area = a * a;
        System.out.println(this);
    }
}