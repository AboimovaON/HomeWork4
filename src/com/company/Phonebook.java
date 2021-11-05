package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {

        HashMap<String, ArrayList<String>> namesAndNumbers;

        public Phonebook(){
            namesAndNumbers = new HashMap<>();
        }
        public void add(String name, String number){
            ArrayList<String> newNumber = new ArrayList<>();
            if (namesAndNumbers.get(name) == null) {
                newNumber.add(number);
                namesAndNumbers.put(name, newNumber);
            }
            else {namesAndNumbers.get(name).add(number);
            }

        }
        public void get(String name){
            System.out.println(name + namesAndNumbers.get(name));

        }
}