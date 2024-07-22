package java_DSA.String;
/*
 * Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
 */

import java.util.HashMap;

public class Isomorphic_string {

    //better approach SC- O(n)  TC - O(n)..... to reduce the soace complexity we use array rather than hashmap.

    public static boolean isomorphicStr(String str1,String str2){
         
        HashMap <Character,Character> mapST = new HashMap<>();
        HashMap <Character,Character> mapTS = new HashMap<>();

        if(str1.length() != str2.length()){
            return false;
        }

        for(int i = 0 ; i<str1.length() ; i++){
            char charStr1 = str1.charAt(i);
            char charStr2 = str2.charAt(i);


            if(mapST.containsKey(charStr1)){
                if(mapST.get(charStr1) != charStr2){
                    return false;
                }
            }else{
                mapST.put(charStr1,charStr2);
            }


            if(mapTS.containsKey(charStr2)){
                if(mapTS.get(charStr2) != charStr1){
                    return false;
                }
            }else{
                mapTS.put(charStr2 ,charStr1);
            }
        }
       return true;     
    }

    // using array rather than than for reduce tha space but it takes also some space but the space is constant.so , this is the optimal approach. SC- O(1)  TC - O(n)

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] mapST = new int[256];
        int[] mapTS = new int[256];//The size 256 is chosen to cover all possible ASCII characters.

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (mapST[charS] == 0 && mapTS[charT] == 0) {  //If both mapST[charS] and mapTS[charT] are zero, it means this is the first time we encounter this mapping. Set the mapping.
                mapST[charS] = charT;
                mapTS[charT] = charS;

            } else if (mapST[charS] != charT || mapTS[charT] != charS) {
                return false;
            }
        }

        return true;
    }


    

    public static void main(String[] args) {
       
        String str1 = "badc";
        String str2 = "baba";
        System.out.println(isomorphicStr(str1, str2));  //false

        String s = "foo";
        String t = "bar";
        System.out.println(isomorphicStr(s, t));   //false

        String s1 = "foo";
        String t1 = "add";
        System.out.println(isomorphicStr(s1, t1));  //true
    }
}
