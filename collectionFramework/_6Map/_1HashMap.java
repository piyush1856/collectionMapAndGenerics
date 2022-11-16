package collectionFramework._6Map;

import java.util.HashMap;

public class _1HashMap {
    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();
        System.out.println(hm);//{}
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"three");

        System.out.println(hm);

        hm.put(null,"four"); //one null is allowed as a key
        hm.put(null,"FOUR"); //four will be replaced with FOUR
        hm.put(2,"TWO"); // two will be replaced with TWO
        hm.put(5,null);
        hm.put(6,null); //as a value any number of null be allowed

        System.out.println(hm.size());
        System.out.println(hm);



    }
}
