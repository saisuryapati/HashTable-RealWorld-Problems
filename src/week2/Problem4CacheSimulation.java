package week2;

import java.util.HashMap;

public class Problem4CacheSimulation {

    public static void main(String[] args) {

        HashMap<Integer, String> cache = new HashMap<>();

        cache.put(1, "Page1");
        cache.put(2, "Page2");
        cache.put(3, "Page3");

        System.out.println("Cache Contents:");

        for (Integer key : cache.keySet()) {
            System.out.println("Key: " + key + " Value: " + cache.get(key));
        }
    }
}