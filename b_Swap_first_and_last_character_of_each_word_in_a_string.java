/**
Swap first and last character of each word in a string star_border
Write a program which given a string, swap first and last character of each word in it.

Complete the function swapFirstLastChar() that accepts a multiword string and swaps the first and last character of every word in it.

Note: Every two adjacent words in the given string will be separated by exactly one space character.

Input Format

The first line of input consists number of testcases, T
The next T lines contains a string on which the said operation is to be performed
Output Format

For each testcase, print the string after doing the given operatio
Sample Input

2
Code Quotient
Get better at coding
Sample Output

eodC tuotienQ
teG retteb ta godinc
 */
import java.util.*;

public class b_Swap_first_and_last_character_of_each_word_in_a_string {
    static String swapFirstLastChar(String s) {
        
      StringTokenizer st = new StringTokenizer(s);
      String ans = "";
      while(st.hasMoreTokens()) {
        char[] temp = st.nextToken().toCharArray();
        int i=0, j = temp.length-1;

        String currWord = "";
        currWord += temp[j];
        // System.out.println(currWord);
        for(int k=i+1 ; k<j ; k++) currWord += temp[k];
        // System.out.println(currWord);
        currWord += temp[0];
        // System.out.println(currWord);

        ans += currWord;
        if(st.hasMoreTokens()) ans += " "; 

      }

      return ans;
      
    }
    public static void main(String[] args) {
        String s = "Code Quotient";
        
        System.out.println(swapFirstLastChar(s));
    }
}