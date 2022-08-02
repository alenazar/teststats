package ru.netology.stats.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    final int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expected = 0;
    int actual = 0;
    StatsService service = new StatsService();

    @Test
    public void TestSalesAmount()  {
        expected = 180;
        actual = service.salesAmount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestAverageMonthlySales() {
        double expected = 15;
        double actual = service.averageMonthlySales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMaxSales() {
        expected = 6;
        actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMinSales() {
        expected = 9;
        actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMonthsOfSalesBelowAverage() {
        expected = 5;
        actual = service.monthsOfSalesBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMonthsOfSalesAboveAverage() {
        expected = 5;
        actual = service.monthsOfSalesAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

}
