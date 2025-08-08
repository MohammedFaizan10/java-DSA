import java.util.*;
public class java_functions {

    public static void printHelloWorld(){

        System.out.println("Hello World");
        System.out.println("Have a good day");


    }

    public static int sum(int num1, int num2){        //    PARAMETERS KE NAAM ALAG REH SAKTE HAI
        int sum = num1 + num2;                           // ALAG SUM HAI 
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printHelloWorld();
        System.out.println("ENTER A : ");
        int a = sc.nextInt();
        System.out.println("ENTER B : ");
        int b = sc.nextInt();

        int sum = sum(a , b);                            // YE ALAG SUM HAI
        System.out.println("THE SUM IS : "+sum);

        System.out.println("ENTER C VALUE : ");
        int c = sc.nextInt();                                   // c value
        System.out.println("ENTER D VALUE : ");
        int d =  sc.nextInt();                                  // d value

        int prod = product(c, d);                    // (c,d)   == ARGUMENTS
        System.out.println("MULTIPLICATION OF C AND D IS : "+prod);

        prod = product(10, 5);
        System.out.println("AGAIN MULTIPLICATION WITH DIFFERENT VALUES : "+prod);

        
        int factorial = fact(5);
        System.out.println("FACTORIAL : "+factorial);

        

        int bino = binomial(5, 2);
        System.out.println("BINOMIAL COEFFICIENT OF N AND R IS : "+bino);




    }

    // PRODUCT OF A AND B

    public static int product(int c , int d){                // copy of values actual c and d
        int multiply = c*d;
        return multiply;
    }

    // FACTORIAL 

    public static int fact(int n){
        int f = 1;
        
        for(int i = 1; i<=n; i++){
            f = f * i;
             
        }
        return f;

    }

    // BINOMIAL COEFFICIENT       JUST USING FACTORIAL FUNCTION IN IT 

    public static int binomial( int n , int r){
        int nfact = fact(n);                                // EK FUNCTION MEIN DUSRA FUNCTION CALL KARSAKTE 
        int rfact = fact(r);                      
        int n_minus_r = fact(n-r);
        int binomial_coefficient = nfact/(rfact * n_minus_r);
        return binomial_coefficient;
    }


    
}
