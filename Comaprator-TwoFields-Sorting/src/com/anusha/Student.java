package com.anusha;

import java.util.Comparator;

public class Student {
    private int rollNo;
    private String studentName;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

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

    public static class CustomSorting implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            //int ageCompare = o1.rollNo - o2.rollNo;
            int ageCompare = o1.getRollNo()- o2.getRollNo();
            //System.out.println(ageCompare);
            //int nameCompare = o1.studentName.compareTo(o2.studentName);

            int nameCompare = o1.getStudentName().compareTo(o2.getStudentName());
            //System.out.println(nameCompare);
            return (nameCompare == 0) ? ageCompare : nameCompare;

        }
    }
}
