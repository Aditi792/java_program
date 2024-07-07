package java_Collections.wiproPBL;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class treeset {  
    public static void main(String[] args) {
        
        TreeSet<String> setElement = new TreeSet<>();

        setElement.add("Aditi");
        setElement.add("Abhaya");
        setElement.add("Sinchan");
        setElement.add("Doreman");

        // Reverse the list 
        System.out.println("________________Reverse list_______________");

        ArrayList <String> list = new ArrayList<>(setElement);  //pass the treeset object to arrayLIST . TO CONVERT SET TO LIST
        
        Collections.reverse(list);   //collections is class which have inbuilt method reverse . which revers ethe list.
        
        for(String e : list){
            System.out.println(e);
        }
        System.out.println();




        // print the element in normal order
        System.out.println("________________list_______________");

        Iterator <String> it = setElement.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();



        //check element present or not

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you want to search : ");
        String element = sc.nextLine();
        if(setElement.contains(element)){
            System.out.println("Elemet present in the set.");
        }
        else{
            System.out.println("Element not Present in the set.");
        }

        sc.close();
        
    }
   

}


/*
 * ________________Reverse list_______________
Sinchan
Doreman
Aditi
Abhaya

________________list_______________
Abhaya
Aditi
Doreman
Sinchan

Enter the element you want to search : Aditi
Elemet present in the set.
 */