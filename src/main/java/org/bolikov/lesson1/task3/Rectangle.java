package org.bolikov.lesson1.task3;

public class Rectangle extends Figure {

    public Rectangle(String name, int a, int b) {
        super(name, a, b);
    }

    @Override
    public void area() {
        super.area();
        System.out.println(this);
    }
}
