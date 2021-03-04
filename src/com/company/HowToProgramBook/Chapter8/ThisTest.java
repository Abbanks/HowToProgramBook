package com.company.HowToProgramBook.Chapter8;
// this used implicitly and explicitly to refer to members of an object.


public class ThisTest {
    public static void main(String[] args) {
        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());
    }
}

