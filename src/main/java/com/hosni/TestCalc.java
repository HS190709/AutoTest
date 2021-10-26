/*
package com.hosni;

        import java.math.BigDecimal;
        import java.util.BitSet;
        import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;

*/
/**
 * @author hosni
 * @date 2021/07/23 16:56:41
 **//*

public class TestCalc {
    //BigDecimal x = new BigDecimal("6");//单纯的一个变量（因为工资从六月份之后开始稳定的）
    //BigDecimal y = new BigDecimal("1");//单纯的一个变量
    BigDecimal bd = new BigDecimal("98400.34");//累计工资
    //BigDecimal bd0 = new BigDecimal("12272.5");//每月的计税工资
    BigDecimal bd1 = new BigDecimal("5000");//每月的个人免征额
    BigDecimal bd2 = new BigDecimal("1500");//每月的租金减免
    BigDecimal bd3 = new BigDecimal("100");//为了凑百分之几
    BigDecimal bd3_1 = new BigDecimal("3");//预扣率（%）
    BigDecimal bd3_2 = new BigDecimal("10");//预扣率（%）
    BigDecimal bd3_3 = new BigDecimal("20");//预扣率（%）
    BigDecimal bd3_4 = new BigDecimal("25");//预扣率（%）
    BigDecimal bd4_1 = new BigDecimal("0");//速算扣除数
    BigDecimal bd4_2 = new BigDecimal("2520");//速算扣除数
    BigDecimal bd4_3 = new BigDecimal("16920");//速算扣除数
    BigDecimal bd4_4 = new BigDecimal("31920");//速算扣除数
    BigDecimal bd5_1_Max = new BigDecimal("36,000");//累计预扣预缴应纳税所得额
    BigDecimal bd5_2_Min = new BigDecimal("36,000");//累计预扣预缴应纳税所得额
    BigDecimal bd5_2_Max = new BigDecimal("144,000");//累计预扣预缴应纳税所得额
    BigDecimal bd5_3_Min = new BigDecimal("144,000");//累计预扣预缴应纳税所得额
    BigDecimal bd5_3_Max = new BigDecimal("300,000");//累计预扣预缴应纳税所得额
    BigDecimal bd5_4_Min = new BigDecimal("300,000");//累计预扣预缴应纳税所得额
    BigDecimal bd5_4_Max = new BigDecimal("420,000");//累计预扣预缴应纳税所得额
    BigDecimal bd5 = new BigDecimal("2170.99");//累计交税
    BigDecimal bd6 = new BigDecimal("1");//单纯的一个变量
    BigDecimal bd7 = new BigDecimal("5");//单纯的一个变量

    public static void main(String[] args) {
        System.out.println("请输入想查看个税的月份：");
        Scanner scan = new Scanner(System.in);
        String m = scan.next();
        System.out.println("请输入累计工资：");
        Scanner scan1 = new Scanner(System.in);
        String s = scan1.next();
        PersonSalary ps = new PersonSalary();
        BigDecimal month = new BigDecimal(m);
        BigDecimal countS = new BigDecimal(s);
        System.out.println(ps.count(month,countS));
    }

    public Map<String, BigDecimal> count(BigDecimal month,BigDecimal countS) {
        Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();
        BigDecimal d = countS.subtract(bd1.multiply(month)).subtract(bd2.multiply(month));
        BigDecimal e = new BigDecimal("0");
        BigDecimal f = new BigDecimal("0");
        if (d.compareTo(bd5_1_Max)<=0){
                e=d;
        }


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

*/
