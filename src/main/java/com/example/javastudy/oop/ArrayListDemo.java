package com.example.javastudy.oop;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("1");
        sites.add("nice");
        sites.add("fine");
        System.out.println(sites);
        Collections.sort(sites);
        System.out.println(sites);
        System.out.println(sites.size());
        sites.set(2,"fine2");
        System.out.println(sites.get(1));
        System.out.println(sites.get(2));
        sites.remove("fine2");
        System.out.println(sites);
    }
}
