package test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author hs
 * @date 2019年4月25日, 0025 下午 12:40:27
 */
public class RegexDemo3 {
    //private static final String INPUT="18874075848";
    private static final String REGEX="1[0-9]{10}";

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入手机号：");
        String input=String.valueOf(scanner.nextLong());
        Pattern pattern=Pattern.compile(REGEX);
        Matcher matcher=pattern.matcher(input);
        System.out.println(matcher.matches()?"合法手机号":"非法手机号");
    }
}
