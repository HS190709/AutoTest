package test;

import java.util.Scanner;

/**
 * @author hosni
 * @date 2019/05/08 15:21:01
 **/
public class TestDemo6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您的分数：");
        int a=scanner.nextInt();
        printGrade(a);
    }
    public static void printGrade(int grade){
        char score;
        switch (grade/10){
            case 10:
                score='A';
                System.out.println("等级为"+score);
                break;
            default:
                System.out.println("不是A");
        }
    }
}
