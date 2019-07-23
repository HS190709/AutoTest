package test;

import java.util.Collections;
import java.util.List;

/**
 * @author hs
 * @date 2019年4月28日, 0028 下午 07:49:33
 */
public class TestDemo4 {
    public static void main(String[] args) {
        int[] a = {1,3,5,7};
        int[] b = {2,4,6,8};
        for (int i=0;i<b.length-1;i++){
            if (b[i]>=a[i]&&b[i]<=a[i+1]){
                System.out.println(a[i]+" "+b[i]);
            }
        }
    }
}

