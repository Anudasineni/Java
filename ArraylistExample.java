import java.util.*;

public class ArraylistExample {
    public static void main(String args[])
    {
    /*
    Arraylist is not fixied in size.
    * Duplicates are allowed.
    * Insertion order is preserve.
    * (currentcapacity*3/2)+1
    * ArrayList is the best choice if you want perform retreival operations.
    * ArrayList is not recommended when you want perform insert and delete operations at the middel of an array.

     */
//ArrayList with homegenous elements
    ArrayList<String> arr=new ArrayList<String>();
    arr.add("anu");
    arr.add("sweety");
    arr.add("pinky");
    arr.add("chinnu");
    System.out.println(arr);//[anu,sweety,pinky,chinnu]
    arr.remove(0);
    System.out.println(arr);//[sweety,pinky,chinnu]
    arr.add(0,"anusha");//adding at specific position
    System.out.println(arr);//[anusha,sweety,pinky,chinnu]

    //updating the element at given index
    arr.set(3,"bublu");
    System.out.println(arr);//[anusha,sweety,pinky,bublu]
    /* collections class:it is a utility class which provides some methods like sorting and searching.these methods
    can be used on collection interfaces.This class is part of java.util package.
     */

        Collections.sort(arr);
        System.out.println(arr);//[anusha,bublu,sweety,pinky]
        for (String s:arr) {
            System.out.println(s);
        }
        System.out.println(arr.size());
        System.out.println(arr.contains("anusha"));

     // Accessing Element at given index
        System.out.println(arr.get(0));//anusha

        //Collections.reverse(arr);
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);//[sweety, pinky, bublu, anusha]

 //intializing ArrayList without size and can add different type of objects.
 ArrayList a=new ArrayList() ;
        a.add("apple");
        a.add(1);
        a.add(15);
        a.add("pineapple");
        a.add("muskmelon");
        a.add("watermelon");
        a.remove(1);
        //iterating using foreach
        for(Object s:a){
            System.out.println(s);
        }
//intializing array with size
        ArrayList a1=new ArrayList( 10);
        a1.add(1);
        a1.add(11);
        a1.add("bird");
        a1.add("loin");
        a1.add(1);
        a1.add(11);
        a1.add("bird");
        a1.add("loin");a1.add(1);
        a1.add(11);
        a1.add("bird");
        a1.add("loin");
        a1.add(null);
        System.out.println(a1); //though we fixed array size equals to 10,it doesnot throw  ArrayIndexboundexception.
        //  ArrayList is grows it size to accomdate new values and shriks when elements are deleted.

        System.out.println(a1.contains("bird"));

//indexOf() returns index of first occurrence of an element in an ArrayList
        System.out.println(a1.indexOf("loin")); //it prints 3

//lastIndexOf() returns index of last occurrence of an element
        System.out.println(a1.lastIndexOf("loin")); //it prints 11


        ArrayList<String> a11=new ArrayList<String>();
        a11.add("hello");
        a11.add("how");
        a11.add("are");
        a11.add("you");
        a11.add("fine");
        ArrayList<String>a12=new ArrayList<String>();
        a12.add("hello");
        a12.add("iam");
        a12.add("fine");
        a12.add("you");
       a12.add("good");
 //Comparing two ArrayList
       ArrayList<String>a13=new ArrayList<String>();
        for (String temp:a11)
            a13.add(a12.contains(temp) ?"yes":"no");
        System.out.println(a13);//[yes,no,no,yes,yes]

//join two ArrayLists
        ArrayList<String> a14=new ArrayList<>();
        a14.addAll(a11);
        a14.addAll(a12);
        System.out.println(a14);//[hello, how, are, you, fine, hello, iam, fine, you, good]

//join ArrayList at specific index
        ArrayList<String>a15=new ArrayList<>();
        a15.add("apple");
        a15.add("orange");
        a15.add("muskmelon");
        a15.addAll(1,a11);//adding a11 ArrayList at index 1 of a15 ArrayList.
        System.out.println(a15);//[apple,hello,how,are,you,fine,orange,muskmelon]

 //Swapping two elements in ArrayList
        Collections.swap(a12,0,1);
 for(String ele:a12){
     System.out.println(ele);//[iam,hello,fine,you,good]
 }
    }
}
