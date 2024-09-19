/*
 * 1071. Greatest Common Divisor of Strings
Solved
Easy
Topics
Companies
Hint
For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""

 */


public class j_GCD_of_two_String {
    public static int getLenOfGCD(int x , int y){
        if(y == 0) return x;

        return getLenOfGCD(y, x%y);
    }
    public static String gcdOfStrings(String s1, String s2) {
        if(s1.length() < s2.length()) return gcdOfStrings(s2, s1);

        String check1 = s1 + s2;
        String check2 = s2 + s1;
        if(!check1.equals(check2)) return "";

        int x=s1.length(), y=s2.length();
        int lenOfGcd = getLenOfGCD(x ,y);

        String ans = s2.substring(0, lenOfGcd);
        return ans;
    }
    public static void main(String[] args) {
        String str1 = "ABCABC", str2 = "ABC";
        System.out.println(gcdOfStrings(str1, str2));
    }
}
