package com.hosni;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author hosni
 * @date 2019/08/13 16:56:41
 **/
public class PersonSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入想查看个税的月份(6月份之后的)：");
        String s = scan.next();
        PersonSalary ps=new PersonSalary();
        BigDecimal z=new BigDecimal(s);
        System.out.println("要缴纳的个税为：" +ps.count(z));
        //String[] str = s.split(",");
        /*else if(a <=0){
                BigDecimal e = d.multiply(bd3_2).divide(bd3);
                BigDecimal f = e.subtract(bd5);
                System.out.println("要缴纳的个税为：" + f + "累计个税：" + e + "已缴纳个税" + bd5);
                bd5 = e;
            }*/
    }

    public String count(BigDecimal bd8) {
        BigDecimal x=new BigDecimal("6");
        BigDecimal y=new BigDecimal("1");
        if(bd8.compareTo(x)==0){
            BigDecimal bd = new BigDecimal("71127.4");
            BigDecimal bd0 = new BigDecimal("12272.5");
            BigDecimal bd1 = new BigDecimal("5000");
            BigDecimal bd2 = new BigDecimal("1500");
            BigDecimal bd3 = new BigDecimal("100");
            BigDecimal bd3_1 = new BigDecimal("10");
            BigDecimal bd3_2 = new BigDecimal("3");
            BigDecimal bd4 = new BigDecimal("2520");
            BigDecimal bd5 = new BigDecimal("963.82");
            BigDecimal bd6 = new BigDecimal("1");
            BigDecimal bd7 = new BigDecimal("5");
            BigDecimal d = bd.add(bd0.multiply(bd8.subtract(bd7))).subtract(bd1.multiply(bd8.add(bd6))).subtract(bd2.multiply(bd8.add(bd6)));
            BigDecimal bd9 = new BigDecimal("36000");
            BigDecimal bd10 = new BigDecimal("144000");
            int a = d.compareTo(bd9);
            int b = d.compareTo(bd10);
            if (a > 0 && b < 0) {
                BigDecimal e = d.multiply(bd3_1).divide(bd3).subtract(bd4);
                BigDecimal f = e.subtract(bd5);
                bd5 = e;
                return f.toString();
            }
        }else {
            count(bd8.subtract(y));
        }
        return "错误";
    }
}

