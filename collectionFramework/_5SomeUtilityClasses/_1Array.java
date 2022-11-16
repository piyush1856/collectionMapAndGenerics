package collectionFramework._5SomeUtilityClasses;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _1Array {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        String res = Arrays.toString(arr);
        System.out.println(res);

        List<Integer> list = Arrays.asList(10,50,4,40,56,544);
        System.out.println(list);

        List<String> l2 = Arrays.asList(res);
        System.out.println(l2.get(0).charAt(1));


        int[] arr2 = {100,5,0,4,6,12,65,656,};
        int i = Arrays.binarySearch(arr2,100);
        System.out.println(i);
        //if int[] is sorted then only we will get correct answer

        Arrays.sort(arr2);
        int j = Arrays.binarySearch(arr2,100);
        System.out.println(j);  // index of 100 in sorted arr2[]

        Collections.reverse(list);
        System.out.println(list);







    }
}
