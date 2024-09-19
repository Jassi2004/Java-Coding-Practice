    import java.util.StringTokenizer;

    public class h_Apply_Discount_to_prices {

        public static boolean isNum(String s){
            int periodCount = 0;
            for(int i=1 ; i<s.length() ; i++){
                char digit = s.charAt(i);
                if((digit<='9' && digit>='0')) continue;
                if (digit == '.' && periodCount == 0) {
                    periodCount++;
                    continue;
                }
                else return false;
            }
            if(s.length() == 1) return false;
            return true;
        }
    
        public static double giveCleanAmount(String s){
            String str = "";
            for(int i=1 ; i<s.length() ; i++){
                str += s.charAt(i);
            }
            System.out.println(str);
            double x = Double.parseDouble(str);
            return x;
        }   

        public static String discountPrices(String s, int d) {

            StringTokenizer st = new StringTokenizer(s);
            StringBuilder finalAns = new StringBuilder();

            while(st.hasMoreTokens()){
                String word = st.nextToken();
                if(word.charAt(0) == '$'){
                    String potentialAmount = word.toString();
                    if(isNum(potentialAmount)){

                        double amount = giveCleanAmount(potentialAmount);
                        double amountAfterDiscount = (amount - amount*(d/100.0));
                        String amountString = String.format("$%.2f", amountAfterDiscount);
                        // amountString += amountAfterDiscount + "0";
                        finalAns.append(amountString);
                    } 
                    else {
                        finalAns.append(word);
                    }
                } 
                else {
                    finalAns.append(word);
                }


                if(st.hasMoreTokens()) finalAns.append(" ");
            }


            return finalAns.toString();
        }
        public static void main(String[] args) {
            String s = "1 2 $3 4 $5 $6 7 8$ $9 $10$";
            int d = 50;
            System.out.println(discountPrices(s , d));
        }
    }
