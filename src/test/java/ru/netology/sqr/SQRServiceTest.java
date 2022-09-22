package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")

    public void sqrNumberInRange(int lowerRangeLimit, int upperRangeLimit, int expected) {
        SQRService service = new SQRService();

        int actual = service.sqrRange(lowerRangeLimit, upperRangeLimit);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrOutInRange.csv")


    public void sqrNumberOutInRange(int lowerRangeLimit, int upperRangeLimit, int expected) {
        SQRService service = new SQRService();

        int actual = service.sqrRange(lowerRangeLimit, upperRangeLimit);

        Assertions.assertNotEquals(expected, actual);

    }
}

