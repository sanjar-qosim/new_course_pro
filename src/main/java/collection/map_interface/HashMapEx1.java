package collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {

    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();

        map1.put(1000, "Zaur Tregulov");
        map1.put(3568, "Ivan Ivanov");
        map1.put(6578, "Katya Sidorova");
        map1.put(15879, "Nikolay Petrov");
        map1.put(98745, "Nikolay Petrov");
        map1.put(null, null);
        map1.putIfAbsent(15879, "Nikolay Petrov");

        System.out.println(map1);

        System.out.println(map1.get(1000));

        map1.remove(15879);
        System.out.println(map1);

        System.out.println(map1.containsValue("Katya Sidorova"));
        System.out.println(map1.containsKey(6578));

        System.out.println(map1.keySet());

        Map<String, String> map2 = new HashMap<>();
        map2.put("Sasha", "Beliy");
        map2.put("Misha", "Umniy");

    }
}
