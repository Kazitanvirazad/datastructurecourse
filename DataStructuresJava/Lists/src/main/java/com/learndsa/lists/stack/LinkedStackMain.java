package com.learndsa.lists.stack;

import com.learndsa.lists.model.Employee;

public class LinkedStackMain {
    public static void main(String[] args) {
        Employee kazi = new Employee("100", "Kazi Tanvir", "Azad");
        Employee jumu = new Employee("101", "Tabasum", "Sultana");
        Employee bruce = new Employee("102", "Bruce", "Wayne");
        Employee kent = new Employee("103", "Clark", "Kent");
        Employee peter = new Employee("104", "Peter", "parker");

        LinkedStack stack = new LinkedStack();
        stack.push(kazi);
        stack.push(jumu);
        stack.push(bruce);
        stack.push(kent);
        stack.push(peter);

        stack.printStack();
        System.out.println("===============================");

        System.out.println(stack.pop());
        System.out.println("===============================");
        stack.printStack();
        System.out.println("===============================");
        System.out.println(stack.peek());
    }
}
