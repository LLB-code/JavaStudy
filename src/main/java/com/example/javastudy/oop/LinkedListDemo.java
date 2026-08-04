package com.example.javastudy.oop;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
        sites.addFirst("head");
        sites.addLast("tail");
        System.out.println(sites);
        sites.removeLast();
        System.out.println(sites.getFirst());
    }
}
