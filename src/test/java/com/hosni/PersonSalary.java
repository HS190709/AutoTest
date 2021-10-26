package com.hosni;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author hosni
 * @date 2019/08/13 16:56:41
 **/
public class PersonSalary {
    BigDecimal x = new BigDecimal("6");//单纯的一个变量（因为工资从六月份之后开始稳定的）
    BigDecimal y = new BigDecimal("1");//单纯的一个变量
    BigDecimal bd = new BigDecimal("71127.4");//累计工资
    BigDecimal bd0 = new BigDecimal("12272.5");//每月的计税工资
    BigDecimal bd1 = new BigDecimal("5000");//每月的个人免征额
    BigDecimal bd2 = new BigDecimal("1500");//每月的租金减免
    BigDecimal bd3 = new BigDecimal("100");//为了凑百分之几
    BigDecimal bd3_1 = new BigDecimal("10");//百分之十
    BigDecimal bd3_2 = new BigDecimal("3");//百分之三
    BigDecimal bd4 = new BigDecimal("2520");//速算扣除数
    BigDecimal bd5 = new BigDecimal("963.82");//累计交税
    BigDecimal bd6 = new BigDecimal("1");//单纯的一个变量
    BigDecimal bd7 = new BigDecimal("5");//单纯的一个变量

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入想查看个税的月份(6月份之后的)：");
        String s = scan.next();
        PersonSalary ps = new PersonSalary();
        BigDecimal z = new BigDecimal(s);
        System.out.println(ps.count(z));
    }

    public Map<String, BigDecimal> count(BigDecimal bd8) {
        Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();
        BigDecimal d = bd.add(bd0.multiply(bd8.subtract(bd7))).subtract(bd1.multiply(bd8.add(bd6))).subtract(bd2.multiply(bd8.add(bd6)));
        BigDecimal bd9 = new BigDecimal("36000");
        BigDecimal bd10 = new BigDecimal("144000");
        BigDecimal e = new BigDecimal("0");
        BigDecimal f = new BigDecimal("0");
        int a = d.compareTo(bd9);
        int b = d.compareTo(bd10);
        if (bd8.compareTo(x) == 0) {
            if (a > 0 && b < 0) {
                e = d.multiply(bd3_1).divide(bd3).subtract(bd4);
                f = e.subtract(bd5);
            }
        } else {
            count(bd8.subtract(y));
            if (a > 0 && b < 0) {
                e = d.multiply(bd3_1).divide(bd3).subtract(bd4);
                f = e.subtract(bd5);
            }
        }
        map.put("已缴纳个税", bd5);
        map.put("应缴纳个税", f);
        map.put("累计个税", e);
        bd5 = e;
        return map;
    }
}

