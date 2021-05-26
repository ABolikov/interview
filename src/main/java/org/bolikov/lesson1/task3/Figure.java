package org.bolikov.lesson1.task3;

public abstract class Figure {
    private String name;
    int a;
    int b;
    int area;

    public Figure(String name, int a, int b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public void area() {
        area = a * b;
    }

    @Override
    public String toString() {
        return "Фигура: " + name + ", Площадь:" + area;
    }
}
