package java_DSA.String;

/*
 * Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.
For example, if s = "abcde", then it will be "bcdea" after one shift.

Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:

Input: s = "abcde", goal = "abced"
Output: false
 */

public class rotate_string {

    public static boolean rotateString(String s, String goal) {
        int len = s.length();
        for(int i =0 ; i<len ;i++){
            String str = s.substring(i, len);
            String rev = str + s.substring(0, i);
            if(rev.equals(goal)) return true;
        }
        return false;
    }


    public static boolean RotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        } 
        String s2 = s + s;  //s2 becomes 'abcdeabcde' . substring is a part of string with contiguous locatio.
        //so if we double the string then the substring must be present in this.
        
        return s2.contains(goal); //Check if goal ("cdeab") is a substring of s2 ("abcdeabcde").
         //s2.contains(goal) returns true because "cdeab" can be found in "abcdeabcde".starting from index 5.
    }



    public static void main(String[] args) {
        System.out.println(rotateString("abcde" ,"abced"));   //false
        System.out.println(rotateString("abcde" ,"cdeab"));   //true

        System.out.println(RotateString("abcde" ,"abced"));   //false
        System.out.println(RotateString("abcde" ,"cdeab"));   //true
    }
}
