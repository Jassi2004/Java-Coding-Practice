
class Main
{
    public static String giveName(String s){
        String sAns;
        sAns = s.replace(' ' , '_');
        return sAns;
    }
    public static void methodA() 
    {
      System.out.println("Enter methodA()");
      try 
      {
        System.out.println(1 / 0);
        // A divide-by-0 triggers an ArithmeticException - an unchecked exception
        // This method does not catch ArithmeticException
        // It runs the "finally" and popped off the call stack
      } catch(ArithmeticException e){
        System.out.println("ari exep: " + e);
      } finally 
      {
        System.out.println("finally in methodA()");
      }
      System.out.println("Exit methodA()");
    }
    public static void main(String[] args)
    {
        String str = "x Finding CB Numbers";
        String s = giveName(str);
        System.out.println(s);

        

    }
}

