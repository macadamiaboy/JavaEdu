package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task1.minutesToSeconds;
import static org.assertj.core.api.Assertions.assertThat;

public class Task1Test {

    private final static Logger LOGGER = LogManager.getLogger();

    @Test
    void minutesToSecondsTest() {

        LOGGER.info("First test");
        String data1 = "11:59";
        int result1 = minutesToSeconds(data1);
        assertThat(result1).isEqualTo(719);

        LOGGER.info("Second test");
        String data2 = "0:0";
        int result2 = minutesToSeconds(data2);
        assertThat(result2).isEqualTo(0);

        LOGGER.info("Third test");
        String data3 = "14:88";
        int result3 = minutesToSeconds(data3);
        assertThat(result3).isEqualTo(-1);

        LOGGER.info("Fourth test");
        String data4 = "1:-16";
        int result4 = minutesToSeconds(data4);
        assertThat(result4).isEqualTo(-1);

        LOGGER.info("Fifth test");
        String data5 = "-1:16";
        int result5 = minutesToSeconds(data5);
        assertThat(result5).isEqualTo(-1);

        LOGGER.info("Sixth test");
        String data6 = "1111:60";
        int result6 = minutesToSeconds(data6);
        assertThat(result6).isEqualTo(-1);

        LOGGER.info("Seventh test");
        String data7 = "1111:06";
        int result7 = minutesToSeconds(data7);
        assertThat(result7).isEqualTo(66666);
    }
}
