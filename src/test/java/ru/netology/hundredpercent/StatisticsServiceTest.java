package ru.netology.hundredpercent;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StatisticsServiceTest {

    private final StatisticsService service = new StatisticsService();

    @Test
    void findMax() {
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenFirstIsLess() {
        long[] incomesInBillions = {12, 22};
        long expected = 22;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxFirstWhenContainsJustOneElement() {
        long[] incomesInBillions = {12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowExceptionWhenEmpty() {
        long[] incomesInBillions = {};

        assertThrows(ArrayIndexOutOfBoundsException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                service.findMax(incomesInBillions);
            }
        });
    }
}