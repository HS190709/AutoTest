package com.hosni.autotest.chapterfive;

import org.testng.annotations.Test;

/**
 * @author hosni
 * @date 2019/07/18 21:40:11
 **/
public class ExceptionTest {
    @Test(expectedExceptions = RuntimeException.class)
    public static void runtimeException(){
        int a=3;
        int b=0;
        int c=a/b;
        System.out.println(c);
    }
}
