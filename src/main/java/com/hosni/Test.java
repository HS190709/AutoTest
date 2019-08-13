package com.hosni;

import java.math.BigDecimal;

/**
 * @author hosni
 * @date 2019/08/13 19:34:15
 **/
public class Test {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("107944.9");
        BigDecimal bigDecima = new BigDecimal("12272.5");
        System.out.println(bigDecimal.add(bigDecima));
    }
}
