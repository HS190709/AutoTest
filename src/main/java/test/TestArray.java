package test;

import java.util.Random;

/**
 * @author hs
 * @date 2019年2月28日, 0028 下午 06:22:57
 */
public class TestArray {
    public static void main(String args[]){
        int size=10;
        double sum=0;
        double[] array=new double[size];
        Random random=new Random();
        for(int i=0;i<size;++i){
           array[i]=random.nextDouble();
           sum+=array[i];
           System.out.println(array[i]);
        }
        System.out.println("和为："+sum);
    }
}
