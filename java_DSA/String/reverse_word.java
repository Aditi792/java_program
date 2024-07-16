package java_DSA.String;

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
