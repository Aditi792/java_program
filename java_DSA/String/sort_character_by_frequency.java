package java_DSA.String;
/*
 * Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
Return the sorted string. If there are multiple answers, return any of them.

Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class sort_character_by_frequency {


//this is the better approach where TC - O(nlogn) and SC- O(n) [no. of keys in the map]

    public static void frequencySort(String s) {
        String result ="";  //string slowdown  the runtime . so use StringBuilder.
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ;i<s.length() ;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
        }

        PriorityQueue <Character> PQ = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));  //O(nlogn) for building queue with unique character using comparator .
        PQ.addAll(map.keySet());
        
        while(!PQ.isEmpty()){
            char current = PQ.poll();
            for(int i = 0 ; i<map.get(current) ; i++){
                result += current;
            }
        }
        System.out.println(result);
    }


    
    //best approach will be TC - O(nlogn) and space complexity O(1).

    public static void FrequencySort(String s){
       StringBuilder result = new StringBuilder(); // if i use String rather than stringBuilder then it will slow down the runtime.
        int[][] arr = new int[128][2]; //128 for cover all the character in the ascii table..
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            arr[ch][0]++;     //counting ch occurrence
            arr[ch][1] = ch;  // assigning ch in the second col
        }

        Arrays.sort(arr,(a,b)->b[0]-a[0]); //comparator with lambda expression.
        for(int i = 0 ; i<128 ; i++){
            if(arr[i][0]==0)break;
            for(int j= 0 ; j<arr[i][0] ;j++){
                result.append((char)arr[i][1]);
            }
        }
        System.out.println(result.toString());  //if i use StringBuilder then always use toString method to convert it in string;
    }





    public static void main(String[] args) {
        String s = "raaeaedere";
        frequencySort(s);
        FrequencySort(s);
    }
}
