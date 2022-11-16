package collectionFramework._5SomeUtilityClasses;

import collectionFramework._3Set._2SortedSet.Student;
import collectionFramework._3Set._2SortedSet.StudentMarksComarision;

import java.util.*;

public class _Collections {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,5,4,7,8,2,6,9,4,5,3,2,1,4,7,8,5,2,5);

        int x=  Collections.frequency(list,2);
        System.out.println(x);

        TreeSet ts = new TreeSet(list);
        System.out.println(ts);  // sorted but duplicate removed
        //so
        Collections.sort(list);
        System.out.println(list);


        List<Student> students = new ArrayList<>();
        students.add(new Student(10,632,"n1"));
        students.add(new Student(15,32,"n3"));
        students.add(new Student(13,932,"n6"));
        students.add(new Student(17,532,"n1"));
        students.add(new Student(12,132,"n9"));

        //you can use tressSet and apply comparator/comparable
        //other way
        //Collections.sort(students); //here student class should implement comparable
        //here Student class doesn't implement comparable
        //Collections.sort(students,new StudentMarksComarision());
        //System.out.println(students);
        //Since it is list, duplicate will be their

        //or by lamda
        Collections.sort(students,(s1,s2) -> s1.getMarks() > s2.getMarks() ? +1 : -1);
        System.out.println(students);













    }
}
