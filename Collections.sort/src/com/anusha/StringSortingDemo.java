package com.anusha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static myUtility.Myutils.iterateList;

public class StringSortingDemo {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("anusha");
        stringList.add("john");
        stringList.add("alies");
        stringList.add("carl");
        stringList.add("mark");
        System.out.println("before sorting");
        iterateList(stringList);

        Collections.sort(stringList);
        System.out.println("after sorting");
        iterateList(stringList);
    }

    }



