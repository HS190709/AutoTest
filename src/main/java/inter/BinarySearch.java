/*
package inter;

import lombok.Data;

import java.io.IOException;
import java.util.*;

*/
/**
 * @author hosni
 * @date 2019/06/28 19:47:24
 **//*

@Data
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        //int target = 9;
        BinarySearch bs = new BinarySearch();
        try {
            System.out.println("请输入要查找的内容：");
            bs.result(bs.binarySearch(arr, bs.input()), bs.input());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Map<String, Integer> wpl(int a, int b) {

        Map<String, Integer> map = new HashMap<>();

        map.put("jia", a + b);
        map.put("jian", a - b);

        return map;
    }


    //(1+2)/3
    public int dwq(int x, int y, int t) {


        Map<String, Integer> map = wpl(x, y);
        Integer jia = map.get("jia");
        Integer jian = map.get("jian");


        int z = r / t;
        return z;
    }


    public void input() throws IOException {
        int target = 0;
        Scanner scan = new Scanner(System.in);
        //System.out.println("请输入数组：");

        while (!scan.hasNext("end")) {
            if (scan.hasNext()) {
                target = scan.nextInt();
            } else {
                System.out.println("请输入整数！");
                String a = scan.next();
            }


            //3,4,5,6
        }

    }

*/
/*
    public int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (end + start) >>> 1;
            if (target == arr[mid]) {
                return 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }
*//*


    public void result(int result, int target) {
        if (result == 1) {
            System.out.println("该数组包含" + target);
        } else {
            System.out.println("数组中找不到" + target);
        }
    }
}
*/
