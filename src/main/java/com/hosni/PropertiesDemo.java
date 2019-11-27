package com.hosni;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * @author hosni
 * @date 2019/10/29 21:51:10
 **/
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties relationships =new Properties();//情侣关系
        Set husbands;//老公们
        String husband;//老公
        relationships.put("黄三","鑫鑫");
        relationships.put("鸡鸡","班长");
        relationships.put("金孙","海月");
        relationships.put("伟翔","聪聪");
        husbands=relationships.keySet();
        Iterator iterator=husbands.iterator();
        while(iterator.hasNext()){
            husband=(String) iterator.next();
            System.out.println(husband+"的老婆是"+relationships.getProperty(husband));
        }
        relationships.setProperty("张辉","手");
        System.out.println("张辉的老婆是"+relationships.getProperty("张辉"));
        //System.out.println("张辉的老婆是"+relationships.getProperty("张辉","手"));//不用先set,直接用get（key,value）取不存在的值
    }
}
