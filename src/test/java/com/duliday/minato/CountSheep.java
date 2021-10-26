package com.duliday.minato;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Minato
 * @description 功能描述
 * @create 2021/10/20 17:06
 */
public class CountSheep {
    public static void main(String[] args) {
        long[] a = {1, 1, 2, 2, 4, 4, 7};
        long yang = 0;
        List<Long> list = new ArrayList();
        for (int i = 0; i < 7; i++) {
            list.add(a[i]);
        }
        for (int i = 7; i < 101; i++) {
            list.add(i, list.get(i - 2) + list.get(i - 4));
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("第" + (i + 1) + "年有" + list.get(i) + "只吴丽阳~~");
        }
    }
}
