package com.duliday.minato;

/**
 * @author Minato
 * @description 计算税收练习
 * @create 2021/12/3 17:30
 */



public class CalcTax {
    public double calcTax(Income[] incomes) {
        double total = 0;
        for (Income income : incomes
        ) {
            total += income.getTax();
        }
        return total;
    }
}

class Income {
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.1;
    }
}

class Salary extends Income {
    public Salary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

class StateCouncilSpecialAllowance extends Income {
    public StateCouncilSpecialAllowance(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}

