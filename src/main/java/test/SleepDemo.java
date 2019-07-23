package test;

import java.util.Date;

/**
 * @author hs
 * @date 2019年4月19日, 0019 上午 09:47:54
 */
public class SleepDemo {
    public static void main(String[] args){
        Date date=new Date();
        try {
            System.out.println(new Date()+ "\n");
            Thread.sleep(1000*3);
            System.out.println(new Date());
        }catch (Exception e){
            System.out.println("Got an exception!");
        }

    }
}
