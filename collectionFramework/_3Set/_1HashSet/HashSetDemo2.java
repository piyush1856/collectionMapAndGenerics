package collectionFramework._3Set._1HashSet;


import sprint4Day3Assingment._2QuestionNumber2.StudentBean;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {

        HashSet<StudentBean> hs = new HashSet<>();

        hs.add(new StudentBean(10,100,"Piyush"));
        hs.add(new StudentBean(11,101,"Piyush1"));
        hs.add(new StudentBean(11,101,"Piyush1"));

        //System.out.println(new StudentBean(11,101,"Piyush1").equals(new StudentBean(11,101,"Piyush1")));
        System.out.println(hs.size());

        //override hashcode() and equals() in bean class to utilize hashSet property of unique element
        //overriding these two method make object logically equal but not technically equal

        //hashCode() --> eqauls() ---> duplicate


    }
}
