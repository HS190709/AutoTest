package com.duliday.minato;

import org.testng.annotations.Test;

/**
 * @author Minato
 * @description 税收测试
 * @create 2021/12/3 18:00
 */
public class TestCalcTax {
    @Test
    public void test() {
        Income[] incomes = new Income[]{
                new Income(3000),
                new Salary(7500),
                new StateCouncilSpecialAllowance(15000)
        };
        CalcTax calcTax=new CalcTax();
        System.out.println(calcTax.calcTax(incomes));
    }
}
