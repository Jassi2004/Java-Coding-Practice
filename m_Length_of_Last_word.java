public class m_Length_of_Last_word {
    public static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length-1].trim().length();

    }
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
