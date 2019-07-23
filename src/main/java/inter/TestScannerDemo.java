package inter;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author HS
 * @date 2019/06/16 18:54:48
 **/
public class TestScannerDemo {
    public static final Scanner scan=new Scanner(System.in);
    public void print() throws IOException {
        try {
            //scan.useDelimiter("\n");
            System.out.println("请输入内容：");
            while (!scan.hasNext("end")){
                if (scan.hasNextInt()){
                    int a=scan.nextInt();
                    System.out.println("输入的为整数："+a);
                }else if(scan.hasNextFloat()){
                    float a=scan.nextFloat();
                    System.out.println("输入的为小数："+a);
                }else{
                    System.out.println("请输入整数或小数！");
                    String a=scan.next();
                }
            }
            //System.in.mark(0);
            /*scan.close();*/
//        scan.reset();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scan.close();
        }
    }
    public static final void close(){
        scan.close();
    }
}
