package org.bolikov.lesson1.task1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .addFirstName("Петя")
                .addLastName("Петров")
                .addMiddleName("Анатольевич")
                .addAge(18)
                .addGender("Мужчина")
                .addCountry("Россия")
                .addAddress("Омск, Кутузова 5")
                .addPhone("+79139131313")
                .build();
        System.out.println(person);
    }
}
