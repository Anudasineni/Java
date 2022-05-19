import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("do epic shit", "warkado", 2018));
        bookList.add(new Book("atomic habits", "john", 1965));
        bookList.add(new Book("who will win", "carl", 1945));
        bookList.add(new Book("secret", "bonde", 2017));
        bookList.add(new Book("panchatantra", "mark", 2011));
        System.out.println("before sorting");
        Myutility.iterateList(bookList);
        Collections.sort(bookList);
        System.out.println("after sorting");
        Myutility.iterateList(bookList);
    }
}
