package collectionFramework._3Set._2SortedSet;


import java.util.Comparator;

public class Student/* implements Comparable<Student> */{

    private  int roll;
    private int marks;
    private  String name;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int roll, int marks, String name) {
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }

    public  Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }


    //before adding generic comparable
//    @Override
//    public int compareTo(Object o) {
//
//        Student s1 = this;
//        Student s2 = (Student) o;
//
//        if(s1.getMarks() > s2.getMarks()){
//            return +1;
//        }else if(s1.getMarks() < s2.getMarks()){
//            return -1;
//        }else{
//            return 0;
//        }
//
//
//    }


    //after generic comparable
    //@Override
    //public int compareTo(Student s) {
        //for marks : similar for roll and name can be implemented
        //for decending just change the operator sign

//        if(this.getMarks() > s.getMarks()){
//            return +1;
//        }else if(this.getMarks() < s.getMarks()){
//            return -1;
//        }else{
//            return 0;
//        }
        //you can also keep duplicate by modifying the above condition  remove 0 as return and do the rest part

        //for name(String)
       // return this.getName().compareTo(s.getName());

        //if marks are same the sort with name
//        if (this.getMarks()>s.getMarks()){
//            return +1;
//        } else if (this.getMarks()<s.getMarks()) {
//            return -1;
//        }else {
//            return this.getName().compareTo(s.getName());
//        }

   // }
}
