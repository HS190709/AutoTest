package com.hosni;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author hosni
 * @date 2019/08/27 22:32:16
 **/
public class VectorDemo {
    public static void main(String[] args) {
        Vector v=new Vector(1,3);
        System.out.println("size: "+v.size()); //0
        System.out.println("capacity: "+v.capacity()); //1
        v.addElement(new Integer(0));
        v.addElement(new Integer(1));
        v.addElement(new Double(6.08));
        System.out.println("capacity: "+v.capacity());  //4
        System.out.println("First Element: "+v.firstElement());
        System.out.println("Last Element: "+v.lastElement());
        Enumeration e=v.elements();
        System.out.println("\nElements in vector:");
        while (e.hasMoreElements())
            System.out.print(e.nextElement()+" ");


    }
}
