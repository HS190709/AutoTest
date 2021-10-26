package com.duliday.minato;

import java.util.Scanner;

/**
 * @author Minato
 * @description 功能描述
 * @create 2021/9/27 10:20
 */
public class MainDemo {
    public static void main(String[] args) {
        for (String arg : args
        ) {
            System.out.println(arg);
        }
        for (String arg : args
        ) {
            if ("黄帅".equals(arg)) {
                System.out.println("要当爸爸了！");
                break;
            } else {
                System.out.println("来来");
                break;
            }
        }
    }
}
