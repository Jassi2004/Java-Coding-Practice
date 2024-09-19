/*
43. Multiply Strings
Solved
Medium
Topics
Companies
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

 

Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"

 */
public class f_Multiply_String {
    public static String multiply(String s1, String s2){
    int l1=s1.length(), l2=s2.length();
    int[] arr = new int[l1+l2];
    for(int i=0 ; i<l1+l2 ; i++) arr[i] = 0;
    
    for(int i=0 ; i<l1 ; i++){
        for(int j=0 ; j<l2 ; j++){
            int pdt = (s1.charAt(i)-'0') * (s2.charAt(j)-'0');
            int sum = arr[i+j+1] + pdt;
            arr[i+j+1] = sum%10;
            arr[i+j] += sum/10;
        }
    }
    StringBuilder ans = new StringBuilder();
    boolean leadingZero = true;
    for (int num : arr) {
        if (num == 0 && leadingZero) {
            continue;  // Skip leading zeros
        }
        leadingZero = false;
        ans.append(num);
    }

        return ans.toString();
    }

    // public static String multiply(String s1, String s2) {
    //     if(s1.equals("0") || s2.equals("0")) {
    //         System.out.println("Yes");
    //         return "0";
    //     }
    //     int l1=s1.length(), l2=s2.length();
    //     int[] arr = new int[l1+l2];
    //     for(int i=0 ; i<l1+l2 ; i++) arr[i] = 0;
        
    //     for(int i=0 ; i<l1 ; i++){
    //         for(int j=0 ; j<l2 ; j++){
    //             int pdt = (s1.charAt(i) - '0') * (s2.charAt(j) - '0');
    //             // System.out.print(pdt + " ");
    //             arr[i+j+1] += pdt;
    //         }
    //     }
    //     for(int i=0 ; i<l1+l2 ; i++) {System.out.println(arr[i]);}
    //     StringBuilder ans = new StringBuilder();
    //     for(int i=l1+l2-1 ; i>=0 ; i--) {
    //         int digitToPush = arr[i] % 10;
    //         int digitToCarry = arr[i] / 10;

    //         ans.append(digitToPush);
    //         System.out.println("digitToPush: "+digitToPush+" digitToCarry: "+digitToCarry+" ans: "+ans);
    //         if(i!=0) arr[i-1] += digitToCarry;
    //     }
    //     // String finalAns;
    //     if(arr[0] == 0) {
    //         ans.deleteCharAt(l1+l2-1);
    //         // finalAns = ans.toString();
    //         // finalAns.substring(0 , l1+l2);
    //     }
        
    
    //     return ans.reverse().toString();
    // }
    public static void main(String[] args) {
        String num1 = "123", num2 = "456";
        System.out.println(multiply(num1, num2));
        num1 = "9";
        num2 = "9";
        System.out.println(multiply(num1, num2));
        num1 = "1";
        num2 = "2";
        System.out.println(multiply(num1, num2));
        num1 = "9133";
        num2 = "0";
        System.out.println(multiply(num1, num2));
    }
}
