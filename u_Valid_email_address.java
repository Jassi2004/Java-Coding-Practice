/*
Valid email address bookmark_border
Check an email-id for following exceptions

if id does not contain '@' OR
if id does not contain '.' (dot) OR
if no '.' (dot) appears after '@'
catch the exception and print "Invalid" or "Valid" accordingly.
 */

import java.util.Scanner;

class noAtTheRate extends Exception{
    public noAtTheRate(){
        super("Invalid");
    }   
}
class noDot extends Exception{
    public noDot(){
        super("Invalid");
    }
}
class noDotAfterAtTheRate extends Exception{
    public noDotAfterAtTheRate(){
        super("Invalid"); 
    }
}
public class u_Valid_email_address {
    public static void checkValidEmail(String s) throws noDot, noAtTheRate, noDotAfterAtTheRate 
    {
        boolean atTheRatePresent=false, dotPresent=false, dotAfterAtTheRate=false;
        for(int i=0 ; i<s.length() ; i++)
        {
            if(s.charAt(i) == '@')
            {
                atTheRatePresent = true;
            }
            else if(s.charAt(i) == '.'){
                dotPresent = true;
            }
            
            if(atTheRatePresent){
                if(s.charAt(i) == '.') dotAfterAtTheRate = true;
            }
        }

        if(!atTheRatePresent) throw new noAtTheRate();
        else if(!dotPresent) throw new noDot();
        else if(!dotAfterAtTheRate) throw new noDotAfterAtTheRate();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        try
        {
            checkValidEmail(email);
            System.out.println("Valid");
        } 
        catch (noAtTheRate e)
        {
            System.out.println("Invalid");
        }
        catch (noDot e){
            System.out.println("Invalid");
        }
        catch (noDotAfterAtTheRate e){
            System.out.println("Invalid");
        }
        sc.close();
    }
}
