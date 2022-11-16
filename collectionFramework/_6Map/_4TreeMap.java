package collectionFramework._6Map;

import collectionFramework._3Set._2SortedSet.Student;
import collectionFramework._3Set._2SortedSet.StudentMarksComarision;

import java.util.Set;
import java.util.TreeMap;

public class _4TreeMap {

    public static void main(String[] args) {

        TreeMap<Student, String> tm = new TreeMap<>(new StudentMarksComarision());

        tm.put(new Student(10,950,"Ganesh"),"kolkata");
        tm.put(new Student(12,850,"Surya"),"Delhi");
        tm.put(new Student(15,920,"Venkat"),"Hyd");
        tm.put(new Student(16,910,"Dinesh"),"mum");
        tm.put(new Student(18,880,"Srinu"),"godda");

        System.out.println(tm);







    }
}
