package collectionFramework._1CollectionInterface.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        Iterator<Integer> itr = al.iterator(); //iterator() belongs to Iterator Interface
        //System.out.println(itr.getClass().getName());
        while (itr.hasNext()){  //will move cursor from BFR to record area and will return true and stops at ALR area and return false
            System.out.println(itr.next());
        }









    }



}
