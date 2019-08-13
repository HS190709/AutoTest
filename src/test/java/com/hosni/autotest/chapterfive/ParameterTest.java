package com.hosni.autotest.chapterfive;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author hosni
 * @date 2019/07/29 21:59:52
 **/
public class ParameterTest {
    @Parameters({"name","age"})
    @Test
    public void parameter(String name,int age){
        System.out.println("\n"+"name="+name+";age="+age);
    }
}
