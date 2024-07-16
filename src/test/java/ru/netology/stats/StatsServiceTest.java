package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    public void testSumSales() {
        long expected = 180;
        long actual = service.sumSales(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSumSalesAverage() {
        long expected = 15;
        long actual = service.sumSalesAverage(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSales() {
        int expected = 8;
        int actual = service.maxSales(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSales() {
        int expected = 9;
        int actual = service.minSales(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMonthsSalesLowAverage() {
        int expected = 5;
        int actual = service.getMonthsSalesLowAverage(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMonthsSalesHigherAverage() {
        int expected = 5;
        int actual = service.getMonthsSalesHigherAverage(arr);
        Assertions.assertEquals(expected, actual);
    }
}
