package com.company.HowToProgramBook;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // int [] array = new int[10]; //create array object
        // System.out.printf("%s%8s\n", "Index", "Value"); // column headings
        // output each array element's value
        // for ( int counter = 0; counter < array.length; counter++ )
        //  System.out.printf( "%5d%8d\n", counter, array[ counter ] );

        // initializer list specifies the value for each element
        //int[] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
        // output each array element's value
        //for ( int counter = 0; counter < array.length; counter++ )
        // System.out.printf( "%5d%8d\n", counter, array[ counter ] );

       /*final int ARRAY_LENGTH = 10; // declare constant
        int[] array = new int[ ARRAY_LENGTH ]; // create array

        // calculate value for each array element
        for ( int counter = 0; counter < array.length; counter++ )
            array[ counter ] = 2 + 2 * counter;
        System.out.printf("%s%8s\n", "Index", "Value"); // column headings

        // output each array element's value
        for(int counter =0; counter < array.length; counter++){
            System.out.printf( "%5d%8d\n", counter, array[ counter ] );
        }*/

       /* int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;

        // add each element's value to total
        for ( int counter = 0; counter < array.length; counter++ )
            total += array[ counter ];

        System.out.printf( "Total of array elements: %d\n", total );

        // Poll analysis program.
        // student response array (more typically, input at runtime)
        int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3,
                 2, 3, 3, 2, 14 };
        int[] frequency = new int[ 6 ]; // array of frequency counters

        // for each answer, select responses element and use that value
// as frequency index to determine element to increment
        for (int answer = 0; answer < responses.length; answer++){
            try
            {
                ++frequency[responses[answer]];
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf( " responses[%d] = %d\n\n",
                        answer, responses[ answer ] );
            }
        }
        System.out.printf( "%s%10s\n", "Rating", "Frequency" );

        // output each array element's value
        for ( int rating = 1; rating < frequency.length; rating++ )
            System.out.printf( "%6d%10d\n", rating, frequency[ rating ] );

        //Enhanced for statement
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;

        // add each element's value to total
        for (int number: array)
            total += number;

        System.out.printf( "Total of array elements: %d\n", total ); */

  /*      // Passing arrays and individual array elements to methods.
        int[] array = { 1, 2, 3, 4, 5 };

        System.out.println(
                 "Effects of passing reference to entire array:\n" +
                        "The values of the original array are:" );

        // output original array elements
        for (int value : array)
            System.out.printf( " %d", value );

        modifyArray(array); // pass array reference
        System.out.println( "\n\nThe values of the modified array are:" );

        // output modified array elements
        for ( int value : array )
            System.out.printf( " %d", value );

        System.out.printf(
                "\n\nEffects of passing array element value:\n" +
                        "array[3] before modifyElement: %d\n", array[ 3 ] );

        modifyElement( array[ 3 ] ); // attempt to modify array[ 3 ]
        System.out.printf(
                "array[3] after modifyElement: %d\n", array[ 3 ] );
        } // end main

    // multiply each element of an array by 2
    public static void modifyArray(int[] array2) {
        for (int counter = 0; counter < array2.length; counter++)
            array2[counter] *= 2;
    }

    // multiply argument by 2
    public static void modifyElement( int element )
    {
        element *= 2;
        System.out.printf(
                "Value of element in modifyElement: %d\n", element );
    } // end method modifyElement
*/

        // Initializing two-dimensional arrays.
        // create and output two-dimensional arrays
       /* int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Values in array1 by row are");
        outputArray(array1); // displays array1 by row

        System.out.println("\nValues in array2 by row are");
        outputArray(array2); // displays array2 by row
    }

    // output rows and columns of a two-dimensional array
    public static void outputArray(int[][] array) {
        // loop through array's rows
        for(int row=0; row < array.length; row++){
            // loop through columns of current row
            for (int column =0; column < array[row].length; column++){
                System.out.printf( "%d ", array[ row ][ column ] );


        System.out.println(); // start new line of output
            }
        }

    }*/

        // Using variable-length argument lists.
        /*While you can use method
        overloading and array passing to accomplish much of what is accomplished with variablelength
        argument lists, using an ellipsis in a method’s parameter list is more concise.*/
       /* double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;

        System.out.printf( "d1 = %.1f\nd2 = %.1f\nd3 = %.1f\nd4 = %.1f\n\n", d1, d2, d3, d4 );

        System.out.printf( "Average of d1 and d2 is %.1f\n", average( d1, d2 ));
        System.out.printf( "Average of d1 and d2 and d3 is %.1f\n", average( d1,  d2, d3 ));
        System.out.printf( "Average of d1 and d2, d3 and d4 is %.1f\n", average( d1, d2, d3, d4));

    }
    // calculate average
    public static double average( double... numbers ){
        double total = 0.0;  // initialize total

        // calculate total using the enhanced for statement
        for ( double d : numbers )
            total += d;

        return total / numbers.length ;
    }*/

        // Initializing an array using command-line arguments.
        // check number of command-line arguments
        /*if (args.length != 3 )
            System.out.println(
                "Error: Please re-enter the entire command, including\n" +
                        "an array size, initial value and increment." );
        else
        {
            // get array size from first command-line argument
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[ arrayLength ]; // create array

            // get initial value and increment from command-line arguments
            int initialValue = Integer.parseInt( args[ 1 ] );
            int increment = Integer.parseInt( args[ 2 ] );

            // calculate value for each array element
            for ( int counter = 0; counter < array.length; counter++ )
                array[ counter ] = initialValue + increment * counter;

            System.out.printf( "%s%8s\n", "Index", "Value" );

            // display array index and value
            for ( int counter = 0; counter < array.length; counter++ )
            System.out.printf( "%5d%8d\n", counter, array[ counter ] );
            } // end else */

        // Fig. 7.22: ArrayManipulations.java
        // Arrays class methods and System.arraycopy.
