package java_DSA.String;

/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 */

import java.util.Arrays;
import java.util.HashMap;

public class valid_anagram {

    //optimal approach for unicode character

    //Iterating over both strings to build the character count map takes O(n) time, where nnn is the length of the strings.
    //The space complexity is O(u), where uuu is the number of unique characters in the string. In the worst case, this could be O(n) if all characters are unique.

    public static boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ;i<s.length() ;i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)-1);
        }
        for(int count : map.values()){
            if(count != 0) return false;
        }
        return true;

    }


//optimal approach for ASCII

// Iterating over both strings takes O(n) time, where n is the length of the strings.
//The final check of the character count array also takes O(1) time because the size of the array (256 for ASCII characters) is constant and does not depend on n

    public static boolean IsAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        int[] charCount = new int[256];  // Assuming ASCII character set

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i)]++;
            charCount[t.charAt(i)]--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }



//brute force approach as time complexity is O(nlogn) and space complexity O(n+m) which is equla to O(n)
    public static boolean BruteIsAnagram(String s , String t){
        if(s.length() != t.length()) return false;

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }


    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));//true

        System.out.println(IsAnagram(s, t));//true

        System.out.println(BruteIsAnagram(s, t));//true
    }
}
