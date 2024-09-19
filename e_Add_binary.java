/*
67. Add Binary
Easy
Topics
Companies
Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 */

// import java.util.*;
public class e_Add_binary {
    public static String addBinary(String a, String b) {
        // Make sure both strings are of equal length by padding the shorter one with leading zeros
        int l1 = a.length(), l2 = b.length();
        if (l1 > l2) {
            b = "0".repeat(l1 - l2) + b; // Add leading zeros to b
        } else if (l2 > l1) {
            a = "0".repeat(l2 - l1) + a; // Add leading zeros to a
        }
        System.out.println(a+" "+b);
        
        // StringBuilder to store the result
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        
        // Iterate over both strings from right to left
        for (int i = a.length() - 1; i >= 0; i--) {
            int num1 = a.charAt(i) - '0';  // Convert '0' or '1' to integer
            int num2 = b.charAt(i) - '0';  // Convert '0' or '1' to integer

            // Compute the sum and carry
            int total = num1 + num2 + carry;
            int digit = total % 2;  // Binary digit (either 0 or 1)
            carry = total / 2;      // Carry for the next iteration
            
            // Append the result digit to StringBuilder
            ans.append(digit);
        }
        
        // If there is any remaining carry, append it
        if (carry != 0) {
            ans.append(carry);
        }
        
        // The result is built in reverse order, so we need to reverse it
        return ans.reverse().toString();
    }
    
    public static String addBinary2(String a , String b){
        int l1=a.length(), l2=b.length();
        String temp = "";
        if(l1<l2) {
            while(l1++<l2) temp+='0';
            a = temp + a; 
        }
        else if(l2<l1) {
            while(l2++<l1) temp+='0';
            b = temp + b; 
        }
        l1 = a.length();

        int carry = 0;
        StringBuilder ans = new StringBuilder();
        for(int i=l1-1 ; i>=0 ; i--){
            int num1 = a.charAt(i) - '0';
            int num2 = b.charAt(i) - '0';
            int total = num1+num2+carry;
            int digit = total%2;
            carry = total/2;
            ans.append(digit);
        }
        if(carry != 0) ans.append(carry);
        return ans.reverse().toString();
        
        // System.out.println(a+" "+b);
        // return "";
    }

    public static void main(String[] args) {
        String a = "10110";
        String b = "1111111";
        System.out.println(addBinary(a, b));  // Output: "10101"
        System.out.println(addBinary2(a, b));  // Output: "10101"
    }
}
