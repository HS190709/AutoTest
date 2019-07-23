//import java.util.regex.*;
///**
// * @author hs
// * @date 2019年1月16日,0016下午 09:50:11
// */
//public class TestDemo {
//    public static void main(String[] args) {
//        int a = 11B;
//        // 要验证的字符串/**/
//        String str = "service@xsoftlab.net";/**/
//        // 邮箱验证规则
//        String regEx = "[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}";
//        // 编译正则表达式
//        Pattern pattern = Pattern.compile(regEx);
//        // 忽略大小写的写法
//        // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher(str);
//        // 字符串是否与正则表达式相匹配
//        boolean rs = matcher.matches();
//        System.out.println(rs);
//    }
//}
