package org.bolikov.lesson2.task1;

public class Main {
    public static void main(String[] args) {
        org.bolikov.lesson2.task1.LinkedList<People> peopleList = new LinkedList<>();
        peopleList.addFirst(new People("Ольга", 1));
        peopleList.add(new People("Вася", 20));
        peopleList.add(new People("Петя", 18));
        peopleList.addLast(new People("Коля2", 2343));
        peopleList.add(new People("Коля1", 25));
        peopleList.add(new People("Юра", 23));
        peopleList.addFirst(new People("Петька", 789));
        peopleList.addFirst(new People("Петька2", 123));
        peopleList.display();

        System.out.println(peopleList.getLast());
        System.out.println(peopleList.getFirst());
    }
}
