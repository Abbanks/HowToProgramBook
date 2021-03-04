package com.company.HowToProgramBook;

public class Person {
    static int  eyes = 2;
    static int mouth = 1;
    static int legs = 2;
    String name;
    static int hands = 2;
    static int face = 1;
    static int fingers = 10;

    public Person(String name) {
        this.name = name;
    }

    public void run (){
        System.out.println("Running " + this.name);
        System.out.println("Properties " + eyes);
    }
}
