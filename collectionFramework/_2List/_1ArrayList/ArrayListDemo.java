package collectionFramework._2List._1ArrayList;

import sprint2Day4Live.Student;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();  // Type unsafe collection or ArrayList because anytype of object is added and so while getting the obj from arraylist we have to downcast everytime and know the type of object at each index
        //so use generics : type safe arrayList <String>, <Integer>

        //ArrayList al = new ArrayList(1000); --> A new ArrayList will be formed with the initial capacity 1000 and will increase according to the formula below ...

        System.out.println(al); //[] --> since in Collection class all the toString methods are overridden it will not print the address/hashcode
        System.out.println(al.size()); // 0 but initial default capacity is 10


        al.add(1);
        al.add('a');
        al.add(new Student("Piyush"));
        al.add(null);
        al.add(null);
        al.add(1); // duplicate addition
        System.out.println(al); //[] --> since in Collection class all the toString methods are overridden it will not print the address/hashcode
        //sequence wii also be preserved
        System.out.println(al.size()); // 0 but initial default capacity is 10
        //once AL reaches the max capacity then a new AL object will be created in memory and automatically with the capacity
        //according to formula  -->  newCapacity = (currentCapacity * 3/2) +1
        //ArrayList al = new ArrayList(1000); --> A new ArrayList will be formed with the initial capacity 1000 and will increase according to the formula.
        //it will also increase the performance
        //but, capacity oesn't mean it is size ..

        System.out.println("=============================================================");

        Object obj = al.get(1);
        //System.out.println(obj); //a but Object
        char c = (char) obj;// downcasted to char

        Student s = (Student) al.get(2);

        System.out.println(s);
        System.out.println(c);







    }
}
