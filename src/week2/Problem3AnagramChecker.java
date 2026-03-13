package week2;

import java.util.HashMap;

public class Problem3AnagramChecker {

    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s1.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c))
                return false;

            map.put(c, map.get(c) - 1);

            if (map.get(c) == 0)
                map.remove(c);
        }

        return map.isEmpty();
    }

    public static void main(String[] args) {

        String word1 = "listen";
        String word2 = "silent";

        if (isAnagram(word1, word2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}