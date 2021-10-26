package com.duliday.minato;

import java.util.Scanner;

/**
 * @author Minato
 * @description 递归求解
 * @create 2021/10/20 20:31
 */
public class CountSheep {
    public static void main(String[] args) {
        int n = 0;
        long sheep = 0;
        CountSheep countSheep1 = new CountSheep();
        System.out.println("请输入第几年：（end结束）");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNext("end")) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                sheep = countSheep1.calcSheep(n);
                if (sheep == -1) {
                    System.out.println("年份应该大于0，请重新输入：");
                } else {
                    System.out.println("第" + n + "年有" + sheep + "只吴丽阳~~");
                }
            } else {
                System.out.println("请输入整数：");
                String s = sc.next();
            }
        }
        sc.close();
    }

    public long calcSheep(int n) {
        int[] a = {1, 1, 2, 2, 4, 4, 7};
        if (n <= 7 && n > 0) {
            return a[n - 1];
        } else if (n <= 0) {
            return -1;
        } else {
            return calcSheep(n - 2) + calcSheep(n - 4);
        }
    }
}
