package java_DSA.String;


/*
 * Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.

Example 1:

Input: s = "(1+(2*3)+((8)/4))+1"
Output: 3
Explanation: Digit 8 is inside of 3 nested parentheses in the string.

Example 2:

Input: s = "(1)+((2))+(((3)))"
Output: 3
Explanation: Digit 3 is inside of 3 nested parentheses in the string.

Example 3:
Input: s = "()(())((()()))"
Output: 3

 */
public class Max_depth_parenthesis {

    //sc - O(1) , tc-O(n)

    public static int validParenthesis(String s){

        int count = 0 ,max=0;
        for(int i = 0 ;i<s.length() ;i++){
            if(s.charAt(i) == '(') {
                count++;
            }
            else if(s.charAt(i) == ')'){
                if(count>max)max=count;
                count--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(validParenthesis(s)); //3
    }
}
