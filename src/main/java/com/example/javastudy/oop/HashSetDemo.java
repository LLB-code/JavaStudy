package com.example.javastudy.oop;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");  // 重复的元素不会被添加
        System.out.println(sites);
        System.out.println(sites.contains("Google"));
        sites.remove("Google");
        System.out.println(sites);
        sites.clear();
        System.out.println(sites);
    }
}
