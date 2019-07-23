package test;

import java.util.Scanner;

/**
 * @author hosni
 * @date 2019/06/15 19:38:02
 **/
public class TestScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=0;
        double sum=0;
        System.out.println("请输入数字");
        while (scan.hasNextDouble()){
            double d=scan.nextDouble();
            sum+=d;
            num++;
        }
        if (num==0){
            System.out.println("和为："+sum+"平均数为：0 "+"个数为："+num);
        }else{
            System.out.println("和为："+sum+"平均数为："+sum/num+"个数为："+num);
        }
    }
}
