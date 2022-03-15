package com.duliday.minato;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Minato
 * @description 计算个税
 * @create 2022/1/17 17:03
 */

public class TaxTestDemo {
    BigDecimal tax; //应缴个税
    BigDecimal paidTax = new BigDecimal("0"); //已缴个税
    BigDecimal cumulativeTax = new BigDecimal("0"); //累计个税
    BigDecimal accumulatedIncome = new BigDecimal("0");//累计收入
    BigDecimal totalAccumulatedIncome = new BigDecimal("0");//累计收入(含公积金和医保)
    BigDecimal aggregateIncome = new BigDecimal("0");//综合所得收入额
    BigDecimal preSalary = new BigDecimal("21000");//税前工资
    BigDecimal afterSalary;//税后工资
    BigDecimal totalAfterSalary;//税后工资（含公积金）
    BigDecimal thresholdTax = new BigDecimal("5000");//个税起征点
    BigDecimal specialDeduction = new BigDecimal("0");//专项扣除
    BigDecimal socialSecurity;//社保
    BigDecimal healthInsurance;//医保
    BigDecimal housingFund;//公积金
    BigDecimal[] mealAllowance = {
            new BigDecimal("720"),
            new BigDecimal("760"),
            new BigDecimal("540"),
            new BigDecimal("520"),
            new BigDecimal("640")};//餐补
    BigDecimal[] backPay = {
            new BigDecimal("0"),
            new BigDecimal("0"),
            new BigDecimal("0"),
            new BigDecimal("160"),
            new BigDecimal("0")};//补发工资
    BigDecimal[] absenteeismSalary = {
            new BigDecimal("0"),
            new BigDecimal("0"),
            new BigDecimal("0"),
            new BigDecimal("366.90"),
            new BigDecimal("1931.03")};//缺勤薪资
    BigDecimal[] performanceBonus = {
            new BigDecimal("0"),
            new BigDecimal("0"),
            new BigDecimal("6300"),
            new BigDecimal("0"),
            new BigDecimal("0")};//绩效奖金
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


    public static void main(String[] args) {
        TaxTestDemo taxTestDemo = new TaxTestDemo();
        for (int i = 0; i < 5; i++) {
            taxTestDemo.count(i + 8, taxTestDemo.mealAllowance[i], taxTestDemo.backPay[i],taxTestDemo.absenteeismSalary[i], taxTestDemo.performanceBonus[i]);
        }
    }

    public void setDate(BigDecimal preSalary) {
        socialSecurity = preSalary.multiply(new BigDecimal("85")).divide(new BigDecimal("1000"));//社保
        healthInsurance = preSalary.multiply(new BigDecimal("20")).divide(new BigDecimal("1000"));//医保
        housingFund = preSalary.multiply(new BigDecimal("50")).divide(new BigDecimal("1000"));//公积金
    }

    public BigDecimal calcCumulativeTax(BigDecimal aggregateIncome) {
        if (cumulativeIncome[1].compareTo(aggregateIncome) >= 0 && cumulativeIncome[0].compareTo(aggregateIncome) < 0) {
            cumulativeTax = aggregateIncome.multiply(taxRate[0]).subtract(quickDeduction[0]);
        } else if (cumulativeIncome[2].compareTo(aggregateIncome) >= 0 && cumulativeIncome[1].compareTo(aggregateIncome) < 0) {
            cumulativeTax = aggregateIncome.multiply(taxRate[1]).subtract(quickDeduction[1]);
        } else if (cumulativeIncome[3].compareTo(aggregateIncome) >= 0 && cumulativeIncome[2].compareTo(aggregateIncome) < 0) {
            cumulativeTax = aggregateIncome.multiply(taxRate[2]).subtract(quickDeduction[2]);
        } else if (cumulativeIncome[4].compareTo(aggregateIncome) >= 0 && cumulativeIncome[3].compareTo(aggregateIncome) < 0) {
            cumulativeTax = aggregateIncome.multiply(taxRate[3]).subtract(quickDeduction[3]);
        } else if (cumulativeIncome[5].compareTo(aggregateIncome) >= 0 && cumulativeIncome[4].compareTo(aggregateIncome) < 0) {
            cumulativeTax = aggregateIncome.multiply(taxRate[4]).subtract(quickDeduction[4]);
        } else if (cumulativeIncome[6].compareTo(aggregateIncome) >= 0 && cumulativeIncome[5].compareTo(aggregateIncome) < 0) {
            cumulativeTax = aggregateIncome.multiply(taxRate[5]).subtract(quickDeduction[5]);
        } else if (cumulativeIncome[6].compareTo(aggregateIncome) < 0) {
            cumulativeTax = aggregateIncome.multiply(taxRate[6]).subtract(quickDeduction[6]);
        } else {
            System.out.println("收入：" + aggregateIncome + "元，收入过低暂不扣税");
        }
        return cumulativeTax;
    }

    public void count(Integer month, BigDecimal mealAllowance,BigDecimal backPay, BigDecimal absenteeismSalary, BigDecimal performanceBonus) {
        setDate(preSalary);
        aggregateIncome = preSalary.subtract(socialSecurity).subtract(healthInsurance).subtract(housingFund).subtract(specialDeduction).subtract(thresholdTax).subtract(absenteeismSalary).add(aggregateIncome).add(mealAllowance)/*.add(backPay)*/;
        cumulativeTax = calcCumulativeTax(aggregateIncome);
        tax = cumulativeTax.subtract(paidTax);
        if (new BigDecimal("0").compareTo(tax) > 0) {
            tax = new BigDecimal("0");
        } else {
            paidTax = cumulativeTax;
        }
        tax=tax.setScale(2, RoundingMode.HALF_UP);
        afterSalary = preSalary.subtract(socialSecurity).subtract(healthInsurance).subtract(housingFund).subtract(tax).add(mealAllowance).subtract(absenteeismSalary).add(performanceBonus).add(backPay);
        totalAfterSalary = afterSalary.add(housingFund.multiply(new BigDecimal("2")));//包含公积金
        accumulatedIncome = accumulatedIncome.add(afterSalary);
        totalAccumulatedIncome = totalAccumulatedIncome.add(totalAfterSalary);
        System.out.println("2021年" + month + "月应缴纳个税：" + tax + "，累计缴纳：" + cumulativeTax + ",综合所得收入额：" + aggregateIncome + "，税后薪资：" + afterSalary + ",税后薪资(含公积金)：" + totalAfterSalary + ",累计收入：" + accumulatedIncome + ",累计收入（含公积金）：" + totalAccumulatedIncome);

    }
}