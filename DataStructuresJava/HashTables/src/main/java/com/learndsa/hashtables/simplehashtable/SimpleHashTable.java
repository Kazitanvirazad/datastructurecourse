package com.learndsa.hashtables.simplehashtable;

import com.learndsa.hashtables.model.Employee;

public class SimpleHashTable {
    private Employee[] hashtable;

    public SimpleHashTable() {
        hashtable = new Employee[100];
    }

    private int hashKey(String key) {
        if (key.length() != 3) {
            throw new IllegalArgumentException("String must be exactly 3 characters long");
        }
        int hash = (int) key.charAt(0) + (int) key.charAt(1) * 2 + (int) key.charAt(2) * 3;
        return hash % 101;
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (occupied(hashedKey)) {
            System.out.println("There is already Employee in position " + hashedKey);
        } else {
            hashtable[hashedKey] = employee;
        }
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        Employee employee = hashtable[hashedKey];
        hashtable[hashedKey] = null;
        return employee;
    }

    public void printHashTable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }
}
