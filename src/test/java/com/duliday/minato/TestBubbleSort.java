package com.duliday.minato;

import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;

/**
 * @author Minato
 * @description 功能描述
 * @create 2021/9/24 11:42
 */
@Test
public class TestBubbleSort {
    BubbleSortDemo bubbleSort=new BubbleSortDemo();
    public void test1(){
        Instant start=Instant.now();
        bubbleSort.bubbleSort();
        Instant end=Instant.now();
        long time= Duration.between(start,end).toMillis();
        System.out.println(time);
    }
    public void test2(){
        Instant start=Instant.now();
        bubbleSort.testBubbleSort();
        Instant end=Instant.now();
        long time=Duration.between(start,end).toMillis();
        System.out.println(time);
    }
}
