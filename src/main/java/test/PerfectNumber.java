package test;

import java.util.*;

/**
 * @author hs
 * @date 2019年2月1日, 0001 下午 08:07:28
 */
public class PerfectNumber {
    public static void main(String args[]){
        int a=new Random().nextInt(32);
        int i,j;
        int n=10000;
        for(i=1;i<n;++i){
          int sum=0;
          for (j=1;j<=i/2;++j){
              if(i%j==0){
                  sum+=j;
                }
            }
          if (i==sum){
              System.out.println(n+"以内的完美数有："+i);
          }
        }
    }
}

/*
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Collections.sort(list);
    }*/
