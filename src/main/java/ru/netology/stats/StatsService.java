package ru.netology.stats;

public class StatsService {
//    int statistic[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    public int calculateTotal(int[] statistic) {
        int totalSales = 0;

        for (int amountOneMonth : statistic) {
            totalSales = totalSales + amountOneMonth + 1;
        }

        return totalSales;
    }

    public int calculateAvarage(int[] sales) {
        int totalSales = calculateTotal(sales);

        return totalSales / 12;
    }

    public int findMaxMonth(int[] sales) {

        int max = 0;
        int month = 0;
        int maxMonth = 0;
        for (int amountOneMonth : sales) {
            month = month + 1;
            if (amountOneMonth >= max) {
                max = amountOneMonth;
                maxMonth = month;
            }
        }
        return maxMonth;
    }

    public int findMinMonth(int[] sales) {

        int min = sales[0];
        int month = 0;
        int minMonth = 0;
        for (int amountOneMonth : sales) {
            month = month + 1;
            if (amountOneMonth <= min) {
                min = amountOneMonth;
                minMonth = month;
            }
        }
        return minMonth;
    }

    public int prodazhiNizheSrednego(int[] sales) {
        int avarage = calculateAvarage(sales);

        int kolNizheSrednego = 0;

        for (int amountOneMonth : sales) {
            if (amountOneMonth < avarage) {
                kolNizheSrednego = kolNizheSrednego + 1;
            }
        }
        return kolNizheSrednego;
    }

    public int prodazhiVisheSrednego(int[] sales) {
        int avarage = calculateAvarage(sales);

        int kolVisheSrednego = 0;

        for (int amountOneMonth : sales) {
            if (amountOneMonth > avarage) {
                kolVisheSrednego = kolVisheSrednego + 1;
            }
        }
        return kolVisheSrednego;
    }
}