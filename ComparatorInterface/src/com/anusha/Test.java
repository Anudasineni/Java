package com.anusha;

import com.anusha.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Student student1 = new Student(201, "anusha");
        Student student2 = new Student(121, "john");
        Student student3 = new Student(181, "carl");
        Student student4 = new Student(117, "alies");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        System.out.println("Sorting by rollNo");
        System.out.println("before sorting");

        for (int i = 0; i < studentList.size(); i++)
            System.out.println(studentList.get(i));

        System.out.println("after sorting");
        Collections.sort(studentList, new Student.RollComparator());

        for (int i = 0; i < studentList.size(); i++)
            System.out.println(studentList.get(i));

        System.out.println("Sorting by name ");
        Student.NameComparator comparator = new Student.NameComparator();
        Collections.sort(studentList, comparator);
        System.out.println("after sorting");
        for (int i = 0; i < studentList.size(); i++)
            System.out.println(studentList.get(i));
    }
}


