package com.wmw2;

import java.util.ArrayList;
import java.util.Iterator;

public class Dog {
    public void List(){
        ArrayList list = new ArrayList();
        list.add("柯基");
        list.add("哈士奇");
        list.add("法斗");
        list.add("柴犬");
        System.out.println(list);
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void foreach() {
        ArrayList list = new ArrayList();
        list.add("柯基");
        list.add("哈士奇");
        list.add("法斗");
        list.add("柴犬");
        for (Object i : list) {
            System.out.println(i);
        }
    }
}
