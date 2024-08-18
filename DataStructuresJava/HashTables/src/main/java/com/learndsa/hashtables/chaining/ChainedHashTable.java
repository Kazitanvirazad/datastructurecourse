package com.learndsa.hashtables.chaining;

import com.learndsa.hashtables.model.Employee;
import com.learndsa.hashtables.model.StoredEmployee;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {
    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashTable() {
        hashtable = new LinkedList[100];
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<>();
        }
    }

    public void put(String key, StoredEmployee employee) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(employee);
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee employee;
        while (iterator.hasNext()) {
            employee = iterator.next();
            if (employee.getKey().equals(key)) {
                return employee.getEmployee();
            }
        }
        return null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee employee = null;
        int index = -1;
        while (iterator.hasNext()) {
            employee = iterator.next();
            index++;
            if (employee.getKey().equals(key)) {
                break;
            }
        }
        if (employee == null) {
            return null;
        } else {
            hashtable[hashedKey].remove(index);
            return employee.getEmployee();
        }
    }

    private int hashKey(String key) {
        if (key.length() != 3) {
            throw new IllegalArgumentException("String must be exactly 3 characters long");
        }
        int hash = (int) key.charAt(0) + (int) key.charAt(1) * 2 + (int) key.charAt(2) * 3;
        return hash % 101;
    }

    public void printHashTable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (!hashtable[i].isEmpty()) {
                ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
                while (iterator.hasNext()) {
                    System.out.print("Position: " + i + " : ");
                    System.out.println(iterator.next().getEmployee());
                }
            }
        }
    }
}
