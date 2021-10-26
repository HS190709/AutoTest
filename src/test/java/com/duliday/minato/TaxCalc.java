package com.duliday.minato;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author minato
 * @description 计算个税
 * @create 2021/8/3 10:28
 */
public class TaxCalc {
    BigDecimal tax; //应缴个税
    BigDecimal paidTax = new BigDecimal("2770.03"); //已缴个税
    BigDecimal cumulativeTax; //累计个税
    BigDecimal taxableIncome;//应缴纳所得额
    BigDecimal cumulativeSalary = new BigDecimal("98400.34");//累计工资
    BigDecimal preSalary = new BigDecimal("21000");//税前工资
    BigDecimal afterSalary;//税后工资
    BigDecimal totalAfterSalary;//税后工资（含公积金）
    BigDecimal months = new BigDecimal("6");//未入职月份数
    BigDecimal month;//要查询的月份数
    BigDecimal thresholdTax = new BigDecimal("5000");//个税起征点
    BigDecimal specialDeduction = new BigDecimal("1500");//专项扣除
    BigDecimal socialSecurity = new BigDecimal("2205");//社保
    BigDecimal housingFund = new BigDecimal("1050");//公积金
    BigDecimal mealAllowance;//餐补
    BigDecimal accumulatedIncome = new BigDecimal("0");//累计收入
    BigDecimal accumulatedIncome1 = new BigDecimal("0");//累计收入(含公积金)
    BigDecimal[] cumulativeIncome = {
            new BigDecimal("0"),
            new BigDecimal("36000"),
            new BigDecimal("144000"),
            new BigDecimal("300000"),
            new BigDecimal("420000"),
            new BigDecimal("660000"),
            new BigDecimal("960000")
    }; //收入范围
    BigDecimal[] taxRate = {
            new BigDecimal("0.03"),
            new BigDecimal("0.1"),
            new BigDecimal("0.2"),
            new BigDecimal("0.25"),
            new BigDecimal("0.3"),
            new BigDecimal("0.35"),
            new BigDecimal("0.45")
    };//税率
    BigDecimal[] quickDeduction = {
            new BigDecimal("0"),
            new BigDecimal("2520"),
            new BigDecimal("16920"),
            new BigDecimal("31920"),
            new BigDecimal("52920"),
            new BigDecimal("85920"),
            new BigDecimal("181920")
    };//速算扣除数


