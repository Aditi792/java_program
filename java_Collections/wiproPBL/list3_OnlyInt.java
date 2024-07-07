package java_Collections.wiproPBL;

import java.util.ArrayList;

public class list3_OnlyInt {
    
    public static void main(String[] args) {

        ArrayList <Number> addInt = new ArrayList<>(); //declare arraylist as a type of Number so, it can contain only numbers(integer,float etc )
        //no other type data is stored.

        addInt.add(12); //integer
        addInt.add(346L); //long
        addInt.add(23.45); //double
        addInt.add(12.34f); //float

        //addInt.add("adit"); //give error

       System.out.println(addInt);
    }
}
