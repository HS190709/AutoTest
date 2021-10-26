package com.hosni;

/**
 * @author hosni
 * @date 2019/08/13 19:34:15
 **/
public class Test {
    public static void main(String[] args) {
        /*BitSet bitSet=new BitSet(16);
        bitSet.set(6);
        BigDecimal bigDecimal = new BigDecimal("107944.9");
        BigDecimal bigDecima = new BigDecimal("12272.5");
        System.out.println(bigDecimal.add(bigDecima));*/
        /*String[] s=new String[]{"a","b","c"};
        List<String> l=new ArrayList<>(Arrays.asList(s));
        l.add("d");
        System.out.println(l);*/
        //Vector v=new Vector();
        //int[] i={1,2,3};
        char x='x';
        int i =0;
        System.out.println(true?x:0);
        System.out.println(false?i:x);
    }
}
/*
package com.duliday.minato;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

*/
/**
 * @author minato
 * @description 计算个税
 * @create 2021/8/3 10:28
 *//*

public class TaxCalc {
    BigDecimal tax; //应缴个税
    BigDecimal paidTax = new BigDecimal(2770.03); //已缴个税
    BigDecimal cumulativeTax; //累计个税
    BigDecimal taxableIncome;//应缴纳所得额
    BigDecimal cumulativeSalary = new BigDecimal(98400.34);//累计工资
    BigDecimal months = new BigDecimal(6);//未入职月份数
    BigDecimal thresholdTax = new BigDecimal(5000);//个税起征点
    BigDecimal specialDeduction = new BigDecimal(1500);//专项扣除
    BigDecimal socialSecurity = new BigDecimal(0);//社保
    BigDecimal housingFund = new BigDecimal(1050);//公积金

    public static void main(String[] args) throws IOException {
        BigDecimal salary;
        BigDecimal month;
        TaxCalc taxCalc = new TaxCalc();
        System.out.println("请输入工资和查询个税的月份（六月以后）：");
        Scanner scSalary = new Scanner(System.in);
        salary = new BigDecimal(scSalary.nextInt());
        Scanner scMonth = new Scanner(System.in);
        month = new BigDecimal(scMonth.nextInt());
        scSalary.close();
        scMonth.close();
        System.in.close();
        taxCalc.count(salary, month);
    }

    public void count(BigDecimal salary, BigDecimal month) {
        taxableIncome = cumulativeSalary.add(salary.multiply(month.subtract(months))).subtract(thresholdTax.multiply(month.add(new BigDecimal(1)))).subtract(specialDeduction.multiply(month.add(new BigDecimal(1)))).subtract(socialSecurity).subtract(housingFund);
        cumulativeTax = taxableIncome.multiply(new BigDecimal(0.1)).subtract(new BigDecimal(2520));
        tax = cumulativeTax.subtract(paidTax);
        System.out.println(month + "月应缴纳个税为：" + tax + "，累计缴纳：" + cumulativeTax);
    }
}
*/


