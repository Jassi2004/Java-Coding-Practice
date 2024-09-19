/*
1750. Minimum Length of String After Deleting Similar Ends
Solved
Medium
Topics
Companies
Hint
Given a string s consisting only of characters 'a', 'b', and 'c'. You are asked to apply the following algorithm on the string any number of times:

Pick a non-empty prefix from the string s where all the characters in the prefix are equal.
Pick a non-empty suffix from the string s where all the characters in this suffix are equal.
The prefix and the suffix should not intersect at any index.
The characters from the prefix and suffix must be the same.
Delete both the prefix and the suffix.
Return the minimum length of s after performing the above operation any number of times (possibly zero times).
 */

public class n_Minimum_Length_of_String_After_Deleting_Similar_Ends {
    public static int minimumLength(String s) {
        int i=0 , j=s.length()-1;
        while (i<j) {
            if(s.charAt(i) == s.charAt(j)){
                char ch = s.charAt(i);
                while (i<s.length() && s.charAt(i) == ch) {
                    i++;
                }
                    // System.out.println("i: "+i);
                while (i<j && s.charAt(j) == ch) {
                    j--;
                }
                    // System.out.println("j: "+ j);
            }
            else return j-i+1;
        }
        return j-i>=0 ? j-i+1 : 0;
    }
    public static void main(String[] args) {
        // String s = "abc";/
        String s = "cabaabac";
        System.out.println(minimumLength(s));
    }
}
