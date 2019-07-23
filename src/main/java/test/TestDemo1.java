package test;

import java.util.Arrays;

/**
 * @author hs
 * @date 2019年4月26日, 0026 下午 06:58:45
 */
public class TestDemo1 {
    public static void main(String[] args) {
        String[] a={"66","88"};
        String[] b={"55","77","99"};
        for (int i=0;i<3;i++){
            String[] c= new String[2];
            System.arraycopy(a,i,c,i,1);
            System.arraycopy(b,i+1,c,i+1,1);
            System.out.println(c);
        }

        String[] str1 = {"Hello","world","java"};
        String[] str2 = {"Veriable","syntax","interator"};
        int str1Length = str1.length;
        int str2length = str2.length;
        str1 = Arrays.copyOf(str1, str1Length+str2length);//数组扩容
        System.arraycopy(str2, 0, str1, str1Length, str2length);
        System.out.println(Arrays.toString(str1));
    }

}
