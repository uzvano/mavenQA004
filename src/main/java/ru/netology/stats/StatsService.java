package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public int sumSalesAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / 12;
    }

    public int maxSales(int[] arr) {
        int maxMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] arr) {
        int minMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMonthsSalesLowAverage(int[] arr) {
        int monthsLow = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 15) {
                monthsLow += 1;
            }
        }
        return monthsLow;
    }

    public int getMonthsSalesHigherAverage(int[] arr) {
        int monthsHigher = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 15) {
                monthsHigher += 1;
            }
        }
        return monthsHigher;
    }

}
