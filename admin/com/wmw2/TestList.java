package com.wmw2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestList {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList <> ();
        list.add(3);
        list.add(8);
        list.add(9);
        list.add(20);
        list.add(80);
        list.add(30);
        list.add(45);
        list.add(6);
        list.add(15);

        int a = 0;
        for (int i = 0; i < list.size(); i++) {
            a = list.get(i) + a;
        }

        Collections.sort(list);
        System.out.println("正序");
        System.out.println(list);
        System.out.println("逆序");
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("最大值");
        System.out.println(list.getLast());
        System.out.println("最小值");
        System.out.println(list.getFirst());
        System.out.println("平均值");
        System.out.println(a/list.size());
    }
}
