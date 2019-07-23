package test;

import java.util.Map;
import java.util.regex.*;

/**
 * @author hs
 * @date 2019年1月18日, 0018 下午 03:16:59
 */
public class TexPro {
    public static void main(String args[]){
        String content="\\\\";
        String pattern="\\\\";
        System.out.println(content);
        System.out.println(pattern);
        boolean isMatch= Pattern.matches(pattern,content);
        System.out.println("是否包含了‘\\\\’？"+isMatch);
       /* String aa = "ssss\nffff";
        String bb = "ssss\\d ffff";
        System.out.println();*/

       //Map<Integer, String> map = null;
    }
}
