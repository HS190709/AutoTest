package com.duliday.minato;


import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @author Minato
 * @description 功能描述
 * @create 2021/9/23 20:00
 */
public class BubbleSortDemo {
    int[] ns = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
    public void bubbleSort() {
        System.out.println("排序前：" + Arrays.toString(ns));
        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = 0; j < ns.length - 1; j++) {
                if (ns[j] > ns[j + 1]) {
                    int temp = 0;
                    temp = ns[j];
                    ns[j] = ns[j + 1];
                    ns[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后：" + Arrays.toString(ns));
    }

    public void testBubbleSort() {
        System.out.println("排序前：" + Arrays.toString(ns));
        Arrays.sort(ns);
        System.out.println("排序后：" + Arrays.toString(ns));
    }
}
