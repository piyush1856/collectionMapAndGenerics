package collectionFramework._4Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class _1QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> q = new PriorityQueue<>();
        /// Queue<Integer> q = new LinkedList<>(); --> no sorting logic required

        q.add(10);
        q.add(45);
        q.add(5);
        q.add(100);
        q.add(2);
        q.add(5);
        // use offer() instead of add()

        System.out.println(q);

        Integer i;

        while((i= q.poll()) != null){
            System.out.println(i);
        }









    }
}
