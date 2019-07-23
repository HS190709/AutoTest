package test;

import java.io.Console;
import java.util.Scanner;

/**
 * @author hosni
 * @date 2019/06/14 21:14:06
 **/
public class TestScannerDemo {
    public static void main(String[] args) {
        Console con=System.console();
        String username=con.readLine("User name:");
        char[] password=con.readPassword("password:");
        System.out.println("密码为："+password);
    }
}