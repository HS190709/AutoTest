package com.duliday.minato;

import java.util.Scanner;

/**
 * @author Minato
 * @description 功能描述
 * @create 2021/10/21 15:11
 */
public class CountSheep1 {
    public static void main(String[] args) {
        int n = 0;
        long sheep = 0;
        CountSheep1 countSheep1 = new CountSheep1();
        n = countSheep1.utilInput();
        sheep = countSheep1.calcSheep(n);
        while (sheep <= 0) {
            n = countSheep1.utilInput();
            sheep = countSheep1.calcSheep(n);
        }
        System.out.println("第" + n + "年有" + sheep + "只吴丽阳~~");
    }

    public int utilInput() {
        int n = 0;
        System.out.println("请输入第几年：（end结束）");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNext("end")) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
            } else {
                System.out.println("请输入整数：");
                String s = sc.next();
            }
        }
        return n;
    }

    public long calcSheep(int n) {
        int[] a = {1, 1, 2, 2, 4, 4, 7};
        if (n <= 7 && n > 0) {
            return a[n - 1];
        } else if (n <= 0) {
            System.out.println("年份应该大于0");
            return -1;
        } else {
            return calcSheep(n - 2) + calcSheep(n - 4);
        }
    }
}
