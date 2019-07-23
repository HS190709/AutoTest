package test;

/**
 * @author hs
 * @date 2019年4月19日, 0019 上午 10:20:21
 */
public class BridePrice {
    public static void main(String[] args){
        int sum=0;
        for (int i=0;i<31;i++){
            sum+=(int)Math.pow(2,i);
        }
        System.out.println("一个月后应该给岳父"+sum/100+"元");
    }
}