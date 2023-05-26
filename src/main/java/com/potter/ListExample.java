package com.potter;

import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Harry");
        linkedList.add("Draco");
        System.out.println(linkedList);
        System.out.println(linkedList.get(1));
        linkedList.add(1, "Neville");
        System.out.println(linkedList);
        System.out.println(linkedList.get(1));
        linkedList.remove(0);
        System.out.println(linkedList);
    }
}
