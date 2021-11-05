
package com.company;


import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String[] array = {"Ольга", "Алексей", "Иван", "Петр", "Алексей", "Иван", "Петр", "Алексей", "Алексей", "Иван", "Петр", "Алексей", "Иван", "Петр"};
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String name : array) {
            if (hashMap.get(name) == null) {
                hashMap.put(name, 1);
            } else {
                hashMap.put(name, hashMap.get(name) + 1);
            }
        }
        System.out.println(hashMap);

        Phonebook phonebook = new Phonebook();
        phonebook.add("olga", " 4545634131");
        phonebook.add("Igor", " 4545634132");
        phonebook.add("Vasyl", " 4545634133");
        phonebook.add("olga", " 4545634134");
        phonebook.add("Igor", " 4545634135");
        phonebook.add("olga", " 4545634136");
        phonebook.add("Igor", " 4545634137");
        phonebook.add("Igor", " 4545634138");

        phonebook.get("olga");
        phonebook.get("Igor");
        phonebook.get("Vasyl");

    }
}