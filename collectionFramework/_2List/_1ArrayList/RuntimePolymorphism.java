package collectionFramework._2List._1ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RuntimePolymorphism {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();  //variable is locked with arrayList only  --> too specific

        List<Integer> list =  new ArrayList<>();   //most recommended -> can change the implementation (vector, stack) -> much more
                                                 // polymorphic way is achieved
                                                // only allowed to call list method not arrayList method


        Collection<Integer> col = new ArrayList<>(); // only allowed to call collection interface method

        Object obj = new ArrayList<>(); // least recommended --> too generic





    }
}
