package com.hosni.autotest.chapterfive;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @author hosni
 * @date 2019/07/29 21:10:07
 **/
public class DataProviderTest {
    @Test(dataProvider = "data")
    public void test0(String name, int age){
        System.out.println("name=" + name + ";age=" + age);
    }
    @DataProvider(name = "data")
    public Object[][] dataProvider(){
        Object[][] o=new Object[][]{{"刘一",100},{"陈二",90}};
        return o;
    }
    @Test(dataProvider = "method")
    public void test1(String name, int age) {
        System.out.println("这是test1的name=" + name + ";age=" + age);
    }

    @Test(dataProvider = "method")
    public void test2(String name, int age) {
        System.out.println("这是test2的name=" + name + ";age=" + age);
    }
    @DataProvider(name = "method")
    public Object[][] dataProvider(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{{"张三", 20}, {"李四", 10}};
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{{"王五", 30}, {"赵六", 40}};
        }
        return result;
    }
}
