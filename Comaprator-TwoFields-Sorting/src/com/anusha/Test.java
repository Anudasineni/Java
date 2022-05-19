package com.anusha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student obj1 = new Student(27, "Ajay");
        Student obj2 = new Student(34, "Sneha");
        Student obj3 = new Student(27, "Simran");
        Student obj4 = new Student(22, "Ajay");
        Student obj5 = new Student(19, "Ajay");
        Student obj6 = new Student(37, "Sneha");
        List<Student> studentList = new ArrayList<>();
        studentList.add(obj1);
        studentList.add(obj2);
        studentList.add(obj3);
        studentList.add(obj4);
        studentList.add(obj5);
        studentList.add(obj6);

        System.out.println("Sorting by rollNo and name");
        System.out.println("before sorting");

        for (int i = 0; i < studentList.size(); i++)
            System.out.println(studentList.get(i));

        System.out.println("after sorting");
        Collections.sort(studentList, new Student.CustomSorting());

        for (int i = 0; i < studentList.size(); i++)
            System.out.println(studentList.get(i));

    }
}
