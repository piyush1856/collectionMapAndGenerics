package collectionFramework._6Map;

import java.util.*;

public class _2ItterateOverMap {

    public static void main(String[] args) {

        Map<Integer,String> hm = new HashMap<>();
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"three");
        hm.put(4,"four");
        hm.put(5,"five");

        System.out.println("Getting all the keys");

        Set<Integer> keys = hm.keySet();
        for(Integer x:keys){
            System.out.println(x);
        }

        System.out.println("=================");


        System.out.println("Getting all the values");
        Collection<String> values= hm.values();
        for(String value:values){
            System.out.println(value);
        }
        List<String> list = new ArrayList<>(values);
        System.out.println(list);

        System.out.println("=================");



        System.out.println("Getting both key and values");

        Set<Map.Entry<Integer,String>> keyValue= hm.entrySet();
        //System.out.println(keyValue);
        for(Map.Entry<Integer,String> me: keyValue){
            System.out.println(me.getKey()+"======>"+me.getValue());
        }














    }
}
