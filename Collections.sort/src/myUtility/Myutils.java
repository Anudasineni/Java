package myUtility;

import java.util.ArrayList;

public class Myutils {

//to avoid duplicate code,we created class with a methods.we can use this method when we want to iterate over the list.

    public static<T> void iterateList(ArrayList<T> List) {
        for (T temp : List) {
            System.out.println(temp);
        }
    }
    /*public static void iterateStringList(ArrayList<String > stringList) {
        for (String temp : stringList) {
            System.out.println(temp);
        }
    }
        public static void iterateIntegerList (ArrayList < Integer > integerList) {
            for (int temp : integerList) {
                System.out.println(temp);
            }
        }*/
    }