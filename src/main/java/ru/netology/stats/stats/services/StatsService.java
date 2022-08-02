package ru.netology.stats.stats.services;

public class StatsService {

    public void main(String[] args) {

        final int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println("Сумма всех продаж: " + salesAmount(sales));
        System.out.println("Средняя сумма продаж в месяц: " + averageMonthlySales(sales));
        System.out.println("Номер месяца, в котором был максимум продаж: " + maxSales(sales));
        System.out.println("Номер месяца, в котором был минимум продаж: " + minSales(sales));
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего: " + monthsOfSalesBelowAverage(sales));
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего: " + monthsOfSalesAboveAverage(sales));
    }

    public int salesAmount(int[] sales) {
        int sum = 0;

        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public double averageMonthlySales(int[] sales) {

        double average = 0;
        if (sales.length > 0) {
            double sum = 0;
            for (int sale : sales) {
                sum += sale;
            }
            average = sum / sales.length;
        }
        return average;
    }

    public int maxSales(int[] sales) {
        int[] maxSales = {0, -1};
        for (int i = 0; i < sales.length; i++) {
            if (maxSales[1] == -1) {
                maxSales[0] = i;
                maxSales[1] = sales[i];
            } else {
                if (maxSales[1] < sales[i]) {
                    maxSales[0] = i;
                    maxSales[1] = sales[i];
                }
            }
        }
        return maxSales[0] + 1;
    }

    public int minSales(int[] sales) {
        int[] minSales = {0, -1};
        for (int i = 0; i < sales.length; i++) {
            if (minSales[1] == -1) {
                minSales[0] = i;
                minSales[1] = sales[i];
            } else {
                if (minSales[1] > sales[i]) {
                    minSales[0] = i;
                    minSales[1] = sales[i];
                }
            }
        }
        return minSales[0] + 1;
    }

    public int monthsOfSalesBelowAverage(int[] sales) {

        double averageMonthlySales = averageMonthlySales(sales);
        int quantity = 0;
        for (int sale : sales) {
            if (sale < averageMonthlySales) {
                quantity++;
            }
        }
        return quantity;
    }

    public int monthsOfSalesAboveAverage(int[] sales) {

        double averageMonthlySales = averageMonthlySales(sales);
        int quantity = 0;
        for (int sale : sales) {
            if (sale > averageMonthlySales) {
                quantity++;
            }
        }
        return quantity;
    }
}

