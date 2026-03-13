package week2;

import java.util.HashMap;

public class Problem2StudentMarks {

    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Surya", 90);
        marks.put("Alice", 85);
        marks.put("John", 88);

        System.out.println("Student Marks:");
        for (String name : marks.keySet()) {
            System.out.println(name + " : " + marks.get(name));
        }
    }
}