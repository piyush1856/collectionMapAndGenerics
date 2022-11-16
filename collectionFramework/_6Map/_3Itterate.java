package collectionFramework._6Map;

import collectionFramework._3Set._2SortedSet.Student;

import java.util.*;

public class _3Itterate {

    public static void main(String[] args) {

        HashMap<String, Student> hm = new HashMap<>();
        hm.put("Maharastra",new Student(10,950,"Ganesh"));
        hm.put("Tamilnadu",new Student(12,850,"Surya"));
        hm.put("Telangana",new Student(15,920,"Venkat"));
        hm.put("Haryana",new Student(16,910,"Dinesh"));
        hm.put("Kerla",new Student(18,880,"Srinu"));
        //getting all the state name:
        Set<String> states= hm.keySet();
        System.out.println(states);

        //Getting all the Student as List object.
        Collection<Student> cols = hm.values();
        List<Student> students = new ArrayList<>(cols);

    //printing all the students from the List
        for(Student student:students){
            System.out.println("Roll :"+student.getRoll());
            System.out.println("Name :"+student.getName());
            System.out.println("Marks :"+student.getMarks());
            System.out.println("=========================");
        }


        //printing state wise students details:
        Set<Map.Entry<String,Student>> set = hm.entrySet();
        for(Map.Entry<String,Student> me: set) {
            System.out.println("Toppers Student of State :" + me.getKey());

            System.out.println("*********************************");
            Student student = me.getValue();
            System.out.println("Roll :" + student.getRoll());
            System.out.println("Name :" + student.getName());
            System.out.println("Marks :" + student.getMarks());
        }



    }
}