/*
        // sort doubleArray into ascending order
        double[] doubleArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };
        Arrays.sort( doubleArray );
        System.out.printf( "\ndoubleArray: " );

        for ( double value : doubleArray )
            System.out.printf( "%.1f", value );

        // fill 10-element array with 7s
        int[] filledIntArray = new int[ 10 ];
        Arrays.fill( filledIntArray, 7 );
        displayArray( filledIntArray, "\nfilledIntArray" );

        // copy array intArray into array intArrayCopy
        int[] intArray = {1,2,3,4,5,6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        // compare intArray and intArrayCopy for equality
        boolean b =Arrays.equals(intArray, intArrayCopy);
        System.out.print("\n\nintArray, intArrayCopy");
        System.out.printf( "\n\nintArray %s intArrayCopy\n",
                (b? "==" : "!=" ) );

        // search intArray for the value 5
        int location = Arrays.binarySearch( intArray, 5 );
        if ( location >= 0 )
            System.out.printf(
                "\nFound 5 at element %d in intArray\n", location );
        else
        System.out.println( "\n5 not found in intArray" );

        // search intArray for the value 8763
        location = Arrays.binarySearch( intArray, 8763 );
        if ( location >= 0 )
            System.out.printf(
                "Found 8763 at element %d in intArray\n", location );
        else
        System.out.println( "8763 not found in intArray" );
    }
    // output values in each array
    public static void displayArray( int[] array, String description )
   {
        System.out.printf( "\n%s: ", description );

        for ( int value : array )
            System.out.printf( "%d ", value );
        } // end method displayArray*/

        // Generic ArrayList<T> collection demonstration.
        // create a new ArrayList of Strings with an initial capacity of 10
        ArrayList<String> items = new ArrayList<>();

        items.add("red"); // append an item to the list
        items.add(0, "yellow"); // insert the value at index 0

        // header
        System.out.print("Display list contents with counter-controlled loop:");

        // display the colors in the list
        for (int i = 0; i < items.size(); i++)
            System.out.printf(" %s", items.get(i));

        // display colors using foreach in the display method
        display(items,
                "\nDisplay list contents with enhanced for statement:");

        items.add( "green" ); // add "green" to the end of the list
        items.add( "yellow" ); // add "yellow" to the end of the list
        display( items, "List with two new elements:" );

        items.remove( "yellow" ); // remove the first "yellow"
        display( items, "Remove first instance of yellow:" );

        items.remove( 1 ); // remove item at index 1
        display( items, "Remove second list element (green):" );

        // check if a value is in the List
        System.out.printf( "\"red\" is %sin the list\n",
                items.contains( "red" ) ? "": "not " );

        // display number of elements in the List
        System.out.printf( "Size: %s\n", items.size() );
    }
        // display the ArrayList's elements on the console
        public static void display(ArrayList<String> items, String header){
            System.out.print(header); // display header

            // display each element in items
            for(String item: items)
                System.out.printf("%s", item);

            System.out.println(); // display end of line
        }


       






    }

