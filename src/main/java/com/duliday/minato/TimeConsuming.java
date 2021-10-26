package com.duliday.minato;

import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;

/**
 * @author Minato
 * @description 功能描述
 * @create 2021/9/26 11:45
 */
public class TimeConsuming {
    public void calc(String className, String methodName) throws Exception {
        Class cla = Class.forName("com.duliday.minato." + className);
        Instant start = Instant.now();
        Method method = cla.getMethod(methodName);
        method.setAccessible(true);
        method.invoke(cla.getDeclaredConstructor().newInstance());
        Instant end = Instant.now();
        long time = Duration.between(start, end).toMillis();
        System.out.println("运行所需时间为:" + time);
    }
}
