package com.potter;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Sophie");
        arrayList.add("Harry");
        arrayList.add("Hermione");
        System.out.println(arrayList);
        arrayList.set(1, "Ron");
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Luna");
        arrayList2.add("Ginny");
        arrayList2.addAll(arrayList);
        System.out.println(arrayList2);

    }
}
