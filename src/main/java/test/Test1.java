package test;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author hosni
 * @date 2019/06/21 18:06:41
 **/
public  class Test1  {
    public Test1() {
        int a=0;
    }

    private static final Scanner scan = new Scanner(System.in);
    public void print() throws IOException{
        System.out.println("请输入内容：");
        while (!scan.hasNext("end")){
            if (scan.hasNextInt()){
                int a=scan.nextInt();
                System.out.println("输入的是数字"+a);
            }else {
                System.out.println("请输入数字！");
                String b=scan.next();
            }
        }

    }
    public void print(int a)throws IOException {
        System.out.println("请输入内11111111111容：");
        while (!scan.hasNext("END")){
            if (scan.hasNextInt()){
                int b=scan.nextInt();
                System.out.println("输入的是数字"+a);
            }else {
                System.out.println("请输入数字！");
                String b=scan.next();
            }
        }
        scan.close();
    }
}

