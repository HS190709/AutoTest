package com.duliday.minato;

import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;

/**
 * @author Minato
 * @description 功能描述
 * @create 2021/9/22 10:24
 */
@Test
public class TestSort {
    SortDemo sortDemo = new SortDemo();
    @Test(enabled = false)
    public void test() {
        long start = System.currentTimeMillis();
        sortDemo.test();
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(time);
    }
    public void test1() {
        Instant start = Instant.now();
        sortDemo.test1();
        Instant end = Instant.now();
        long time = Duration.between(start, end).toMillis();
        System.out.println(time);
    }
    public void test2() {
        Instant start = Instant.now();
        sortDemo.test2();
        Instant end = Instant.now();
        long time = Duration.between(start, end).toMillis();
        System.out.println(time);
    }
}
