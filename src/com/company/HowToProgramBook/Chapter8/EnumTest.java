package com.company.HowToProgramBook.Chapter8;

import java.util.EnumSet;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("All book:\n");

        //print  all books in enum Book
        for (Book book : Book.values() ) // to ask questions
            System.out.printf( "%-10s%-45s%s\n", book,
                    book.getTitle(), book.getCopyrightYear());

        System.out.println( "\nDisplay a range of enum constants:\n" );

        // print first four books
        for ( Book book : EnumSet.range( Book.JHTP, Book.CPPHTP) )
              System.out.printf( "%-10s%-45s%s\n", book,
                      book.getTitle(),book.getCopyrightYear());


    }
}
