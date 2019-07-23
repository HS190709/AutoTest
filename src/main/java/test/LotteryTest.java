package test;

import java.util.*;

/**
 * @author hs
 * @date 2019年2月2日, 下午 05:12:24
 */
public class LotteryTest {
    /**少了一个*/
    public static void main(String[] args) {
        LotteryTest lottery = new LotteryTest();
        System.out.println("彩票号码为：" + lottery.toString(lottery.getDifferentNumber(6, 32)));
    }

    public List<Integer> getDifferentNumber(int m, int n) {
        int num = 0;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        while (count < m) {
            num = random.nextInt(n);
            if (!list.contains(num))
                list.add(num);
            count++;
        }
        return list;
    }

    public String toString(List<Integer> str) {
        StringBuilder stringBuilder = new StringBuilder();
        //Iterator iterator=str.iterator();
        int count = 0;
        while (count < str.size()) {
            if (count == str.size() - 1) {
                stringBuilder.append(str.get(count));
            } else {
                stringBuilder.append(str.get(count)).append(",").append(" ");
            }
            count++;
        }
        return stringBuilder.toString();
    }
    /**多个字符串*/
   /* public static void main(String[] args) {
        LotteryTest lottery=new LotteryTest();
        //System.out.println("彩票号码为："+lottery.getDirrNu(6,32));
        System.out.println("彩票号码为："+lottery.tostrb(lottery.getDirrNu(6,32)));
    }

    public List<Integer> getDirrNu(int m, int n) {
        List<Integer> list = new ArrayList();
        Random random = new Random();
        int num = 0;
        int count = 0;
        while (count < m) {
            num = random.nextInt(n);
            if (!list.contains(num)) {
                list.add(num);
                count++;
            }
        }
        return list;
    }
    public String tostrb(List<Integer> strb){
        StringBuilder stringBuilder= new StringBuilder();
        Iterator<Integer> iterator=strb.iterator();
       while (iterator.hasNext()){
            stringBuilder.append(iterator.next()).append(",").append(" ");
        }
        return stringBuilder.toString();
    }*/
    /**竺华骏*/
/*
    public static void main(String[] args) {
        LotteryTest lottery=new LotteryTest();
        //System.out.println("彩票号码为："+lottery.getDirrNu(6,32));
//        System.out.println("彩票号码为："+lottery.tostrb(lottery.getDirrNu(6,32)));
        System.out.println("彩票号码为："+String.join(", ",lottery.getDirrNu(6,32)));
    }

    public List<String> getDirrNu(int m, int n) {
        List<String> list = new ArrayList();
        Random random = new Random();
        int num = 0;
        int count = 0;
        while (count < m) {
            num = random.nextInt(n);
            if (!list.contains(num)) {
                list.add(num+"");
                count++;
            }
        }
        return list;
    }
    public String tostrb(List<Integer> strb){
        StringBuilder stringBuilder= new StringBuilder();
        Iterator<Integer> iterator=strb.iterator();
        while (iterator.hasNext()){
            stringBuilder.append(iterator.next()).append(",").append(" ");
            int a=0;
            while (a <strb.size()){
                stringBuilder.append(",").append(" ");
            }
        }
       /*int a=0;
        while (a <strb.size()){
            stringBuilder.append(",").append(" ");
        }
        return stringBuilder.toString();
    }*/
   /* public static void main(String[] args){
        LotteryTest lottery=new LotteryTest();
        System.out.println("彩票号码为："+toStr(lottery.getDifferentNumber(6,32)));

        List<Integer> list = lottery.getDifferentNumber(6,32);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

    }
    public ArrayList getDifferentNumber (int m,int n){
        int num=0;
        List list=new ArrayList();
        list = new LinkedList()
        list.add("string");
        Random random=new Random();
        boolean[] bool=new boolean[n];
        for (int i=0;i<m;++i){
            do{
                num=random.nextInt(n);
            }while (bool[num]);{
                bool[num]=true;
                list.add(num);
            }
        }
        return list;
    }

   private static String toStr(List<Integer> nums) {
        StringBuilder sbuilder = new StringBuilder();
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            sbuilder.append(iterator.next()).append(",").append(" ");
        }
        return sbuilder.toString();
    }*/
    /**简单的随机数*/
    /*public static void main(String[] args) {
        int a,b,j;
        Random random=new Random();
        System.out.print("彩票号码为：");
        for (int i=0;i<6;++i){
            a=random.nextInt(32);
            b=a;
            *//*if (j!=a){
                System.out.print(a+" ");
            } else{
                j=a;
                break;
            }*//*
            System.out.print(a+" ");
        }
    }*/
}
