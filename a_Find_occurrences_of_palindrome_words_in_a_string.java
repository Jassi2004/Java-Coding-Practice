/**
Find occurrences of palindrome words in a string star_border
Write a function which given a string, count and return the palindrome words present in the string. A word in a string is separated with space(s).

Sample Input 1

Mom and Dad are my best friends
Sample Output 1

2
Explanation 1

﻿This string contains two palindrome words (i.e., Mom, Dad) so the count is 2.
Sample Input 2

mohit speaks english
Sample Output 2

0
Explanation 2

This string contains no palindrome words.
*/
import java.util.*;
public class a_Find_occurrences_of_palindrome_words_in_a_string {
    public static boolean isPaindrome(String s){
        int i=0 , j=s.length()-1;
        while(i<j){
            if(s.toLowerCase().charAt(i) != s.toLowerCase().charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static int CountPalindrome(String s){
        StringTokenizer st = new StringTokenizer(s);
        int ans = 0;
        while (st.hasMoreTokens()) {
            if(isPaindrome(st.nextToken())) ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s1 = "Mom and Dad are my best friends";
        String s2 = "mohit speaks english";
        System.out.println(CountPalindrome(s1)); 
        System.out.println(CountPalindrome(s2)); 

    }
    
}