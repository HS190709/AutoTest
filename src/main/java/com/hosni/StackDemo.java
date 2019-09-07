package com.hosni;

import javax.xml.bind.SchemaOutputResolver;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author hosni
 * @date 2019/09/02 22:33:18
 **/
public class StackDemo {
    public static void main(String[] args) {
        Stack<Double> st = new Stack<>();
        System.out.println("stack:" + st);
        showPush(st, 32.6);
        showPush(st, 66.3);
        showPush(st, 99.2);
        showPop(st);
        showPop(st);
        showPop(st);
        try {
            showPop(st);
        } catch (EmptyStackException e) {
            System.out.println("栈为空");
        }
    }

    static void showPop(Stack<Double> st) {
        Double a = st.pop();
        System.out.println("put-->" + a);
        System.out.println("stack:" + st);
    }

    static void showPush(Stack<Double> st, double a) {
        st.push(a);
        System.out.println("push("+a+")");
        System.out.println(st);
    }
}
