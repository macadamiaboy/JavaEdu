package edu.hw1;

public class Task4 {

    /*
     * Напишите функцию, которая исправляет такие строки и возвращает правильный порядок.
     */

    public static String fixString(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i += 2) {
            result.append(str.charAt(i + 1));
            result.append(str.charAt(i));
            System.out.println(str.charAt(i));
        }
        if (str.length() != result.length()) result.append(str.charAt(str.length() - 1));
        return result.toString();
    }
}
