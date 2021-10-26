package com.duliday.minato;

import org.testng.annotations.Test;

/**
 * @author Minato
 * @description 功能描述
 * @create 2021/9/24 18:26
 */
@Test
public class TestAverageScore {
    AverageScore averageScore=new AverageScore();
    public void test(){
        if (Math.abs(averageScore.calc()-77.733333)<0.000001){
            System.out.println("测试成功");
        }else{
            System.out.println("测试失败");
        }
    }
    public void test1(){
        if (Math.abs(averageScore.calc1()-77.733333)<0.000001){
            System.out.println("测试成功");
        }else{
            System.out.println("测试失败");
        }
    }
}
