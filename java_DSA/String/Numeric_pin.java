package java_DSA.String;

/*
 * The numeric PIN can be obtained by adding the lengths of each word of the string to get the total length, and then continuously adding the digits of the total length till we get a single digit.
For example, if the string is “Wipro Technologies", the numeric PIN will be 8.

Explanation:
Length of the word “Wipro” = 5
Length of the word “Technologies” = 12
Let us add all the lengths to get the Total Length = 5 + 12 = 17
The Total Length = 17 , which is not a single-digit, so now let us continuously add all digits till we get a single digit i.e. 1+ 7 = 8
Therefore, the single-digit numeric PIN = 8

Assumptions: For this assignment, let us assume that the given string will always contain more than one word.

If the given string is "The Good The Bad and The Ugly", the numeric PIN would be = 5
Explanation:
Let us add lengths of all words to get the Total Length = 3+4+3+3+3+3+4 = 23
Total Length = 23, which is not yet a single digit, so let us continue adding all digits of the Total Length, i.e. 2+3 = 5
Therefore, single-digit numeric PIN = 5
 */

public class Numeric_pin {

    //Tc -O(n)

    public static int Pin(String str){
        String[] words = str.split(" ");
        int sum = 0;

        for(int i = 0 ; i<words.length ; i++){
            sum += words[i].length();
        }

        // if(sum <= 9){   //single digit
        //     return sum;
        // }else{
        //     int res = 0;
        //     while(sum > 0){
        //         int rem = sum % 10;
        //         res += rem;
        //         sum = sum/10;
        //     }
        //     return res;
        // }
        
        return (1 + (sum - 1) % 9);   //single digit
    }


    public static void main(String[] args) {
        String str = "The Good The Bad and The Ugly";
        String str1 = "Wipro Technologies";
        System.out.println(Pin(str));
        System.out.println(Pin(str1));
    }
}
