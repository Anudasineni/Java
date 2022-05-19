package com.anusha;
import  myUtility.Myutils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static myUtility.Myutils.iterateList;


public class IntegerSortingDemo {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(8);
        integerList.add(6);
        integerList.add(15);
        integerList.add(7);
        integerList.add(1);
        System.out.println("before sorting");
        System.out.println(integerList);
        for (int temp : integerList) {
            System.out.println(temp);
        }
        Collections.sort(integerList);
        iterateList(integerList);
    }




}


