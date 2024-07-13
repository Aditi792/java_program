package java_DSA.array;

import java.util.Stack;

public class valid_Paranthesis {

    public static boolean isValid(String s){
        Stack<String> stack = new Stack<>();

        char sArray[] =s.toCharArray();

        for(int i = 0 ; i<sArray.length ; i++){
            if(sArray[i].equals("(")){
                stack.push(s);
            }
            else if (sArray[i].equals(")")){
                stack.pop(stack.peek());
            }

        }
        

    } 
    public static void main(String[] args) {
        
    }
}
