package java_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class list1 {
    public static void main(String[] args) {
        List <String> l = new ArrayList<>();
        l.add("january");
        l.add("February");
        l.add("March");
        l.add("April");
        l.add("May");
        l.add("June");
        l.add("July");
        l.add("August");
        l.add("Septembaer");
        l.add("Octorber");
        l.add("November");
        l.add("December");

        /*for(String it : l){
            System.out.println(it + " ");
        }
            */

        Iterator <String> it = l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
