package test;

import java.util.*;

/**
 * @Author: hs
 * @Date: 2019/3/1 2:23
 */
public class Lottery {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        System.out.println("彩票号码为：" + lottery.toStringb(lottery.getDifferentNumber(6, 32)));
    }

    public Set<Integer> getDifferentNumber(int m, int n) {
        int num = 0;
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        /**for*/
        for (int i=0;i<m;){
            num = random.nextInt(n);
            if (set.add(num)){
                i++;
            }
        }
        /**while*/
       /* int count = 0;
        while (count < m) {
            num = random.nextInt(n);
            if(set.add(num)){
                count++;
            }*/
            /*if (!list.contains(num)) {
                list.add(num);
                count++;
            }
        }*/
        return set;
    }

    public String toStringb(Collection<Integer> str) {
        StringBuilder stringBuilder = new StringBuilder();
        /**迭代器*/
        Iterator iterator = str.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next()).append(",").append(" ");
        }
        if (stringBuilder.length() > 2) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        /**for循环*/
        /*for (int i=0;i<str.size();i++){
            if (i == str.size() - 1) {
                stringBuilder.append(str.get(i));
            } else {
                stringBuilder.append(str.get(i)).append(",").append(" ");
            }
        }*/
        /**while循环*/
        /*int count = 0;
        while (count < str.size()) {
            if (count == str.size() - 1) {
                stringBuilder.append(str.get(count));
            } else {
                stringBuilder.append(str.get(count)).append(",").append(" ");
            }
            count++;
        }*/
        return stringBuilder.toString();
    }
    /** String.join方法 */
    /*public static void main(String[] args) {
        Lottery lottery = new Lottery();
        System.out.println("彩票号码为：" + 0.join(" ", lottery.getDifferentNumber(6, 32)));
    }

    public List<String> getDifferentNumber(int m, int n) {
        int num = 0;
        int count = 0;
        List<String> list = new ArrayList<>();
        Random random = new Random();
        while (count < m) {
            num = random.nextInt(n);
            if (!list.contains(num))
                list.add(num + " ");
            count++;
        }
        return list;
    }*/
}