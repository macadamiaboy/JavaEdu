package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task2.countDigits;
import static org.assertj.core.api.Assertions.assertThat;

public class Task2Test {

    private final static Logger LOGGER = LogManager.getLogger();

    @Test
    void countDigitsTest() {

        LOGGER.info("First test");
        int data1 = 0;
        int result1 = countDigits(data1);
        assertThat(result1).isEqualTo(1);

        LOGGER.info("Second test");
        int data2 = 10;
        int result2 = countDigits(data2);
        assertThat(result2).isEqualTo(2);

        LOGGER.info("Third test");
        int data3 = 11111;
        int result3 = countDigits(data3);
        assertThat(result3).isEqualTo(5);

        LOGGER.info("Fourth test");
        int data4 = -1234;
        int result4 = countDigits(data4);
        assertThat(result4).isEqualTo(4);

    }
}
