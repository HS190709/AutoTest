package test;


import java.util.Date;
import java.text.*;
/**
 * @author hs
 * @date 2019年3月11日, 0011 下午 07:25:27
 */
public class Demo {
    public static void main(String[] args){
        Date date=new Date();
        Date date1=new Date(date.getTime()+1000);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE");
        DateFormat dateFormat=new SimpleDateFormat();
        Comparable comparable=new Date();
        //Date date1=new Date (long millisec)
        System.out.printf("当前时间为：%tc%n",date);
        System.out.println("当前时间为："+date.getTime());
        System.out.println("当前时间为："+date.toString());
        System.out.println("当前时间为："+simpleDateFormat.format(date1));
        System.out.println("当前时间为："+date1.compareTo(date));
        //System.out.println(String.valueOf(date));

    }
}