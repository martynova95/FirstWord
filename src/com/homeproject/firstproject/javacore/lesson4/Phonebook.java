package com.homeproject.firstproject.javacore.lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private Map<String, List<String>> phonebookHm = new HashMap<>();
    private List<String> phoneHumberList;

    public void add(String surname, String phoneNumber) {
        if (phonebookHm.containsKey(surname)) {
            phoneHumberList = phonebookHm.get(surname);
            phoneHumberList.add(phoneNumber);
            phonebookHm.put(surname, phoneHumberList);
        } else {
            phoneHumberList = new ArrayList<>();
            phoneHumberList.add(phoneNumber);
            phonebookHm.put(surname, phoneHumberList);
        }
    }

    public List<String> get(String surname) {
        return phonebookHm.get(surname);
    }
}
