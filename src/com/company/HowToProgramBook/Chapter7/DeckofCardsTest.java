package com.company.HowToProgramBook.Chapter7;
// Card shuffling and dealing.
public class DeckofCardsTest {
    // execute application
    public static void main (String[]args){
        DeckofCards myDeckofCards = new DeckofCards();
        myDeckofCards.shuffle(); // place Cards in random order

        // print all 52 Cards in the order in which they are dealt
        for ( int i = 1; i <= 52; i++ )
            {
            // deal and display a Card
            System.out.printf( "%-19s", myDeckofCards.dealCard() );

            if (i% 4 == 0 ) // output a newline after every fourth card
                System.out.println();
            } // end for
    }
}
