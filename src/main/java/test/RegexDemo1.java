package test;

/**
 * @author hs
 * @date 2019年4月23日, 0023 下午 03:57:29
 */
public class RegexDemo1 {
    public static void main(String[] args) {
        String content="\\";
        String pattern="\\\\";
        boolean isMatches=content.matches(pattern);
        System.out.println(isMatches);
        char a='a';
        char b='a'-32;
        //String b=a.toUpperCase();
        //System.out.println(String.format("%s %s")String a,b);
    }
}
