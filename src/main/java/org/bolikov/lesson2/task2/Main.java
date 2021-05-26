package org.bolikov.lesson2.task2;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arr = new MyArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(10);
        arr.add(3423);
        arr.add(34);
        System.out.println(arr.get(3));
        System.out.println(arr.size());
        System.out.println(arr.isEmpty());
        arr.print();
    }
}
