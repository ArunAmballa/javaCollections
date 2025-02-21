package ArrayList;

import java.util.*;

public class ArrayListBasics {

    public static void main(String args[]){

        System.out.println("Array List Methods");
        System.out.println("_______________________");


        List<Integer> marks=new ArrayList<>();
        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.add(40);

        for(Integer mark:marks){
            System.out.println(mark);
        }

        System.out.println("Element at Zero Index "+marks.get(0));
        System.out.println("Size of Array "+marks.size());
        System.out.println("Index of a Number 20 "+marks.indexOf(20));
        System.out.println("Checking if element exists "+marks.contains(40));
        System.out.println("Removing an Element "+marks.remove(0));
        System.out.println(marks);
        System.out.println("Check if Array is Empty "+marks.isEmpty());
        System.out.println("Removing an Element Based on Value "+marks.remove(Integer.valueOf(10)));
        marks.set(0,1000);
        marks.clear();
        System.out.println(marks);




        

    }
}
