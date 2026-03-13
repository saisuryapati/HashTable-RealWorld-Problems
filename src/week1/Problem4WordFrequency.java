package week1;

import java.util.HashMap;

public class Problem4WordFrequency {

    public static void main(String[] args) {

        String sentence = "java is good java is powerful";

        String words[] = sentence.split(" ");

        HashMap<String,Integer> map = new HashMap<>();

        for(String w : words)
            map.put(w,map.getOrDefault(w,0)+1);

        System.out.println(map);
    }
}