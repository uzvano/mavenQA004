package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public long sumSalesAverage(long[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / 12;
    }

    public int maxSales(long[] arr) {
        int maxMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] arr) {
        int minMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMonthsSalesLowAverage(long[] arr) {
        int monthsLow = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < sumSalesAverage(arr)) {
                monthsLow += 1;
            }
        }
        return monthsLow;
    }

    public int getMonthsSalesHigherAverage(long[] arr) {
        int monthsHigher = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sumSalesAverage(arr)) {
                monthsHigher += 1;
            }
        }
        return monthsHigher;
    }

}
