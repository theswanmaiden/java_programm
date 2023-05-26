package com.potter;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Harry");
        set.add("Ron");
        set.add("Draco");
        set.add("Sirius");
        set.add("Sirius");
        System.out.println(set);
        set.add(null);
        System.out.println(set);
        set.remove("Ron");
        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Ron"));
        System.out.println(set.contains("Sirius"));
        System.out.println("");

        for (String s : set){
            System.out.println(s);
        }


    }
}
