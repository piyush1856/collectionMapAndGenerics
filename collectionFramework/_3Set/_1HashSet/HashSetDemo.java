package collectionFramework._3Set._1HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        //HashSet<Integer> hs = new HashSet<>(1200,0.8f); // not recommended to give load factor and capacity

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(10);
        hs.add(null);
        hs.add(null);

        System.out.println(hs);

        for (Integer i : hs)
        {
            System.out.println(i);
        }

       // NOTE: All the collection classes are mutually inclusive, i.e, we can convert any any collection class to another collection class

        ArrayList<Integer> al = new ArrayList<>();
        //approach 1
        for (Integer i : hs)
        {
            al.add(i);
        }

        //approach 2
        ArrayList<Integer> al2 = new ArrayList<>(hs); //passing in constructor
        System.out.println(al2);


    }
}
