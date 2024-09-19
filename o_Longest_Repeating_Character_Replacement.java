/*
424. Longest Repeating Character Replacement
Medium
Topics
Companies
You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.

 

Example 1:

Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.
Example 2:

Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.
 */

public class o_Longest_Repeating_Character_Replacement {
    public static int characterReplacement(String s, int k) {

        int l=0, maxFreq=0, maxLen=0;
        int[] count = new int[26];
        for(int r=0 ; r<s.length() ; r++){
            count[s.charAt(r) - 'A']++;
            maxFreq = Math.max(maxFreq, count[s.charAt(r) - 'A']);

            int currLenOfSubarray = r-l+1;

            if(currLenOfSubarray - maxFreq > k){
                count[s.charAt(l)]--;
                l--;
            }

            maxLen = Math.max(maxLen, r-l+1);
        }
        

        return maxLen;
    }
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s, k));
    }
}
