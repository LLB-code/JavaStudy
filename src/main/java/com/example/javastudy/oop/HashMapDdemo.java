package com.example.javastudy.oop;
import java.util.HashMap;

public class HashMapDdemo {
    public static void main(String[] args) {
        HashMap<Integer,String> Sites = new HashMap<Integer,String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites);
        System.out.println(Sites.get(0));
        HashMap<String, String> Sites2 = new HashMap<String, String>();
        // 添加键值对
        Sites2.put("one", "Google");
        Sites2.put("two", "Runoob");
        Sites2.put("three", "Taobao");
        Sites2.put("four", "Zhihu");
        System.out.println(Sites2);

    }
}
