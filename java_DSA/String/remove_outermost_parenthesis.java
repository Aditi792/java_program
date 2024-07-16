package java_DSA.String;

/*
 * Example 1:

Input: s = "(()())(())"
Output: "()()()"
Explanation: 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
Example 2:

Input: s = "(()())(())(()(()))"
Output: "()()()()(())"
Explanation: 
The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
Example 3:

Input: s = "()()"
Output: ""
Explanation: 
The input string is "()()", with primitive decomposition "()" + "()".
After removing outer parentheses of each part, this is "" + "" = "".
 
 */

public class remove_outermost_parenthesis{

    public static String removeParenthesis(String s){

        char[] charS = s.toCharArray();

        StringBuilder str = new StringBuilder();
        int balance = 0;

        for(int i = 0 ; i<s.length() ; i++){
            if(charS[i] == '('){
                if(balance > 0 ){
                    str.append(charS[i]);
                }
                balance++;
            }else{
                balance--;
                if(balance > 0){
                    str.append(charS[i]);
                }
            }
        }
        return str.toString();
        
    }



    public static void main(String[] args) {
        String str1 = new String("(()())(())");
        String str2 = new String("(())())((())");
        System.out.print(removeParenthesis(str1));
        System.out.println();
        System.out.print(removeParenthesis(str2));
    }
}

/*
 * ()()()
    ()()
 */