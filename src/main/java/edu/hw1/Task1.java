package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task1 {

    private final static Logger LOGGER = LogManager.getLogger();

    /*
     * Дана строка с длиной видео в формате mm:ss, например 12:44.
     * Напишите функцию, которая возвращает общую длину видео в секундах.
     */

    public static int minutesToSeconds(String data) {
        String[] separatedTime = data.split(":");
        int[] time = new int [2];
        for (int i = 0; i < 2; i++ ) {
            try {
                time[i] = Integer.parseInt(separatedTime[i]);
                LOGGER.info(time[i]);
            } catch (NumberFormatException exception) {
                return -1;
            }
        }
        if (time[0] < 0 || time[1] < 0 || time[1] > 59) return -1;
        else {
            return time[0] * 60 + time[1];
        }
    }

}
