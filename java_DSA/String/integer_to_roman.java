package java_DSA.String;

/*
 * Seven different symbols represent Roman numerals with the following values:

Symbol	Value
I	1
V	5
X	10
L	50
C	100
D	500
M	1000

Example 1:
Input: num = 3749
Output: "MMMDCCXLIX"
Explanation:
3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
 700 = DCC as 500 (D) + 100 (C) + 100 (C)
  40 = XL as 10 (X) less of 50 (L)
   9 = IX as 1 (I) less of 10 (X)
Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places

Example 2:
Input: num = 58
Output: "LVIII"
Explanation:
50 = L
 8 = VIII

Example 3:
Input: num = 1994
Output: "MCMXCIV"
Explanation:
1000 = M
 900 = CM
  90 = XC
   4 = IV
 */
public class integer_to_roman{

// TC = O(1) and SC- O(1).....
//as we store in an fixed size array so it takes a constant amount of memory . so SC(1).

    public static void integerRoman(int num){
        StringBuilder sb = new StringBuilder();
        int[] result = new int[4];
        int i = 0;
        while(num>0){
            int rem = num%10;
            result[i] = (int)(rem* (Math.pow(10, i)));   //store the value in an array
            num = num/10;
            i++;
        }
        for(int j = result.length-1 ; j>=0 ; j--){          //iterate through the array and check the condition.
            int val = result[j];
            if(val == 900) {sb.append( "CM");continue;}
            if(val == 400) {sb.append( "CD");continue;}
            if(val == 90) {sb.append( "XC"); continue;}
            if(val == 40) {sb.append( "XL");continue;}
            if(val == 9)  {sb.append( "IX");continue;}
            if(val == 4) {sb.append( "IV");continue;}
            
            while(val >= 1000){
                sb.append( "M"); 
                val -= 1000;
            }
            while(val >= 500){
                sb.append( "D"); 
                val -= 500;
            }
            while(val >= 100){
                sb.append( "C"); 
                val -= 100;
            }
            while(val >= 50){
                sb.append( "L"); 
                val -= 50;
            }
            while(val >= 10){
                sb.append( "X"); 
                val -= 10;
            }
            while(val >= 5){
                sb.append( "V"); 
                val -= 5;
            }
            while(val >= 1){
                sb.append( "I"); 
                val -= 1;
            }
        }
        System.out.println(sb.toString());
    }


//TC -O(1) and SC -(1)

    public static void integerToRoman(int num){

        StringBuilder result = new StringBuilder();
        int[] values = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] romans = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        for(int i = values.length -1 ; i>=0 ; i--){
            while(num >= values[i]){
                num -= values[i];
                result.append(romans[i]);
            }
        }
        System.out.println(result.toString());
    }



    public static void main(String[] args) {
        int num = 1994;
        integerRoman(num);
        integerToRoman(num);
    }
}