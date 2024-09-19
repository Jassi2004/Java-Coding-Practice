/* * 
541. Reverse String II
Solved
Easy
Topics
Companies
Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

 

Example 1:

Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Example 2:

Input: s = "abcd", k = 2
Output: "bacd"
 */

public class p_Reverse_String_II {
        public static String reverseStr(String s, int k) {
            StringBuilder ans = new StringBuilder();
            int n = s.length();
            int index = 0;
    
            // Main loop to process full 2*k chunks
            while (index + 2 * k <= n) {
                StringBuilder sb1 = new StringBuilder(s.substring(index, index + k));  // Reverse first k
                StringBuilder sb2 = new StringBuilder(s.substring(index + k, index + 2 * k));  // Keep next k as is
                ans.append(sb1.reverse().toString());  // Add reversed first k characters
                ans.append(sb2.toString());  // Add the next k characters
                index += 2 * k;  // Move to next block
            }
    
            // Handle remaining characters (less than 2*k characters)
            int remaining = n - index;
            if (remaining >= k) {
                // If remaining characters are between k and 2*k
                StringBuilder sb1 = new StringBuilder(s.substring(index, index + k));  // Reverse first k characters
                StringBuilder sb2 = new StringBuilder(s.substring(index + k, n));  // Keep the rest as is
                ans.append(sb1.reverse().toString());
                ans.append(sb2.toString());
            } else {
                // If remaining characters are fewer than k, reverse them all
                StringBuilder sb1 = new StringBuilder(s.substring(index, n));  // Reverse all remaining characters
                ans.append(sb1.reverse().toString());
            }
    
            return ans.toString();
        }
    
    public static void main(String[] args) {
        String s = "abcdefghij";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }
}
