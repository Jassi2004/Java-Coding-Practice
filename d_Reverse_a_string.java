
public class d_Reverse_a_string {
    static String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1 ; i>-1 ; i--) sb.append(s.charAt(i));
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(reverseString(s));
    }
}
