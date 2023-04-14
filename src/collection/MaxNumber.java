package collection;

import com.sun.javafx.UnmodifiableArrayList;
import java.util.ArrayList;
import java.util.Collection;
public class MaxNumber {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(12);
        myList.add(45);
        myList.add(89);
        myList.add(56);
        myList.add(34);
        System.out.println(myList);
        int maximum = myList.get(0);
        for (int i = 1; i < myList.size(); i++) {
            if (maximum < myList.get(i))
                maximum = myList.get(i);
        }
        System.out.println("Maximum Number in ArrayList = " + maximum);
        int minimum = myList.get(0);
        for (int i = 1; i > myList.size(); i++) {
            if (minimum > myList.get(i))
                minimum = myList.get(i);
        }
        System.out.println("Minimum Number in ArrayList = " + minimum);
        }
    }








