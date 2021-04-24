package com.company.HowToProgramBook.Assignments;

public class MissingLetter {
    public static void main(String[] args) {
          char[] arr = {'O', 'P', 'R', 'S'};
        System.out.println(missingLetter(arr));
    }
    public static char missingLetter(char[] arr) {
        char expectedLetter = arr[0]; //gets the ascii code of the next expected array element
        for (char letter : arr) { //iterate through each letter in array
            if (letter != expectedLetter) //tests if the ascii code of the letter is not equal to the expected letter
                break;
            expectedLetter++; //increment the ascii code by 1
        }
        return expectedLetter; //return the missing letter
    }
}
