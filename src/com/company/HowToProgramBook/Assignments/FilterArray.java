package com.company.HowToProgramBook.Assignments;

public class FilterArray {
    public static void main(String[] args) {
        String[] g ={"1", "2", "aasf", "1", "123", "2"};
        filterArray(g);

    }
    public static void filterArray(String[] b) {
        boolean v = true;
        for (String value : b)
            for (int i = 0; i < value.length(); i++) {
                // access each character
                char a = value.charAt(i);

                v = Character.isDigit(value.charAt(i));
                if (!v) {
                    continue;
                }
                System.out.print(a + " ");

            }
        }
}
