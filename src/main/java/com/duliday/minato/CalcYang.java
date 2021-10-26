package com.duliday.minato;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Minato
 * @description 功能描述
 * @create 2021/10/20 11:49
 */
public class CalcYang {
    public static void main(String[] args) {
        CalcYang calcYang = new CalcYang();
        Integer maxyear = 0;
        Integer year = 0;
        System.out.println("请输入最大年份，和要查询的年份：（输入end结束）");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNext("end")) {
            maxyear = sc.nextInt();
            year = sc.nextInt();
            if (maxyear > 1000 || maxyear < year || year <= 0 || maxyear <= 0) {
                System.out.println("最大年份为1000年且查询年份要小于最大年份,且都大于0：");
                System.out.println("请重新输入：");
            } else {
                System.out.println("第" + year + "年有" + calcYang.calc(maxyear, year) + "只吴丽阳~~");
            }
        }
    }


    public long calc(int maxyear, int year) {
        long[] a = {1, 1, 2, 2, 4, 4, 7};
        long yang = 0;
        List<Long> list = new ArrayList();
        for (int i = 0; i < 7; i++) {
            list.add(a[i]);
        }
        for (int i = 7; i < maxyear; i++) {
            list.add(i, list.get(i - 2) + list.get(i - 4));
        }
        if (year > 0 && year <= 7) {
            yang = list.get(year - 1);
        } else if (year > 7) {
            yang = list.get(year - 3) + list.get(year - 5);
        } else {
            System.out.println("年份输入错误，请重新输入：");
        }
        return yang;
    }

}
