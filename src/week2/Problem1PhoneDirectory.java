package week2;

import java.util.HashMap;

public class Problem1PhoneDirectory {

    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Surya", "9876543210");
        phoneBook.put("Alice", "9123456789");
        phoneBook.put("John", "9988776655");

        String name = "Surya";

        if (phoneBook.containsKey(name))
            System.out.println(name + "'s number: " + phoneBook.get(name));
        else
            System.out.println("Contact not found");
    }
}