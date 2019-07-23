package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author hs
 * @date 2019年4月24日, 0024 下午 02:03:06
 */
public class RegexDemo2 {
    private static final String input="cat cat cat catttt cat";
    private static final String regex="\\bcat\\b";
    public static void main(String[] args) {
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(input);
        int count=0;
        while (m.find()){
            count++;
            String sentence="Match number:%d start():%d end():%d%n";
            /*System.out.printf(sentence, count,m.start(),m.end());
            System.out.format(sentence, count,m.start(),m.end());
            System.out.print(String.format(sentence, count,m.start(),m.end()));*/
            System.getProperty("line.separator");
            //System.out.println(m.start());
            //System.out.println(m.end());
        }
    }
}
