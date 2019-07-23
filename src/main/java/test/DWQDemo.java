package test;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

/**
 * @author hosni
 * @date 2019/06/21 18:28:46
 **/
public  abstract class DWQDemo implements Test3 , Serializable {

    private static final long serialVersionUID = 3562259060550666009L;
    static final int a=100;
    static {
        System.out.println("请输入内容：");

    }


    public static void main(String[] args) {
     /*   Test2 test2=new DWQDemo();*/
//        test2.print();
    }

    public DWQDemo() {
        int a=10;
    }

    private static final Scanner scan = new Scanner(System.in);
    public void print() throws IOException {
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
        scan.close();
    }
}
