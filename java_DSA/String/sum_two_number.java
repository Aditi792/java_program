package java_DSA.String;
/*
 * Write a function that takes two numbers in string format and forms a string containing the sum (addition) of these two numbers.
 * 
 * Assumption(s):
The input strings will contain only numeric digits
The input strings can be of any large lengths
The lengths of the two input string need not be the same
The input strings will represent only positive numbers
For example –
If input strings are “1234” and “56”, the output string should be “1290”
If input strings are “56” and “1234”, the output string should be “1290”
If input strings are “123456732128989543219” and “987612673489652”, the output string should be “123457719741663032871”
NOTE: In Java & C#, this logic can be easily implemented using BigInteger. However for the sake of enhancing your programming skills, you are recommended to solve this question without using BigInteger.
 */

public class sum_two_number {

    public static String SumNormal(String input1, String input2){
        int carry = 0;
        
        //Ensure input1 is the longer string, or swap them
        if(input1.length() < input2.length()){
            String temp = input1;
            input1 = input2;
            input2 = temp;
        }

        int len1 = input1.length();// Length of the longer string
        int len2 = input2.length();// Length of the shorter string
        String result ="";// To store the final sum result
        int j =len2-1;// Index for input2 (shorter string)


        // Loop through each digit from the end to the beginning
        for(int i = 0 ; i<len1 ; i++){

            int a = Character.getNumericValue(input1.charAt(len1-i-1));// Get the current digit from input1 from end

            int b=0;  // Get the current digit from input2 if within bounds
            if(j >= 0){
                b = Character.getNumericValue(input2.charAt(j));
                j--; // Move to the next digit in input2
            }

            // Calculate the sum of the digits and carry
            int sum = a + b + carry;
            carry = sum /10;     // Update the carry for the next iteration
            int resDig = sum % 10;   // Current digit after addition


            // Prepend the current digit to the result string
            result = Integer.toString(resDig) + result;


            // If this is the last iteration and there's still a carry, add it
            if(i == len1-1 && carry >0){
                result = Integer.toString(carry) + result;
            }
        }

        return result;
    }





    public static String SumOptimal(String input1, String input2){
        StringBuilder result = new StringBuilder();
    
    int i = input1.length() - 1;
    int j = input2.length() - 1;
    int carry = 0;
    
    //The loop continues as long as there are digits to process in either string or there is a carry-over left to add.
    while (i >= 0 || j >= 0 || carry > 0) { 

        //If i or j is out of bounds (i.e., less than 0), that means the corresponding string has no more digits to process, so we use 0 as the digit.
        //The charAt() method is used to get the character at the current index, and - '0' converts the character to its corresponding integer value.

        int digit1 = i >= 0 ? input1.charAt(i--) - '0' : 0;
        int digit2 = j >= 0 ? input2.charAt(j--) - '0' : 0;
        
        int sum = digit1 + digit2 + carry;
        result.append(sum % 10);
        carry = sum / 10;
    }
    
    //Since we've been appending digits in reverse order (starting from the least significant digit), we reverse the StringBuilder before converting it to a string.

    return result.reverse().toString();  
    }



    public static void main(String[] args) {
        
        System.out.println(SumNormal("123", "9999999")); //10000122
        System.out.println(SumOptimal("123", "9999999")); //10000122
    }
}
