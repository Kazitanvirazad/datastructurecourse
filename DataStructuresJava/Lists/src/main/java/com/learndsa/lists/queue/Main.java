package com.learndsa.lists.queue;

import com.learndsa.lists.model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee kazi = new Employee("100", "Kazi Tanvir", "Azad");
        Employee jumu = new Employee("101", "Tabasum", "Sultana");
        Employee bruce = new Employee("102", "Bruce", "Wayne");
        Employee kent = new Employee("103", "Clark", "Kent");
        Employee peter = new Employee("104", "Peter", "parker");

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(kazi);
        queue.add(jumu);
        queue.add(bruce);
        queue.add(kent);
        queue.add(peter);

        queue.printQueue();
        System.out.println("===============================");
        System.out.println(queue.remove());
        System.out.println("===============================");
        queue.printQueue();
        System.out.println("===============================");
        System.out.println(queue.remove());
        System.out.println("===============================");
        queue.printQueue();
        System.out.println("===============================");
        System.out.println(queue.peek());
    }
}
