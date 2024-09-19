/*
 * 
2047. Number of Valid Words in a Sentence
Easy
Topics
Companies
Hint
A sentence consists of lowercase letters ('a' to 'z'), digits ('0' to '9'), hyphens ('-'), punctuation marks ('!', '.', and ','), and spaces (' ') only. Each sentence can be broken down into one or more tokens separated by one or more spaces ' '.

A token is a valid word if all three of the following are true:

It only contains lowercase letters, hyphens, and/or punctuation (no digits).
There is at most one hyphen '-'. If present, it must be surrounded by lowercase characters ("a-b" is valid, but "-ab" and "ab-" are not valid).
There is at most one punctuation mark. If present, it must be at the end of the token ("ab,", "cd!", and "." are valid, but "a!b" and "c.," are not valid).
Examples of valid words include "a-b.", "afad", "ba-c", "a!", and "!".

Given a string sentence, return the number of valid words in sentence.
 */

public class k_Number_of_valid_words_in_a_sentence {
    public static boolean isAlphabet(char ch){
        return (ch>='a' && ch<='z');
    }
    public static boolean isPunctuation(char ch){
        return ch=='!' || ch=='.' || ch==',';
    }     
    public static boolean isHyphen(char ch){
        return ch=='-';
    } 
    public static boolean isValid(String s){
        int n = s.length();
        int hyphenCount = 0;
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(isAlphabet(ch)) continue;
            else if(isHyphen(ch)){
                hyphenCount++;
                if(hyphenCount > 1) return false;
                if(i!=0 && i!= n-1 && isAlphabet(s.charAt(i-1)) && isAlphabet(s.charAt(i+1))) continue;
                else return false;
            }
            else if(isPunctuation(ch)){
                if(i != n-1) return false;
            } 
            else return false;
        }

        return true;
    }
    public static int countValidWords(String sentence) {
        int ans = 0;
        String[] arr = sentence.split(" ");
        for(int i=0 ; i<arr.length ; i++){
            String word = arr[i].trim();
            // System.out.println('-'+word+'-'+" word.len: "+word.length());
            if(word.length()!=0 && isValid(word)){
                ans++;
                // System.out.println("valid word: "+ word);
            }  
        }
        return ans;
    }
    public static void main(String[] args) {
        String sentence = "!this  1-s b8d! cat";
        System.out.println(countValidWords(sentence));
    }
}
