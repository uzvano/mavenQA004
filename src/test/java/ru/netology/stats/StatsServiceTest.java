package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    public void testSumSales() {
        long expected = 180;
        long actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSumSalesAverage() {
        long expected = 15;
        long actual = service.sumSalesAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSales() {
        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSales() {
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMonthsSalesLowAverage() {
        int expected = 5;
        int actual = service.getMonthsSalesLowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMonthsSalesHigherAverage() {
        int expected = 5;
        int actual = service.getMonthsSalesHigherAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
