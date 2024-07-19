package java_DSA.String;

import java.util.Arrays;

public class longest_common_prefix {

    // tc = O(n);


    public static String longestCommonPrefixBruteForce(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = commonPrefix(prefix, strs[i]);
            if (prefix.isEmpty()) break;
        }
        return prefix;
    }

    private static String commonPrefix(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.substring(0, i);
            }
        }
        return str1.substring(0, minLength);
    }


    //better approach //tc - O(nlogn)

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return"";
        Arrays.sort(strs);
        String firstStr = strs[0];
        String lastStr = strs[strs.length-1];
        int minLength = Math.min(firstStr.length(), lastStr.length());
        int i = 0;
        while(i<minLength && firstStr.charAt(i) == lastStr.charAt(i)){
            i++;
        }
        return firstStr.substring(0, i);
    }


    public static void main(String[] args) {
        String[] strs = {"reflower","flow","flight"};
        System.out.println(longestCommonPrefix(strs)); //fl

        System.out.println(longestCommonPrefixBruteForce(strs)); //fl
    }
}
