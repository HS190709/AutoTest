package com.hosni.autotest.chapterfive;

import org.testng.annotations.Test;

/**
 * @author hosni
 * @date 2019/07/18 22:22:22
 **/

public class DependenceTest {
    @Test(dependsOnMethods = {"dependence2"})
    public static void dependence1(){
        System.out.println("这是方法1");
    }
    @Test
    public static void dependence2(){
        System.out.println("这是方法2");
    }
}
