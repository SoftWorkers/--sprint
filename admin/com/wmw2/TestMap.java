package com.wmw2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {
        public static void main(String[] args) {
            Map countries = new HashMap ();
            countries.put ( "CN" , "中华人民共和国" );
            countries.put ( "RU" , "俄罗斯联邦" );
            countries.put ( "FR" , "法兰西共和国" );
            countries.put ( "US" , "美利坚合众国" );
            Set set = countries.keySet();
            Iterator i = set.iterator();
            while(i.hasNext()){
                Object a = i.next();
                Object b = countries.get(a);
                System.out.println(a);
                System.out.println(b);
            }
        }
}
