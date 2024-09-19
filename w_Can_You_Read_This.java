import java.util.Scanner;

public class w_Can_You_Read_This 
{
    public static void help(String s)
    {
        StringBuilder word = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++)
        {
            
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                if(word.length() != 0)
                {
                    System.out.println(word);
                }
                StringBuilder empty = new StringBuilder();
                word = empty;
                // word.append(s.charAt(i));
            }
            
            word.append(s.charAt(i));
        }
        System.out.println(word);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        help(s);
        sc.close();
    }
}
