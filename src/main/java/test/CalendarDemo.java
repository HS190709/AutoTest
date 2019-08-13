package test;

import java.util.Calendar;

/**
 * @author hs
 * @date 2019年4月22日, 0022 下午 05:06:13
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        calendar.set(2019,4,22);
        //System.out.println(calendar.get(calendar.YEAR)+"-"+(calendar.get(calendar.MONTH)+1)+"-"+calendar.get(calendar.DATE));
        //calendar.set(2019,4,0);
        calendar.add(Calendar.MONTH,2);
        System.out.println(calendar.get(calendar.YEAR)+"-"+(calendar.get(calendar.MONTH)+1)+"-"+calendar.get(calendar.DATE));
        System.out.println(calendar.getTime());

    }
}
