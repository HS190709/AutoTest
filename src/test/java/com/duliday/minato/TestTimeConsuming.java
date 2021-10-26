package com.duliday.minato;

import org.testng.annotations.Test;

import java.util.Scanner;

/**
 * @author Minato
 * @description 功能描述
 * @create 2021/9/26 11:42
 */
public class TestTimeConsuming {
    public static void main(String[] args) throws Exception {
        TestTimeConsuming testTimeConsuming = new TestTimeConsuming();
        testTimeConsuming.test();
    }
    public void test() throws Exception {
        String className = null;
        String methodName = null;
        String className1 = null;
        String methodName1 = null;
        TimeConsuming timeConsuming = new TimeConsuming();
        System.out.println("请输入要测试的类名与方法名：");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("end")) {
            className = scanner.next();
            methodName = scanner.next();
            className1 = scanner.next();
            methodName1 = scanner.next();

        }
        scanner.close();
        System.in.close();
        timeConsuming.calc(className, methodName);
        System.out.println("==============================================================");
        timeConsuming.calc(className1,methodName1);
    }
}
