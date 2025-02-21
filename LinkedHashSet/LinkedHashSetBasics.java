package LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetBasics {

    public static void main(String args[]){

        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);

        System.out.println("Size of Linked Hash Set"+hs.size());
        System.out.println("Check if Linked Hash Set is Empty "+hs.isEmpty());
        System.out.println("Check if LinkedHash Set contains Elements "+hs.contains(30));
        System.out.println("Linked Hash Set "+hs);
        System.out.println("Remove an Element from hahsSet"+hs.remove(30));
        hs.clear();
        System.out.println("Linked hash Set"+hs);

    }
}
