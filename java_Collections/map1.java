package java_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


class Hashmap{

    HashMap <String,String> M1 = new HashMap<>();

    public HashMap <String,String> saveCountryCapital(String Country , String Capital){
        M1.put(Country, Capital);
        return M1;
    }

    public String getCapital(String CountryName){
        return M1.get(CountryName);
    }

    public String getCountry(String CapitalName){
        for(Map.Entry<String, String> m : M1.entrySet()){
            if(m.getValue().equals(CapitalName)){
                return m.getKey();
            }
        }
        return CapitalName;
    }

    public void printMap(){
        for(Map.Entry<String,String> m : M1.entrySet()){
            System.out.println(m.getKey() +"      :    "+m.getValue());
        }
    }

    public HashMap<String,String> createHashMap(){
        HashMap <String ,String> M2 = new HashMap<>();
        for(Map.Entry<String,String> m : M1.entrySet()){
            M2.put(m.getKey(), m.getValue());
        }
        return M2;
    }

    public void checkKey(String CountryName){
        if(M1.containsKey(CountryName)){
            System.out.println("Key Present in the map");
        }
        System.out.println("Key not present");
    }
     
    public void checkValue(String CapitalName){
        if(M1.containsValue(CapitalName)){
            System.out.println("Value Present in the map");
        }
        System.out.println("Value not present");
    }

    public ArrayList<String> createArray(){
        ArrayList <String> list = new ArrayList<>();
        for(Map.Entry<String,String> m : M1.entrySet()){
            list.add(m.getKey());
        }
        return list;
    }

}

public class map1 {
    public static void main(String[] args) {
       Hashmap hm = new Hashmap();
       
       hm.saveCountryCapital("India","Delhi");
       hm.saveCountryCapital("Japan", "Tokyo");

       System.out.println(hm.getCapital("India"));

       System.out.println(hm.getCountry("Delhi")); 

       hm.printMap();
       System.out.println(hm.createArray());
       System.out.println(hm.createHashMap());

       hm.checkKey("UK");
       hm.checkValue("Delhi");
    }    
}
