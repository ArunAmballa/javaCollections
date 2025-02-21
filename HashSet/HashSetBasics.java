package HashSet;

import java.util.HashSet;

public class HashSetBasics {
    

    public static void main(String args[]){
        

        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);

        System.out.println("Hash Set "+hs);
        System.out.println("Check if Hash Set is Empty "+hs.isEmpty());
        System.out.println("Size of hash set "+hs.size());
        System.out.println("Check if Hash Set contains Element "+hs.contains(30));
        System.out.println("Removing an Element from hash set "+hs.remove(40));
        System.out.println("Hash Set "+hs);
        hs.clear();
        System.out.println("Hash Set "+hs);

    }
}
