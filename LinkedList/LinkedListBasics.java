package LinkedList;

import java.util.LinkedList;

public class LinkedListBasics {
    
    public static void main(String args[]){

        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(450);
        list.addFirst(100);
        list.addLast(1000);
        list.add(0,3000);
    
        System.out.println("Linked List "+list);
        System.out.println("Size of LinkedList "+list.size());
        System.out.println("Check if Linked List is Empty "+list.isEmpty());

        list.remove();
        System.out.println("Linked List "+list);

        list.removeFirst();
        list.removeLast();
        list.remove(0);
        list.remove(Integer.valueOf(40));

        System.out.println("Linked List "+list);

        System.out.println(list.get(0));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.set(2,45);

        System.out.println("Linked List"+list);


        LinkedList<Integer> list2=new LinkedList<>();
        list2.add(1000);
        list2.add(2000);
        list2.add(3000);

        System.out.println("Linked List 2 "+list2);
        
        list.addAll(list2);

        System.out.println("New Linked List "+list);



        
    }
}
