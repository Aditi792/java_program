package java_DSA.String;

/*
 * You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.
A substring is a contiguous sequence of characters within a string.

Example 1:

Input: num = "52"
Output: "5"
Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
Example 2:

Input: num = "4206"
Output: ""
Explanation: There are no odd numbers in "4206".
Example 3:

Input: num = "35427"
Output: "35427"
Explanation: "35427" is already an odd number.
 */

public class largest_odd_substring {

    public static String largestOddNumber(String num) {
        int n = num.length();
        for(int i = n -1 ; i>=0 ; i--){  // it start iterate from the last of the string . a biggest odd number would be that number with end with a odd digit.
            if((num.charAt(i) - '0') % 2 != 0){  // so it checks from the last digits . which last digit is odd ,the number from 0 to that position would be the largest odd number. 

                /*This expression converts the character retrieved from the string into its corresponding integer value.
                    Characters representing digits ('0' to '9') have ASCII values. The character '0' has an ASCII value of 48, '1' has an ASCII value of 49, and so on.
                    Subtracting '0' from the character digit gives the integer value of the character.
                    For example, '5' - '0' results in 53 - 48 = 5.
                    This conversion works because the ASCII values of characters '0' to '9' are consecutive. */


                return num.substring(0, i+1);//return the substring from the beginning of the string up to and including this last odd digit.
            }
        }
        return ""; //If no odd digit is found after iterating through the entire string, return an empty string.
    }
    public static void main(String[] args) {
        
        System.out.println(largestOddNumber("52352"));
    }
}
