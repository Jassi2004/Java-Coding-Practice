/*
Capitalize the first letter of each word star_border
Write a program which given a string, Capitalize first letter of each word in it.

Sample Input

code quotient
Sample Output

Code Quotient
Sample Input

get better at coding
Sample Output

Get Better At Coding
 */

import java.util.*;
// import java.lang.*;

public class c_Capitalize_the_first_letter_of_each_word {
    // My Logic
    static String capitalizeFirstChar1(String s) {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder sb = new StringBuilder();
        // String ans = "";

        while (st.hasMoreTokens()) {
            char[] temp = st.nextToken().toCharArray();
            temp[0] = Character.toUpperCase(temp[0]);
            System.out.println(temp);
            sb.append(temp);
            // ans += temp.toString();
            if(st.hasMoreTokens()) sb.append(" ");
        }
        return sb.toString();
    }
    // Better Method
    static String capitalizeFirstChar(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<sb.length() ; i++){
            if(i==0 || s.charAt(i-1)==' '){
                sb.setCharAt(i, Character.toUpperCase(s.charAt(i)));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "code quotient";
        System.out.println(capitalizeFirstChar1(s));
        System.out.println(capitalizeFirstChar(s));
    }
}
