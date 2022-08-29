public class Ex1 {
    public static int result1 = 0;
    static int subsum(int n){
      ; 
        if (n == 1){  //base case
            return 1;
        }
        else if (n > 1){ // general case 
          result1 = (int)result1 + (int)(Math.pow(-1,(n+1)) * n) + (int)subsum(n-1);
        }
        return result1;
    }

    // public static String sumdigit(String n ){
    static int sumDigit(int n){
        // String n_input = String.valueOf(n);
        if (n < 10){ // base case 
            return n;
        }else if (n>=10){ //general case 
            return sumDigit(n/10)+n%10;
        }
        return n;
    }


    public static void main(String[] args) {
        // System.out.println(subsum(0));
        // System.out.println(sumdigit(64227828));

        // Test Uncomment these lines below to test your subsum code
                
                 System.out.println("Calculating subsum(10):");
		        System.out.println("Your answer is "+subsum(10));
                 System.out.println("The correct answer is -5");
                 System.out.println("-----------------------"); 
              

            // Uncomment these lines below to test your sumDigit code
             
                 System.out.println("sumDigit(123456789)");
		        System.out.println("Your answer is "+ sumDigit(123456789));
                 System.out.println("The correct answer is 45");
           
    }
}
