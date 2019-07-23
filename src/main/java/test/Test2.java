package test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author hosni
 * @date 2019/06/21 18:12:53
 **/
public  class Test2 {
    public static void main(String[] args) throws Exception {
        Test2 t2 = new Test2();
        t2.getTest1Full();

    }

    public void getTest1Full() throws Exception {
        Class c = Class.forName("test.Test1");
        // Object obj=c.newInstance();
        Field[] fs = c.getDeclaredFields();
        Method[] ms=c.getDeclaredMethods();
        StringBuffer sb = new StringBuffer();
        sb.append(Modifier.toString(c.getModifiers()) + " class " + c.getSimpleName() + "{\n");
        for (Field field : fs) {
            sb.append("\t");
            sb.append(Modifier.toString(field.getModifiers()) + " ");
            sb.append(field.getType().getSimpleName() + " ");
            sb.append(field.getName() + ";\n");
        }
        for (Method method:ms) {
            sb.append("\t");
            sb.append(Modifier.toString(method.getModifiers()) + " ");
            sb.append(method.getReturnType().getSimpleName() + " ");
            sb.append(method.getName() + ";\n");
        }
        sb.append("}");
        System.out.println(sb);
    }
    /*public void getTest1() throws Exception{
        Class c = Class.forName("test.Test1");
        Field fs = c.getDeclaredField("scan");
        StringBuffer sb = new StringBuffer();
        sb.append(Modifier.toString(c.getModifiers()) + " class " + c.getSimpleName() + "{\n");
        sb.append("\t");
        sb.append(Modifier.toString(fs.getModifiers()) + " ");
    }*/
}
