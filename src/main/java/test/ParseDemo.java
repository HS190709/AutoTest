package test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hs
 * @date 2019年4月19日, 0019 下午 07:50:11
 */
public class ParseDemo {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date t;
        String input;
        input=args.length==0?"1818-06-04":args[0];
        System.out.print(input+" parse as ");
        try {
            t=simpleDateFormat.parse(input);
            System.out.println(t);
        }catch (Exception e){
            System.out.println("无法解析"+input);
        }


    }
}
