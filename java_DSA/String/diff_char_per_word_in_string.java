package java_DSA.String;

/*
 * Crazy Zak has designed the below steps which can be applied on any given string (sentence) to produce a number.
STEP1. In each word, find the Sum of the Difference between the first letter and the last letter, second letter and the penultimate letter, and so on till the center of the word.
STEP2. Concatenate the sums of each word to form the result.

For example –
If the given string is “WORLD WIDE WEB”
STEP1. In each word, find the Sum of the Difference between the first letter and the last letter, second letter and the penultimate letter, and so on till the center of the word.
WORLD = [W-D]+[O-L]+[R] = [23-4]+[15-12]+[18] = [19]+[3]+[18] = [40]
WIDE = [W-E]+[I-D] = [23-5]+[9-4] = [18]+[5] = [23]
WEB = [W-B]+[E] = [23-2]+[5] = [21]+[5] = [26]
STEP2. Concatenate the sums of each word to form the result
[40] [23] [26]
[402326]
The answer (output) should be the number 402326.

NOTE1:The value of each letter is its position in the English alphabet system i.e. a=A=1, b=B=2, c=C=3, and so on till z=Z=26.
So, the result will be the same for “WORLD WIDE WEB” or “World Wide Web” or “world wide web” or any other combination of uppercase and lowercase letters.

IMPORTANT NOTE1:The value of each letter is its position in the English alphabet system i.e. a=A=1, b=B=2, c=C=3, and so on till z=Z=26.
So, the result will be the same for “WORLD WIDE WEB” or “World Wide Web” or “world wide web” or any other combination of uppercase and lowercase letters.

Example2:
input1 = “Hello World”
output1 = 2640
Explanation:
Hello = [H-O]+[E-L]+[L] = [8-15]+[5-12]+[12] = [7]+[7]+[12] = [26]
World = [W-D]+[O-L]+[R] = [23-4]+[15-12]+[18] = [19]+[3]+[18] = [40]
Result = Number formed by concatenating [26] and [40] = 2640
 */
public class diff_char_per_word_in_string {


    //TC - O(m*n) where m =  number of words in the array and n= maximum length of a word in the array

    // Method to convert a character to its corresponding alphabet position
    public static int letterToNumber(char c){
        return c - 'A' + 1;   // This assumes input is uppercase
    }


    // Method to calculate the sum of differences for a word
    public static int sumOfDifference(String word){
        int n = word.length();
        int totalSum = 0;

        for(int i = 0 ; i<n/2 ; i++){
            totalSum += Math.abs(letterToNumber(word.charAt(i)) - letterToNumber(word.charAt(n-i-1)));
        }

        if(n % 2 == 1){  //for middle element sum as the prev loop is run n/2 times.
            totalSum += letterToNumber(word.charAt(n/2));
        }

        return totalSum;
    }


    //split the string in word
    public static String[] splitWord(String str){
        str = str.toUpperCase();                   //as in the question mention the result will be same for all the cases.
        String[] wordArr = str.split(" ");
        return wordArr;
    }







    
    public static void main(String[] args) {
        String str = "hello world";
        int result = 0;

        for(String word : splitWord(str)){
            int sum = sumOfDifference(word);
            result = result * (int)Math.pow(10,String.valueOf(sum).length()) + sum;
        }

        System.out.println(result);  //2640
    }
}
