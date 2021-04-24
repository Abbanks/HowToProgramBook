package com.company.HowToProgramBook.Assignments;

public class AlmostPalindrome {
    public static void main(String[] args) {
        String str = "abcdcbg";
        System.out.println(almostPalindrome(str) );
    }
    public static boolean almostPalindrome(String str) {//abcdcbg
        int n = str.length() - 1; //gets the length of the string and decrements it by 1
        boolean isPalindrome = true;
        String reverse="";

        for (int i = 0; i < str.length(); i++) {

            //gets the index of the last character in the string and initializes it to index
            int index = str.indexOf(str.charAt(n - i));

            if (str.charAt(i) != str.charAt(n - i)) {
                //creates a new string by concatenating the substring of position 0 and index
                // (excluding value of position index) with character at position i
                str = str.substring(0, index) + str.charAt(i) + str.substring(index + 1);

            }

            //tests if the character at position i is equal to the character at position n- i
            if (str.charAt(i) != str.charAt(n - i)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
