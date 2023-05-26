package com.potter;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(11, "Harry");
        map.put(12, "Draco");
        map.put(13, "James");
        map.put(14, "Sirius");
        System.out.println(map);
        map.put(15, "Harry");
        System.out.println(map);
        map.put(12, "Remus");
        System.out.println(map);
        map.put(null, "Ron");
        System.out.println(map);
        map.put(16, null);
        System.out.println(map);
        map.putIfAbsent(12, "Severus");
        System.out.println(map.get(12));
        map.remove(11);
        System.out.println(map);
        System.out.println(map.containsValue("Sirius"));
        System.out.println(map.containsValue("Severus"));
        System.out.println(map.keySet());
        System.out.println(map.values());

    }
}
