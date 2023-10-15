package edu.hw1;

import java.util.Arrays;

public class Task3 {

    /*
     * Напишите функцию, которая возвращает true, если первый массив может быть вложен во второй,
     * и false в противном случае.
     */

    public static boolean isNestable(int[] first, int[] second) {
        if (first.length < 2 || second.length < 2) throw new IllegalArgumentException();
        return (Arrays.stream(second).min().getAsInt() < Arrays.stream(first).min().getAsInt() &&
            Arrays.stream(second).max().getAsInt() > Arrays.stream(first).max().getAsInt());
    }
}
