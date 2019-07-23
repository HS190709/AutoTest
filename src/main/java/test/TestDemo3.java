package test;

/**
 * @author hs
 * @date 2019年4月27日, 0027 下午 08:19:08
 */
public class TestDemo3 {
    public static void main(String[] args) {
        String[]a={"10"};
        String[]b={"8"};
        StringBuilder s=new StringBuilder();
        if (a.length==0){
            System.out.println("jion数据为空");
        }else if (b.length==0){
            System.out.println("live数据为空");
        }else if(a.length==1){
            if (b.length==1){
                if (a[0].compareTo(b[0])<=0){
                    s.append(a[0]).append(" ").append(b[0]);
                    System.out.println(s);
                }else {
                    System.out.println("live数据缺失");
                }
            }else {
                if (a[0].compareTo(b[0])<=0){
                    s.append(a[0]).append(" ").append(b[0]);
                    System.out.println(s);
                }else {
                    System.out.println("live数据缺失");
                }
            }
        }/*else if ()
        for (int i=0;i<(a.length<=b.length?a.length:b.length);i++){
            if (b[i].compareTo(a[a.length-1]) >0){
                s.append(a[a.length-1]).append(" ").append(b[i]);
                break;
            }else if(b[i].compareTo(a[i+1]) <=0){
                if ((a[i].compareTo(b[i])<=0)) {
                    s.append(a[i]).append(" ").append(b[i]);
                }
                }
            }
        System.out.print(s);*/
    }
}
