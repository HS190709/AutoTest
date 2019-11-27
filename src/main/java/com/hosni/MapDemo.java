package com.hosni;

import java.util.*;

/**
 * @author hosni
 * @date 2019/09/16 11:43:55
 **/
public class MapDemo {
    public static void main(String[] args) {


        /**HashMap*/
        Map m=new HashMap();
        Set name;
        String str;
        Double m1;
        m.put("Zara", 3434.34);
        m.put("Mahnaz", 123.22);
        m.put("Ayan", 1378.00);
        m.put("Daisy", 99.22);
        m.put("Qadir", -19.08);
        name=m.keySet();

        Iterator iterator = name.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            }
        System.out.println();
        m1= (Double) m.get("Zara");
        m.put("Zara", m1 + 1000);
        System.out.println("Zara's new balance: " +m.get("Zara"));

        /**Hashtable*/
        /*Hashtable m=new Hashtable();
        Enumeration name;
        String str;
        Double m1;
        m.put("Zara", 3434.34);
        m.put("Mahnaz", 123.22);
        m.put("Ayan", 1378.00);
        m.put("Daisy", 99.22);
        m.put("Qadir", -19.08);
        name=m.keys();
        while (name.hasMoreElements()){
            str=(String) name.nextElement();
            System.out.println(str+":"+m.get(str));
        }
        System.out.println();
        m1= (Double) m.get("Zara");
        m.put("Zara", m1 + 1000);
        System.out.println("Zara's new balance: " +m.get("Zara"));*/

        /*System.out.println(m.size());
        System.out.println(" Map Elements");
        System.out.print("\t"+m);*/


    }
}
