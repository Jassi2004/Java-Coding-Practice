public class l_Replace_every_uppercase_letter_with_same_lowercase_latter {


    public static String replace(String s){
        String ans = "";
        for(int i=0; i<s.length() ; i++){
            if(s.charAt(i)>='A' &&s.charAt(i)<='Z') ans += Character.toLowerCase(s.charAt(i));
            else ans += s.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "abycekiILNBUClknbsiBKDUALnclkbdajfe";
        System.out.println(replace(s));
    }
}
