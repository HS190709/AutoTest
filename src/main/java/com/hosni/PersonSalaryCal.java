package com.hosni;


import org.testng.collections.Lists;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author hosni
 * @date 2019/10/12 21:45:16
 **/
public class PersonSalaryCal {

    BigDecimal accumulatedIncome;//累计收入
    BigDecimal pretaxIncome;//税前收入
    BigDecimal socialSecurity;//社保
    BigDecimal accumulationFund;//公积金
    BigDecimal cumulativeExemption;//累计免征额
    BigDecimal specialDeduction;//累计专项减免
    //BigDecimal quickDeduction;//速算扣除数
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
        System.out.println("请输入想查看个税的月份：");
        String s = scan.next();
        PersonSalary ps = new PersonSalary();
        BigDecimal z = new BigDecimal(s);
        System.out.println(ps.count(z));
    }

    public Map<String, BigDecimal> count(BigDecimal month) {
        List<Enum_p> list = Lists.newArrayList(new Enum_p(new BigDecimal("0"), new BigDecimal("36000"), new BigDecimal("3%"), new BigDecimal("0")),
                new Enum_p(new BigDecimal("36000"), new BigDecimal("144000"), new BigDecimal("10%"), new BigDecimal("2520")),
                new Enum_p(new BigDecimal("144000"), new BigDecimal("300000"), new BigDecimal("20%"), new BigDecimal("16920")),
                new Enum_p(new BigDecimal("300000"), new BigDecimal("420000"), new BigDecimal("25%"), new BigDecimal("31920")),
                new Enum_p(new BigDecimal("420000"), new BigDecimal("660000"), new BigDecimal("30%"), new BigDecimal("52920")),
                new Enum_p(new BigDecimal("660000"), new BigDecimal("960000"), new BigDecimal("35%"), new BigDecimal("85920")),
                new Enum_p(new BigDecimal("960000"), new BigDecimal(Double.MAX_VALUE), new BigDecimal("45%"), new BigDecimal("181920")));
        Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();
        BigDecimal cumulative_tax;//累计个税
        BigDecimal duty_paid;//已缴纳个税
        BigDecimal income_tax;//个人所得税
        BigDecimal pay_in_advance;//累计预缴纳额
        cumulative_tax=new BigDecimal("0");
        duty_paid=new BigDecimal("0");
        income_tax=new BigDecimal("0");
        //pay_in_advance=accumulated_income.subtract();


        BigDecimal d = bd.add(bd0.multiply(month.subtract(bd7))).subtract(bd1.multiply(month.add(bd6))).subtract(bd2.multiply(month.add(bd6)));
        BigDecimal bd9 = new BigDecimal("36000");
        BigDecimal bd10 = new BigDecimal("144000");
        BigDecimal e = new BigDecimal("0");
        BigDecimal f = new BigDecimal("0");
        int a = d.compareTo(bd9);
        int b = d.compareTo(bd10);
        if (month.compareTo(x) == 0) {
            if (a > 0 && b < 0) {
                e = d.multiply(bd3_1).divide(bd3).subtract(bd4);
                f = e.subtract(bd5);
            }
        } else {
            count(month.subtract(y));
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

class Enum_p {
    private BigDecimal min;//累计工资下限
    private BigDecimal max;//累计工资上限
    private BigDecimal percentage;//预扣率
    private BigDecimal quick_deduction;//速算扣除数

    public Enum_p(BigDecimal min, BigDecimal max, BigDecimal percentage, BigDecimal quick_deduction) {
        this.min = min;
        this.max = max;
        this.percentage = percentage;
        this.quick_deduction = quick_deduction;
    }
}



