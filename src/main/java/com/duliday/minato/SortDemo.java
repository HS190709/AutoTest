package com.duliday.minato;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @author Minato
 * @description 功能描述
 * @create 2021/9/22 10:11
 */
public class SortDemo {
    //aslist泛型如果是基本类会把int[]当成一个类型，以下是二维数组的反转
    public void test(){
        int[][] a = {{1, 4, 9, 25, 16},{2, 4, 9, 25, 16}};
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.deepToString(a));
    }
    //给第三方赋值的方法，比直接打印省时间
    public void test1() {
        int[] a = {1, 4, 9, 25, 16};
        int[] b = new int[5];
        for (int i = a.length - 1; i >= 0; i--) {
            b[b.length-1-i]=a[i];
        }
        System.out.println(Arrays.toString(b));
    }
    //集合的反转方法，注意aslist为包装类不能是基本类
    public void test2() {
        Integer[] a = {1, 4, 9, 25, 16};
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.toString(a));
    }
}
