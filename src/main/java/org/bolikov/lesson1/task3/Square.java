package org.bolikov.lesson1.task3;

public class Square extends Figure {

    public Square(String name, int a) {
        super(name, a, a);
    }

    @Override
    public void area() {
        super.area();
        System.out.println(this);
    }
}