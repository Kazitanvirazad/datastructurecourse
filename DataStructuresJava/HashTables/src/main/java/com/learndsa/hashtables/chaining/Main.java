package com.learndsa.hashtables.chaining;

import com.learndsa.hashtables.model.Employee;
import com.learndsa.hashtables.model.StoredEmployee;

public class Main {
    public static void main(String[] args) {
        Employee kazi = new Employee("100", "Kazi Tanvir", "Azad");
        Employee jumu = new Employee("101", "Tabasum", "Sultana");
        Employee bruce = new Employee("102", "Bruce", "Wayne");
        Employee kent = new Employee("103", "Clark", "Kent");
        Employee peter = new Employee("104", "Peter", "parker");

        ChainedHashTable hashTable = new ChainedHashTable();
        hashTable.put(kazi.getId(), new StoredEmployee(kazi.getId(), kazi));
        hashTable.put(jumu.getId(), new StoredEmployee(jumu.getId(), jumu));
        hashTable.put(bruce.getId(), new StoredEmployee(bruce.getId(), bruce));
        hashTable.put(kent.getId(), new StoredEmployee(kent.getId(), kent));
        hashTable.put(peter.getId(), new StoredEmployee(peter.getId(), peter));

        hashTable.printHashTable();
        System.out.println("=======================================");
        System.out.println(hashTable.get(bruce.getId()));
        System.out.println("=======================================");
        System.out.println(hashTable.remove(kent.getId()));
        System.out.println("=======================================");
        hashTable.printHashTable();
    }
}
