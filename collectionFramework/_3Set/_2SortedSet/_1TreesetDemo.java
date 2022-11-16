package collectionFramework._3Set._2SortedSet;


import java.util.TreeSet;

public class _1TreesetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(25);
        ts.add(30);
        ts.add(50);
        ts.add(18);
        ts.add(30);
        //ts.add(null); // runtime exception
        ts.add(30);
        ts.add(12);
        ts.add(1);

        System.out.println(ts);


        TreeSet<String> ts2 = new TreeSet<>();

        ts2.add("one");
        ts2.add("two");
        ts2.add("three");
        ts2.add("four");
        ts2.add("five");

        System.out.println(ts2); //alphabetical sorting


    //comparator
        StudentMarksComarision mcomp = new StudentMarksComarision();

        TreeSet<Student> ts3 = new TreeSet<>(mcomp);

        ts3.add(new Student(10,100,"n1"));
        ts3.add(new Student(12,2000,"a2"));
        ts3.add(new Student(13,30,"n3"));
        ts3.add(new Student(14,500,"d4"));
        ts3.add(new Student(15,400,"a2"));

        System.out.println(ts3); // exception
        //If we try to add any element in TreeSet must implement comparable interface


        //comparator





    }
}
