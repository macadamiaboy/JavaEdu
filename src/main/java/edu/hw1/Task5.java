package edu.hw1;

public class Task5 {

    /*
     * Напишите функцию, которая будет возвращать true, если число является палиндромом или если любой из его потомков
     * длиной > 1 (как минимум 2 цифры) является палиндромом.
     */

    /*
    public static boolean isPalindromeDescendant(int num) {
        if (isPalindrome(num)) return true;
        else if (String.valueOf(num).length() % 2 != 0) return false;
        else {

        }
    }

    public static boolean isPalindrome(int num) {
        return String.valueOf(num).equals(reverse(String.valueOf(num)));
    }

    public static String reverse(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i > -1; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }*/
}
