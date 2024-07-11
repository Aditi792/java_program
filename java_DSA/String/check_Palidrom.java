package java_DSA.String;

class check_palidrom{

    public static boolean checkPalindrome(String s){
        s = s.toLowerCase();
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(charArray[start] != charArray[end]){
                return false;
            }
            start ++;
            end--;
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println(checkPalindrome("MaDAm"));
    }
}