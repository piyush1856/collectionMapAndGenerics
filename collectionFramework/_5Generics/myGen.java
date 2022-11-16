package collectionFramework._5Generics;

import sprint2Day4Live.Student;

public class myGen<T>{

    // creating own generics

    T obj;

    void  add (T obj){
        this.obj=obj;
    }

    T get(){
        return obj;
    }

    public static void main(String[] args) {

        myGen<String> mg = new myGen<>();

        mg.add("hello");

        System.out.println(mg.get());



        myGen<Student> mg2 = new myGen<>();
        mg2.add(new Student("piyush"));
        System.out.println(mg2.get());





    }


}
