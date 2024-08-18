package com.learndsa.hashtables.simplehashtable;

import com.learndsa.hashtables.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Employee kazi = new Employee("100", "Kazi Tanvir", "Azad");
        Employee jumu = new Employee("101", "Tabasum", "Sultana");
        Employee bruce = new Employee("102", "Bruce", "Wayne");
        Employee kent = new Employee("103", "Clark", "Kent");
        Employee peter = new Employee("104", "Peter", "parker");

        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.add(kazi);
        linkedList.add(jumu);
        linkedList.add(bruce);
        linkedList.add(jumu);
        linkedList.add(kent);
        linkedList.add(kazi);
        linkedList.add(peter);
        linkedList.add(peter);

        linkedList.forEach(System.out::println);

        Map<String, Employee> employeeMap = new HashMap<>();
        List<Employee> removedEmps = new ArrayList<>();

        for (int i = 0; i < linkedList.size(); i++) {
            Employee employee = linkedList.get(i);
            if (employeeMap.containsKey(employee.getId())) {
                removedEmps.add(employee);
            } else {
                employeeMap.put(employee.getId(), employee);
            }
        }

        removedEmps.forEach(linkedList::remove);
        System.out.println("=======================================");
        linkedList.forEach(System.out::println);
    }
}
