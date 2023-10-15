package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task3.isNestable;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task3Test {

    private final static Logger LOGGER = LogManager.getLogger();

    @Test
    void isNestableTest() {

        boolean thrown = false;

        LOGGER.info("First test");
        int[] data1 = {1, 2, 3, 4, 5};
        int[] data2 = {9, 0};
        boolean result1 = isNestable(data1, data2);
        assertThat(result1).isEqualTo(true);

        LOGGER.info("Second test");
        int[] data3 = {1, 2, 3, 4, 5};
        int[] data4 = {4, 0};
        boolean result2 = isNestable(data3, data4);
        assertThat(result2).isEqualTo(false);

        LOGGER.info("Third test");
        int[] data5 = {2, 2, 2, 2, 2};
        int[] data6 = {2, 2};
        boolean result3 = isNestable(data5, data6);
        assertThat(result3).isEqualTo(false);

        LOGGER.info("Fourth test");
        int[] data7 = {1, 2, 3, 6, 7};
        int[] data8 = {4, 5};
        boolean result4 = isNestable(data7, data8);
        assertThat(result4).isEqualTo(false);

        LOGGER.info("Fifth test");
        int[] data9 = {};
        int[] data10 = {4, 5};
        try {
            boolean result5 = isNestable(data9, data10);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertTrue(thrown);
        thrown = false;

        LOGGER.info("Sixth test");
        int[] data11 = {1, 2, 3};
        int[] data12 = {};
        try {
            boolean result6 = isNestable(data11, data12);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }
}
