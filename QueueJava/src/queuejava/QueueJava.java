/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuejava;

import java.util.*;

/**
 *
 * @author ardin
 */
public class QueueJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee janeJones = new Employee("ardi", "naufan", 123);
        Employee johnDoe = new Employee("lala", "lili", 4567);
        Employee marySmith = new Employee("lulu", "lele", 22);
        Employee mikeWilson = new Employee("mama", "mia", 3245);
        Employee billEnd = new Employee("Bill", "gunawan", 78);

        Queue<Employee> queue = new PriorityQueue<Employee>();
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);
        System.out.println("First init Queue");
        for (Employee employee : queue) {
            System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
        }
        System.out.println("\n");
        System.out.println("Head Of Queue");
        System.out.println(queue.element() + "--->> Using Element Method");
        System.out.println(queue.peek() + "--->> Using Peek Method");

        System.out.println("\n");
        System.out.println("Remove Head Of Queue");
        System.out.println(queue.remove(queue.element()));
        for (Employee employee : queue) {
            System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
        }

        System.out.println("\n");
        System.out.println("Head Of Queue After Remove");
        System.out.println(queue.element() + "--->> Using Element Method");
        System.out.println(queue.peek() + "--->> Using Peek Method");

        System.out.println("\n");
        System.out.println("Add data to Queue via offer");
        System.out.println(queue.offer(marySmith));
        for (Employee employee : queue) {
            System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
        }

        System.out.println("\n");
        System.out.println("Get all data Queue");
        Iterator<Employee> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

    }

}
