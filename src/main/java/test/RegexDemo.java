package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author hs
 * @date 2019年4月23日, 0023 下午 12:39:11
 */
public class RegexDemo {
    public static void main(String[] args) {
        String content = "This order was placed for QT3000! OK?";
        String pattern = "(\\D+)(\\d+)(.+)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(content);
        m.groupCount();
        try {
            if (m.find()) {
                System.out.println("Found value: " + m.group(0));
                System.out.println("Found value: " + m.group(1));
                System.out.println("Found value: " + m.group(2));
                System.out.println("Found value: " + m.group(3));
            } else {
                System.out.println("NO MATCH");
            }
        } catch (Exception e) {
            System.out.println("发现一个异常");
        }
    }
}
