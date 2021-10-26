package com.duliday.minato;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author Minato
 * @description 计算个税
 * @create 2021/10/11 14:24
 */
public class TaxCalcUtil {
    BigDecimal tax = new BigDecimal("0"); //应缴个税
    BigDecimal paidTax = new BigDecimal("0");
    BigDecimal cumulativeTax = new BigDecimal("0"); //累计个税
    BigDecimal taxableIncome;//计税工资
    BigDecimal preSalary;//税前工资
    BigDecimal paymentBase;//缴纳基数
    BigDecimal afterSalary;//税后工资
    BigDecimal totalAfterSalary;//税后工资（含公积金和医保）
    BigDecimal month;//要查询的月份数
    BigDecimal thresholdTax = new BigDecimal("5000");//个税起征点
    BigDecimal specialDeduction = new BigDecimal("1500");//专项扣除
    BigDecimal socialSecurity;//社保
    BigDecimal healthInsurance;//医保
    BigDecimal housingFund;//公积金
    BigDecimal mealAllowance;//餐补
    BigDecimal accumulatedIncome = new BigDecimal("0");//累计收入
    BigDecimal totalAccumulatedIncome = new BigDecimal("0");//累计收入(含公积金和医保)
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
        TaxCalcUtil taxCalcUtil = new TaxCalcUtil();
        System.out.println("是否避税？（请输入\"是\"或\"否\"）");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNext("end")) {
            if (sc.hasNext("是")) {
                System.out.println("请输入餐补、税前薪资和缴纳基数（end结束）：");
                Scanner scy = new Scanner(System.in);
                Integer mealAllowanceTemp = scy.nextInt();
                Integer preSalaryTemp = scy.nextInt();
                Integer paymentBaseTemp = scy.nextInt();
                for (int i = 0; i <= 11; i++) {
                    taxCalcUtil.countY(i, mealAllowanceTemp, preSalaryTemp, paymentBaseTemp);
                }
                break;
            } else if (sc.hasNext("否")) {
                System.out.println("请输入餐补、税前薪资（end结束）：");
                Scanner scn = new Scanner(System.in);
                Integer mealAllowanceTemp = scn.nextInt();
                Integer preSalaryTemp = scn.nextInt();
                for (int i = 0; i <= 11; i++) {
                    taxCalcUtil.countN(i, mealAllowanceTemp, preSalaryTemp);
                }
                break;
            } else {
                System.out.println("输入错误！请输入\"是\"或\"否\"");
                sc.next();
            }
        }

    }

    public void setDateY(Integer preSalaryTemp, Integer paymentBaseTemp) {
        preSalary = new BigDecimal(preSalaryTemp.toString());//税前工资
        paymentBase = new BigDecimal(paymentBaseTemp.toString());//缴纳基数
        socialSecurity = paymentBase.multiply(new BigDecimal("85")).divide(new BigDecimal("1000"));//社保
        healthInsurance = paymentBase.multiply(new BigDecimal("20")).divide(new BigDecimal("1000"));//医保
        housingFund = paymentBase.multiply(new BigDecimal("50")).divide(new BigDecimal("1000"));//公积金
    }

    public void setDateN(Integer preSalaryTemp) {
        preSalary = new BigDecimal(preSalaryTemp.toString());//税前工资
        socialSecurity = preSalary.multiply(new BigDecimal("85")).divide(new BigDecimal("1000"));//社保
        healthInsurance = preSalary.multiply(new BigDecimal("20")).divide(new BigDecimal("1000"));//医保
        housingFund = preSalary.multiply(new BigDecimal("50")).divide(new BigDecimal("1000"));//公积金
    }

    public BigDecimal calcCumulativeTax(BigDecimal taxableIncome) {
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

    public void countY(Integer monthTemp, Integer mealAllowanceTemp, Integer preSalaryTemp, Integer paymentBaseTemp) {
        setDateY(preSalaryTemp, paymentBaseTemp);//计算每月应缴公积金、社保、医保
        month = new BigDecimal(monthTemp.toString());
        mealAllowance = new BigDecimal(mealAllowanceTemp.toString());
        if (monthTemp >= 0 && monthTemp <= 11) {
            taxableIncome = paymentBase.multiply(month.add(new BigDecimal("1"))).subtract(thresholdTax.multiply(month.add(new BigDecimal("1")))).subtract(specialDeduction.multiply(month.add(new BigDecimal("1")))).subtract(socialSecurity.multiply(month.add(new BigDecimal("1")))).subtract(housingFund.multiply(month.add(new BigDecimal("1")))).subtract((healthInsurance.multiply(month.add(new BigDecimal("1")))));
            if (new BigDecimal("0").compareTo(taxableIncome) >= 0) {
                taxableIncome = new BigDecimal("0");
            } else {
                cumulativeTax = calcCumulativeTax(taxableIncome);
            }
            tax = cumulativeTax.subtract(tax);
            afterSalary = paymentBase.subtract(socialSecurity).subtract(healthInsurance).subtract(housingFund).subtract(tax).add(mealAllowance).add(preSalary).subtract(paymentBase);
            totalAfterSalary = afterSalary.add(housingFund.multiply(new BigDecimal("2"))).add(socialSecurity.multiply(new BigDecimal("2"))).add(healthInsurance.multiply(new BigDecimal("2")));//包含公积金、社保、医保
            accumulatedIncome = accumulatedIncome.add(afterSalary);
            totalAccumulatedIncome = totalAccumulatedIncome.add(totalAfterSalary);
            System.out.println((new BigDecimal("0").compareTo(month) == 0 ? "2021年" : "2022年") + (new BigDecimal("10").compareTo(month) > 0 && new BigDecimal("1").compareTo(month) <= 0 ? 0 : "") + (new BigDecimal("0").compareTo(month) == 0 ? 12 : month) + "月应缴纳个税：" + tax + "，累计缴纳：" + cumulativeTax + ",计税工资：" + taxableIncome + "，税后薪资：" + afterSalary + ",税后薪资(含公积金、社保和医保)：" + totalAfterSalary + ",累计收入：" + accumulatedIncome + ",累计收入（含公积金、社保和医保）：" + totalAccumulatedIncome);
        } else {
            System.out.println("请输入一月到十二月之间的月份！");
        }
    }

    public void countN(Integer monthTemp, Integer mealAllowanceTemp, Integer preSalaryTemp) {
        setDateN(preSalaryTemp);//计算每月应缴公积金、社保、医保
        month = new BigDecimal(monthTemp.toString());
        mealAllowance = new BigDecimal(mealAllowanceTemp.toString());
        if (monthTemp >= 0 && monthTemp <= 11) {
            taxableIncome = preSalary.multiply(month.add(new BigDecimal("1"))).subtract(thresholdTax.multiply(month.add(new BigDecimal("1")))).subtract(specialDeduction.multiply(month.add(new BigDecimal("1")))).subtract(socialSecurity.multiply(month.add(new BigDecimal("1")))).subtract(housingFund.multiply(month.add(new BigDecimal("1")))).subtract((healthInsurance.multiply(month.add(new BigDecimal("1")))));
            if (new BigDecimal("0").compareTo(taxableIncome) >= 0) {
                taxableIncome = new BigDecimal("0");
            } else {
                cumulativeTax = calcCumulativeTax(taxableIncome);
            }
            cumulativeTax = cumulativeTax.subtract(mealAllowance.multiply(month.add(new BigDecimal("1"))));//累计应缴纳个税
            tax = cumulativeTax.subtract(paidTax);//当月应缴纳个税
            if (new BigDecimal("0").compareTo(tax) >= 0) {
                cumulativeTax = new BigDecimal("0");
                tax = new BigDecimal("0");
            }
            paidTax = paidTax.add(tax);//已缴纳个税
            afterSalary = preSalary.subtract(socialSecurity).subtract(healthInsurance).subtract(housingFund).subtract(tax).add(mealAllowance);
            totalAfterSalary = afterSalary.add(housingFund.multiply(new BigDecimal("2"))).add(socialSecurity.multiply(new BigDecimal("2"))).add(healthInsurance.multiply(new BigDecimal("2")));//包含公积金、社保、医保
            accumulatedIncome = accumulatedIncome.add(afterSalary);
            totalAccumulatedIncome = totalAccumulatedIncome.add(totalAfterSalary);
            System.out.println((new BigDecimal("0").compareTo(month) == 0 ? "2021年" : "2022年") + (new BigDecimal("10").compareTo(month) > 0 && new BigDecimal("1").compareTo(month) <= 0 ? 0 : "") + (new BigDecimal("0").compareTo(month) == 0 ? 12 : month) + "月应缴纳个税：" + tax + "，累计缴纳：" + paidTax + ",计税工资：" + taxableIncome + "，税后薪资：" + afterSalary + ",税后薪资(含公积金、社保和医保)：" + totalAfterSalary + ",累计收入：" + accumulatedIncome + ",累计收入（含公积金、社保和医保）：" + totalAccumulatedIncome);
        } else {
            System.out.println("请输入一月到十二月之间的月份！");
        }
    }

}