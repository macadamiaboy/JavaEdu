package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static java.lang.Math.abs;

public class Task2 {

    /*
     * Напишите функцию, которая возвращает количество цифр в числе.
     */

    public static int countDigits(int number) {
        int counter = 1;
        number = abs(number);
        while (number > 9) {
            number /= 10;
            counter++;
        }
        return counter;
    }
}
