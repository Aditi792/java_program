package java_DSA.String;
/*
 * Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */

class ReverseWordsInPlace {

      //we have to do it in O(1) space complexity

    public static String reverseWords(String s) {
        // Convert string to char array for in-place modification
        char[] str = s.toCharArray();
        int n = str.length;

        // Step 1: Reverse the entire string
        reverse(str, 0, n - 1);

        // Step 2: Reverse each word
        reverseWords(str, n);

        // Step 3: Clean up spaces
        return cleanSpaces(str, n);
    }

    private static void reverse(char[] str, int left, int right) {
        while (left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
    }

    private static void reverseWords(char[] str, int n) {
        int start = 0, end = 0;

        while (start < n) {
            while (start < end || start < n && str[start] == ' ') start++; // Skip spaces
            while (end < start || end < n && str[end] != ' ') end++;       // Skip non-spaces
            reverse(str, start, end - 1);                                  // Reverse the word
        }
    }

    private static String cleanSpaces(char[] str, int n) {
        int i = 0, j = 0;

        while (j < n) {
            while (j < n && str[j] == ' ') j++;                           // Skip spaces
            while (j < n && str[j] != ' ') str[i++] = str[j++];           // Keep non-spaces
            while (j < n && str[j] == ' ') j++;                           // Skip spaces
            if (j < n) str[i++] = ' ';                                    // Keep only one space
        }

        return new String(str).substring(0, i);
    }
}



public class reverse_word {

    //this is the brute force solution , as it takes O(n) time complexity but O(n+m) space complexity ...

    public static String reverseWord(String s){
        String[] words = s.split("\\s+");

        StringBuilder sb = new StringBuilder();
        
        for(int i = words.length -1 ; i>=0 ; i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        String revStr = sb.toString();
       return revStr;
    }

  




    public static void main(String[] args) {
        
        System.out.println(reverseWord("My name is Aditi Mondal"));

        String s1 = "the sky is blue";
        String s2 = "  hello world  ";
        String s3 = "a good   example";

        System.out.println(ReverseWordsInPlace.reverseWords(s1)); // Output: "blue is sky the"
        System.out.println(ReverseWordsInPlace.reverseWords(s2)); // Output: "world hello"
        System.out.println(ReverseWordsInPlace.reverseWords(s3)); // Output: "example good a"
    }
}
