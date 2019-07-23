package test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hosni
 * @date 2019/06/29 16:51:24
 **/
public class Search {
    public static void main(String[] args) {
        Search bs = new Search();
        try {
            ListAndTarget input = bs.input();
            ArrayList<Integer> list = input.getList();
            int target = input.getTarget();
            int result = bs.binarySearch(list, target);
            bs.result(result, target);
            input.printList();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public ListAndTarget input() {
        Scanner scan = null;
        ListAndTarget listAndTarget = null;
        try {
            ArrayList<Integer> list = new ArrayList<>();
            int target = 0;
            int count = 0;
            System.out.println("请输入数组,最后输入end结束！");
            scan = new Scanner(System.in);
            int x = 0;
            while (!scan.hasNext("end") || count == 0) {
                if (scan.hasNextInt()) {
                    list.add(scan.nextInt());
                    count = 1;
                } else if (count == 0 && scan.hasNext("end")) {
                    System.out.println("未输入数组，请继续输入：");
                    scan.next();
                } else {
                    System.out.println("请输入整数！");
                    scan.next();
                }
            }
            scan.next();
            System.out.println("请输入要查找的内容，输入end结束！");
            count = 0;
            while (!scan.hasNext("end") || count == 0) {
                if (scan.hasNextInt()) {
                    target = scan.nextInt();
                    count = 1;
                } else if (count == 0 && scan.hasNext("end")) {
                    System.out.println("没输入要查找的内容，请继续输入：");
                    scan.next();
                } else {
                    System.out.println("请输入整数！");
                    scan.next();
                }
            }
            listAndTarget = new ListAndTarget(list, target);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scan != null) {
                try {
                    scan.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return listAndTarget;
    }

    public int binarySearch(ArrayList<Integer> list, int target) {
        int start = 0;
        int end = list.size() - 1;
        while (start <= end) {
            int mid = (end + start) >>> 1;
            if (target == list.get(mid)) {
                return 1;
            } else if (target > list.get(mid)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }


    public void result(int result, int target) {
        if (result == 1) {
            System.out.println("该数组包含" + target);
        } else {
            System.out.println("数组中找不到" + target);
        }
    }

    class ListAndTarget {
        private ArrayList<Integer> list;
        private int target;

        public void printList() {
            for (int i : list) {
                System.out.print(i + " ");
            }
        }

        public ArrayList getList() {
            list.sort(Integer::compareTo);
            return list;
        }

        public int getTarget() {
            return target;
        }

        public void setList(ArrayList<Integer> list) {
            this.list = list;
        }

        public void setTarget(int target) {
            this.target = target;
        }

        public ListAndTarget(ArrayList<Integer> list, int target) {
            this.list = list;
            this.target = target;
        }

        public ListAndTarget() {
        }
    }
}