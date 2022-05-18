package com.anusha;

import java.util.Comparator;

public class Student {
    private int rollNo;
    private String studentName;

    public Student(int rollNo, String studentName) {
        this.rollNo = rollNo;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return
                "rollNo=" + rollNo +
                        ", studentName=" + studentName;
    }
    //sorting by rollNo
    static class RollComparator implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return a.rollNo - b.rollNo;
        }
    }
//sorting by studentName
    public static class NameComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.studentName.compareTo(o2.studentName);
        }
    }
}
