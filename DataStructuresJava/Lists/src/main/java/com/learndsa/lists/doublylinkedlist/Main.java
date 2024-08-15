package com.learndsa.lists.doublylinkedlist;

import com.learndsa.lists.model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee kazi = new Employee("100", "Kazi Tanvir", "Azad");
        Employee jumu = new Employee("101", "Tabasum", "Sultana");
        Employee bruce = new Employee("102", "Bruce", "Wayne");
        Employee kent = new Employee("103", "Clark", "Kent");
        Employee peter = new Employee("104", "Peter", "parker");

        DoublyLinkedList<Employee> linkedList = new DoublyLinkedList<>();
        linkedList.addToFront(kazi);
        linkedList.addToFront(jumu);
        linkedList.addToFront(bruce);
        linkedList.addToFront(kent);

        linkedList.addToEnd(peter);

        linkedList.printList();
        System.out.println("======================");
        System.out.println(linkedList.removeFromFront().getElement());
        System.out.println("======================");
        linkedList.printList();
        System.out.println("======================");
        linkedList.addBefore(new Employee("103", "Clark", "Kent"),
                new Employee("100", "Kazi Tanvir", "Azad"));
        linkedList.printList();
    }
}
