package java_Collections;

import java.util.HashSet;
import java.util.Iterator;

class hashSet{

    HashSet <String> H1 = new HashSet<>();

    public HashSet <String> setCountryNames(String CountryName){
        H1.add(CountryName);
        return H1;
    }

    public String getCountry(String CountryName){
        for(String Country : H1){
            if(Country.equals(CountryName)){
                return Country;
            }      
        } 
        return null;  
    }

    public void printCountry(){
        System.out.println("\nIn et element print in random order as this is unoredred data structure.\n");
        Iterator <String> it = H1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    
}


class set{
    public static void main(String[] args) {
        hashSet CountryHashSet = new hashSet();
        CountryHashSet.setCountryNames("India");
        CountryHashSet.setCountryNames("USA");
        CountryHashSet.setCountryNames("England");
        CountryHashSet.setCountryNames("Uk");

        System.out.println("Searching for 'India': " + CountryHashSet.getCountry("India"));
        System.out.println("Searching for 'USA': " + CountryHashSet.getCountry("USA"));
        System.out.println("Searching for 'Japan': " + CountryHashSet.getCountry("Japan"));


        CountryHashSet.printCountry();

    }
}

/*
 * Searching for 'India': India
Searching for 'USA': USA
Searching for 'Japan': null

In et element print in random order as this is unoredred data structure.

USA
Uk
England
India
 */