package collectionFramework._2List._1ArrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        //using Object in generic <Object> is same as not using generics -> NOT recommended
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        //enhanced for loop
        for(int x : al){
            System.out.println(x);
        }

        //System.out.println(al);
        // System.out.println(al.toArray());


        //converting to Object array
        Object[] or= al.toArray();
        for(Object o:or){
            int x= (Integer) o; //downcaste
            System.out.println(x);
        }




    }
}
