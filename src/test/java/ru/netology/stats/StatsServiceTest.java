package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {


    int statistic[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateTotal() {
        StatsService stat = new StatsService();
        int actual = stat.calculateTotal(statistic);
        int expected = 180;
        assertEquals(expected, actual);

    }

    @Test
    void calculateAvarage() {
        StatsService stat = new StatsService();
        int actual = stat.calculateAvarage(statistic);
        int expected = 15;
        assertEquals(expected, actual);

    }

    @Test
    void findMaxMonth() {
        StatsService stat = new StatsService();
        int actual = stat.findMaxMonth(statistic);
        int expected = 8;
        assertEquals(expected, actual);

    }


    @Test
    void findMinMonth() {
        StatsService stat = new StatsService();
        int actual = stat.findMinMonth(statistic);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void prodazhiNizheSrednego() {
        StatsService stat = new StatsService();
        int actual = stat.prodazhiNizheSrednego(statistic);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void prodazhiVisheSrednego() {
        StatsService stat = new StatsService();
        int actual = stat.prodazhiVisheSrednego(statistic);
        int expected = 5;
        assertEquals(expected, actual);
    }
}