package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hs
 * @date 2019年3月17日, 0017 下午 07:08:07
 */
public class Demo1 {
    public static void main(String[] args) {
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String input=args.length == 0 ? "1818-11-11":args[0];
        System.out.print(input+" Parses as ");
        Date t;
        try {
            t=dateFormat.parse(input);
            System.out.println(t);
        }catch (ParseException e){
            System.out.println("Unparseable using " + dateFormat);
        }
    }
}
