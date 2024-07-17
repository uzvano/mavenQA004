package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long sumSalesAverage(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum / 12;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMonthsSalesLowAverage(long[] sales) {
        int monthsLow = 0;
        long salesAverage = sumSalesAverage(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < salesAverage) {
                monthsLow += 1;
            }
        }
        return monthsLow;
    }

    public int getMonthsSalesHigherAverage(long[] sales) {
        int monthsHigher = 0;
        long salesAverage = sumSalesAverage(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > salesAverage) {
                monthsHigher += 1;
            }
        }
        return monthsHigher;
    }

}
