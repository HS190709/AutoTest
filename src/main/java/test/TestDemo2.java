package test;

/**
 * @author hs
 * @date 2019年4月27日, 0027 下午 06:07:00
 */
public class TestDemo2 {
    public static void main(String[] args) {
        int[] a={1,6,7,8,9};
        int n=3;
        int m=0;
        for(int i=0;i<5;i++){
            if (Math.abs((n-a[i]))<Math.abs((n-a[i+1]))){
            m=a[i];
            }else {
                m=a[i+1];
            }
        }
    }
}
