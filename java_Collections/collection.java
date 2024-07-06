package java_Collections;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

public class collection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        list.add(12); // add the element at the last of the previous element
        list.add(23);
        list.add(50);

        list.remove(1);// it will remove the element which is present in this object
        System.out.println(list); // [12,50]

        list.add(1, 100); // it will add the element in the specific index

        System.out.println(list);//[12,100,50]

        System.out.println(list.size()); // it return the size of the arraylist.in array we use length but in arraList we use size()

        System.out.println(list.get(2)); // it will print the element of the specific index as same as arr[i], which is used in array.
        
        list1.add(34);
        list1.add(23);
        list.add(52);

        list.addAll(list1); // it will copy all list1 element to list
        System.out.println(list); //[12, 100, 50, 52, 34, 23]

        list.toArray(); // it will convert the list to an array



        //for iteration three method present

        for(int i = 0 ; i<list.size() ; i++){
            System.out.println("elements are : " + list.get(i));
        }
    
        //foreach loop
        for(int it : list){
            System.out.println(it);
        }

        // Iterator

        Iterator <Integer> it = list.iterator();
        while(it.hasNext())  {
            System.out.println(it.next());
        }  


        list.clear(); // it will clear the list elements
        System.out.println(list);
    }
}
