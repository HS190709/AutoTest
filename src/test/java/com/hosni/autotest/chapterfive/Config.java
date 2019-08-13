package com.hosni.autotest.chapterfive;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * @author hosni
 * @date 2019/07/12 19:53:33
 **/
@Test
public class Config {
    @BeforeSuite
    public static void BeforeSuite() {
        System.out.println("BeforeSuite");
    }

    @AfterSuite
    public static void AfterSuite() {
        System.out.println("AfterSuite");
    }

}
