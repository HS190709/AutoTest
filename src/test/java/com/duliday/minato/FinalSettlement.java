package com.duliday.minato;

import org.testng.annotations.Test;

import java.math.BigDecimal;

/**
 * @author Minato
 * @description 功能描述
 * @create 2022/3/18 14:27
 */
public class FinalSettlement {
    TaxTestDemo taxTestDemo = new TaxTestDemo();
    CalcPersonnalTax calcPersonnalTax = new CalcPersonnalTax();

    @Test
    public void count() {
        BigDecimal supplementaryBalance;
        BigDecimal cumulativeTax1;
        BigDecimal cumulativeTax2;
        cumulativeTax1 = taxTestDemo.count(5);
        System.out.println("====================================================================");
        cumulativeTax2 = calcPersonnalTax.count(5);
        supplementaryBalance = cumulativeTax2.subtract(cumulativeTax1);
        if (supplementaryBalance.compareTo(new BigDecimal("0"))==0){
            System.out.println("应补缴的个税金额为：0元。");
        }else if (supplementaryBalance.compareTo(new BigDecimal("0"))>0){
            System.out.println("应补缴个税金额为："+supplementaryBalance+"元。");
        }else {
            System.out.println("您退税金额为"+supplementaryBalance.abs()+"元。");
        }
    }
}
