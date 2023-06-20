package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void testShouldReturn100ifAmount900() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(expected, actual);
    }

    @Test
    public void testShouldReturn100ifAmount1900() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(1900);
        assertEquals(expected, actual);
    }

    @Test
    public void testShouldReturn0ifAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }

    @Test
    public void testShouldReturn999ifAmount1001() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(actual, expected);
    }

    @Test
    public void testShouldReturn1000ifAmount0() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(expected, actual);
    }

}