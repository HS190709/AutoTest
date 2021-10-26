package com.hosni;

import java.util.*;

/**
 * @author hosni
 * @date 2019/11/26 22:08:57
 **/

/**到底是用ArrayList还是Linkedlist主要还是看在前头做更改还是在后面再就是取决于列表的大小*/
public class TimeComplexity {
    public static void main(String[] args) {
        TimeComplexity t = new TimeComplexity();
        List<Integer> values = t.getList(10000);
        System.out.println("ArrayList二分查找的时间为："+t.binarySearchTime(new ArrayList<Integer>(values),values));
        System.out.println("LinkedList二分查找的时间为："+t.binarySearchTime(new LinkedList<Integer>(values),values));
        System.out.println("ArrayList遍历的时间为："+t.traverseTime(new ArrayList<Integer>(values)));
        System.out.println("LinkedList遍历的时间为："+t.traverseTime(new LinkedList<Integer>(values)));
        System.out.println("ArrayList更改的时间为：" + t.modifyTime(new ArrayList<>(values), values.size()));//假设更改在
        System.out.println("LinkedList更改的时间为：" + t.modifyTime(new LinkedList<>(values), values.size()));
    }

    public List<Integer> getList(int N) {
        Integer[] val = new Integer[N];
        Random r = new Random();
        for (int i = 0, currval = 0; i < N; i++) {
            val[i] = currval;
            currval += r.nextInt(100) + 1;
        }
        return Arrays.asList(val);
    }

    public long binarySearchTime(List<Integer> list, List<Integer> target) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int index = Collections.binarySearch(list, target.get(i));
            if (index != i) {
                System.out.println("***错误***");
            }
        }
        return System.currentTimeMillis() - start;
    }

    public long traverseTime(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int index = list.get(i);
        }
        return System.currentTimeMillis() - start;
    }

    public long modifyTime(List<Object> list, int N) {
        long start = System.currentTimeMillis();
        Object o = new Object();
        for (int i = 0; i <= N / 5; i++) {

            list.add(i, o);
        }
        return System.currentTimeMillis() - start;
    }


}
