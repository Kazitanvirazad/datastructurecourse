package com.learndsa.hashtables.simplehashtable;

import com.learndsa.hashtables.model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee kazi = new Employee("100", "Kazi Tanvir", "Azad");
        Employee jumu = new Employee("101", "Tabasum", "Sultana");
        Employee bruce = new Employee("102", "Bruce", "Wayne");
        Employee kent = new Employee("103", "Clark", "Kent");
        Employee peter = new Employee("104", "Peter", "parker");

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put(kazi.getId(), kazi);
        hashTable.put(jumu.getId(), jumu);
        hashTable.put(bruce.getId(), bruce);
        hashTable.put(kent.getId(), kent);
        hashTable.put(peter.getId(), peter);

        hashTable.printHashTable();
        System.out.println("=======================================");
        System.out.println(hashTable.get("102"));
        System.out.println("=======================================");
        System.out.println(hashTable.get("101"));
        hashTable.put("105", new Employee("105", "Harvey", "Dent"));
        System.out.println("=======================================");
        System.out.println(hashTable.get("105"));
        System.out.println("=======================================");
        System.out.println(hashTable.remove("103"));
        System.out.println(hashTable.remove("104"));
        System.out.println("=======================================");
        hashTable.printHashTable();
    }
}
