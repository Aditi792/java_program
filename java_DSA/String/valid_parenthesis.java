package java_DSA.String;

import java.util.Stack;
/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 
Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 */

public class valid_parenthesis {


    public static boolean valParen(String s){
            Stack<Character> stack = new Stack<>();

            for(char c: s.toCharArray()){
                if(c == '(' || c=='{' || c=='[') stack.push(c);
                else{
                    if(stack.isEmpty()) return false;
                    char top = stack.pop();
                    if((c==')' && top != '(') ||
                        (c=='}' && top !='{') ||
                        (c ==']' && top != '['))
                        return false;
                }
            }
            return stack.isEmpty();
    }


    public static void main(String[] args) {
        String s = "(){}[(]";
        String s1 = "[(){}]";
        System.out.println(valParen(s)); //false
        System.out.println(valParen(s1));//true
    }
}