    public static void main(String[] args) throws IOException {
        TaxCalc taxCalc = new TaxCalc();
        System.out.println("请输入查询个税的月份和当月餐补：输入end结束");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNext("end")) {
            Integer monthTemp = sc.nextInt();
            Integer mealAllowanceTemp = sc.nextInt();
            taxCalc.count(monthTemp, mealAllowanceTemp);
        }
        sc.close();
        System.in.close();
        for (int i = 0; i <= 11; i++) {
            taxCalc.count(i, 800);
        }
    }


    public BigDecimal calcTempCumulativeTax(Integer n) {
        BigDecimal calcTempCumulativeTax = new BigDecimal("0");
        for (int i = 0; i < n; i++) {
            BigDecimal[] temp = new BigDecimal[n];
            temp[i] = cumulativeIncome[i + 1].subtract(cumulativeIncome[i]).multiply(taxRate[i]).subtract(quickDeduction[i]);
            for (int j = 0; j < n; j++) {
                calcTempCumulativeTax = calcTempCumulativeTax.add(temp[j]);
            }
        }
        return calcTempCumulativeTax;
    }

    public BigDecimal calcCumulativeTax(BigDecimal taxableIncome) {
        cumulativeTax = new BigDecimal("0");
        if (cumulativeIncome[1].compareTo(taxableIncome) >= 0 && cumulativeIncome[0].compareTo(taxableIncome) < 0) {
            cumulativeTax = taxableIncome.multiply(taxRate[0]).subtract(quickDeduction[0]);
        } else if (cumulativeIncome[2].compareTo(taxableIncome) >= 0 && cumulativeIncome[1].compareTo(taxableIncome) < 0) {
            cumulativeTax = taxableIncome.multiply(taxRate[1]).subtract(quickDeduction[1]);
        } else if (cumulativeIncome[3].compareTo(taxableIncome) >= 0 && cumulativeIncome[2].compareTo(taxableIncome) < 0) {
            cumulativeTax = taxableIncome.multiply(taxRate[2]).subtract(quickDeduction[2]);
        } else if (cumulativeIncome[4].compareTo(taxableIncome) >= 0 && cumulativeIncome[3].compareTo(taxableIncome) < 0) {
            cumulativeTax = taxableIncome.multiply(taxRate[3]).subtract(quickDeduction[3]);
        } else if (cumulativeIncome[5].compareTo(taxableIncome) >= 0 && cumulativeIncome[4].compareTo(taxableIncome) < 0) {
            cumulativeTax = taxableIncome.multiply(taxRate[4]).subtract(quickDeduction[4]);
        } else if (cumulativeIncome[6].compareTo(taxableIncome) >= 0 && cumulativeIncome[5].compareTo(taxableIncome) < 0) {
            cumulativeTax = taxableIncome.multiply(taxRate[5]).subtract(quickDeduction[5]);
        } else if (cumulativeIncome[6].compareTo(taxableIncome) < 0) {
            cumulativeTax = taxableIncome.multiply(taxRate[6]).subtract(quickDeduction[6]);
        } else {
            System.out.println("收入：" + taxableIncome + "元，收入过低暂不扣税");
        }
        return cumulativeTax;
    }

    public void count(Integer monthTemp, Integer mealAllowanceTemp) {
        //挺好的可以参悟参悟taxableIncome = cumulativeSalary.add(preSalary.multiply(month.subtract(months))).subtract(thresholdTax.multiply(new BigDecimal("12").compareTo(month) <= 0 ? new BigDecimal("1") : month.add(new BigDecimal("1")))).subtract(specialDeduction.multiply(new BigDecimal("12").compareTo(month) <= 0 ? new BigDecimal("1") : month.add(new BigDecimal("1")))).subtract(socialSecurity.multiply(month.subtract(months))).subtract(housingFund.multiply(month.subtract(months)));
        if (monthTemp == 12) {
            monthTemp = 0;
            paidTax = new BigDecimal("0");
        }
        month = new BigDecimal(monthTemp.toString());
        mealAllowance = new BigDecimal(mealAllowanceTemp.toString());
        if (6 < monthTemp && monthTemp < 12) {
            taxableIncome = cumulativeSalary.add(preSalary.multiply(month.subtract(months))).subtract(thresholdTax.multiply(month.add(new BigDecimal("1")))).subtract(specialDeduction.multiply(month.add(new BigDecimal("1")))).subtract(socialSecurity.multiply(month.subtract(months))).subtract(housingFund.multiply(month.subtract(months)));
            cumulativeTax = calcCumulativeTax(taxableIncome).subtract(mealAllowance);
            tax = cumulativeTax.subtract(paidTax);
            paidTax = cumulativeTax;
            afterSalary = preSalary.subtract(socialSecurity).subtract(housingFund).subtract(tax).add(mealAllowance);
            System.out.println("2021年" + month + "月应缴纳个税为：" + tax + "，累计缴纳：" + cumulativeTax + "，税后薪资为：" + afterSalary);
        } else if (monthTemp >= 0 && monthTemp <= 6) {
            taxableIncome = preSalary.multiply(month.add(new BigDecimal("1"))).subtract(thresholdTax.multiply(month.add(new BigDecimal("1")))).subtract(specialDeduction.multiply(month.add(new BigDecimal("1")))).subtract(socialSecurity.multiply(month.add(new BigDecimal("1")))).subtract(housingFund.multiply(month.add(new BigDecimal("1"))));
            cumulativeTax = calcCumulativeTax(taxableIncome).subtract(mealAllowance);
            tax = cumulativeTax.subtract(paidTax);
            if (new BigDecimal("0").compareTo(tax) > 0) {
                tax = new BigDecimal("0");
                cumulativeTax = new BigDecimal("0");
            }
            paidTax = cumulativeTax;
            afterSalary = preSalary.subtract(socialSecurity).subtract(housingFund).subtract(tax).add(mealAllowance);
            totalAfterSalary = preSalary.subtract(socialSecurity).subtract(housingFund).subtract(tax).add(mealAllowance).add(housingFund.multiply(new BigDecimal("2")));
            accumulatedIncome = accumulatedIncome.add(afterSalary);
            accumulatedIncome1 = accumulatedIncome1.add(totalAfterSalary);
            System.out.println((new BigDecimal("0").compareTo(month) == 0 ? "2021年" : "2022年") + (new BigDecimal("0").compareTo(month) == 0 ? 12 : month) + "月应缴纳个税：" + tax + "，累计缴纳：" + cumulativeTax + ",计税工资：" + taxableIncome + "，税后薪资：" + afterSalary + ",税后薪资(含公积金)：" + totalAfterSalary + ",累计收入：" + accumulatedIncome + ",累计收入（含公积金）：" + accumulatedIncome1);
        } else {
            System.out.println("请输入一月到十二月之间的月份！");
        }
        //赋值时没有用String类型导致后面需要转精度
        //System.out.println(month + "月应缴纳个税为：" + tax.setScale(2, RoundingMode.HALF_UP) + "，累计缴纳：" + cumulativeTax.setScale(2, RoundingMode.HALF_UP) + "，税后薪资为：" + afterSalary.setScale(2, RoundingMode.HALF_UP));
    }
}
