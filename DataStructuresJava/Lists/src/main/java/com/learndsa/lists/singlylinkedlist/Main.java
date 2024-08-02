package com.learndsa.lists.singlylinkedlist;

import com.learndsa.lists.model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee kazi = new Employee("100", "Kazi Tanvir", "Azad");
        Employee jumu = new Employee("101", "Tabasum", "Sultana");
        Employee bruce = new Employee("102", "Bruce", "Wayne");
        Employee kent = new Employee("103", "Clark", "Kent");

        SinglyLinkedList<Employee> linkedList = new SinglyLinkedList<>();

        System.out.println("Is Empty: " + linkedList.isEmpty());

        linkedList.addToFront(kazi);
        linkedList.addToFront(jumu);
        linkedList.addToFront(bruce);
        linkedList.addToFront(kent);

        System.out.println("Is Empty: " + linkedList.isEmpty());

        System.out.println("Size: " + linkedList.getSize());

        linkedList.printList();

        System.out.println("=========REMOVED=========");
        System.out.println(linkedList.removeFromFront().getElement());
        System.out.println("=========REMOVED=========");
        linkedList.printList();
        System.out.println("Size: " + linkedList.getSize());

    }
}
