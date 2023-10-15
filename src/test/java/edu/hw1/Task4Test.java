package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task4.fixString;
import static org.assertj.core.api.Assertions.assertThat;

public class Task4Test {

    private final static Logger LOGGER = LogManager.getLogger();

    @Test
    void fixStringTest() {

        LOGGER.info("First test");
        String data1 = "First test";
        String result1 = fixString(data1);
        assertThat(result1).isEqualTo("iFsr tetts");

        LOGGER.info("Second test");
        String data2 = "First test?";
        String result2 = fixString(data2);
        assertThat(result2).isEqualTo("iFsr tetts?");

        LOGGER.info("Third test");
        String data3 = "?";
        String result3 = fixString(data3);
        assertThat(result3).isEqualTo("?");

        LOGGER.info("Fourth test");
        String data4 = "";
        String result4 = fixString(data4);
        assertThat(result4).isEqualTo("");

    }

}
