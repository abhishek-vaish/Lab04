package main;

import lab04.Person;
import lab04.Student;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Abhishek", 19, 'M');
        Student student = new Student(person.getName(), person.getAge(), person.getGender(), 181540002, 7.31);
        System.out.println(student);
    }
}
