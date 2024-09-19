/*
242. Valid Anagram
Solved
Easy
Topics
Companies
Given two strings s and t, return true if t is an 
anagram
 of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false   
 */

public class s_Angram {
    public static boolean isAnagram(String s, String t) {

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(char ch : s.toCharArray()){
            arr1[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            arr2[ch-'a']++;
        }

        for(int i=0 ; i<26 ; i++) if(arr1[i] != arr2[i]) return false;

        return true;
    }
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
