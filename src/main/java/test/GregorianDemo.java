package test;

import java.util.GregorianCalendar;

/**
 * @author hs
 * @date 2019年4月22日, 0022 下午 07:51:04
 */
public class GregorianDemo {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar=new GregorianCalendar();
        String[] month={"Jan", "Feb", "Mar", "Apr","May", "Jun", "Jul", "Aug","Sep", "Oct", "Nov", "Dec"};
        System.out.println("日期为："+gregorianCalendar.get(gregorianCalendar.YEAR)
                +" "+month[gregorianCalendar.get(gregorianCalendar.MONTH)]
                +" "+gregorianCalendar.get(gregorianCalendar.DATE)
                +" "+gregorianCalendar.get(gregorianCalendar.HOUR)
                +":"+gregorianCalendar.get(gregorianCalendar.MINUTE)
                +":"+gregorianCalendar.get(gregorianCalendar.SECOND));
        if (gregorianCalendar.isLeapYear(gregorianCalendar.get(gregorianCalendar.YEAR))){
            System.out.println("当前是闰年");
        }else {
            System.out.println("当前是平年");
        }
    }
}
