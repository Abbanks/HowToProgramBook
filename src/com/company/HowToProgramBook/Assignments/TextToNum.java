package com.company.HowToProgramBook.Assignments;

public class TextToNum {
    public static void main(String[] args) {
         String arr = "AFECCD";
        textToNum(arr);
    }
    public static void textToNum(String x) {
        String[] arr = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length() - 1; j++) {

                for (int h = 0; h < x.length(); h++) {
                    boolean g = Character.isLetter(x.charAt(h));
                    if (!g) {
                        System.out.println(x);
                    } else {
                        char p = x.charAt(h);
                        String b = String.valueOf(p);
                        if (arr[i].contains(b)) {
                            String v = String.valueOf(i);
                            x = x.replace(b, v);
                        }
                    }

                }
            }

        }
    }

}
