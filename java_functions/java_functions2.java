package java_functions;

import java.util.*;
public class java_functions2 {

    

    // METHOD / FUNCTION OVERLOADING  ( DIFFERENT PARAMETERS )

    public static int sum(int a , int b){
        return a+b;
    }

    public static int sum(int a , int b , int c){
        return a+b+c;
    }



    // METHOD/ FUNCTION OVERLOADING  ( DIFFERENT DATA TYPES )

    public static float sum(float a , float b){
        return a+b;
    }

    public static double sum(double a , double b){
        return a+b;
    }


    // CHECK IF A NUMBER IS PRIME OR NOT 

    public static boolean isPrime(int n){

        if(n == 2){
            // System.out.println("IT IS A PRIME NUMBER");
            return true;
        }
        else{
            boolean isprime = true;
            for(int i = 2 ; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    isprime = false;
                }
            }

            if(isprime==true){
                return true;
                // System.out.println("IT IS  A PRIME NUMBER");
            }
            else{
                // System.out.println("IT IS NOT A PRIME NUMBER");
                return false;
            }
        }
        
    }

    // public static boolean isPrime(int n){
    //     if(n == 2){
    //         return true;
    //     }
    //     else{                                                // CHECKING FOR COMPOSITE RETURN FALSE
    //         for(int i = 2; i<= Math.sqrt(n); i++){
    //             if(n % i == 0){
    //                 return false; 
    //             }
    //         }
    //     }
    //                                       //   IF NOT COMPOSITE OUT OF LOOP GIVES TRUE
    //     return true;           // FOR PRIME TRUE
        
        // PRIME IN RANGE 

        public static void rangePrime(int n){
            for(int i = 2 ; i < n; i++){
                if(isPrime(i) == true){
                    System.out.print(i+" ");
                }


            }
            System.out.println();

            
        }

        // BINARY TO DECIMAL 

        public static void binaryToDecimal(int n){
            int bin_num = n;    // OPTIONAL
            int decimal = 0;
            int pow = 0;
            while(n>0){
                int lastdigit = n % 10;
                n = n / 10;
                decimal = (int) (decimal + (lastdigit * Math.pow(2, pow)));     // Math.pow returns in double so we have cast it into int
                pow++;
            }
            System.out.println("decimal no of binary "+bin_num+" is "+decimal);
        }


        public static void decimalToBinary(int n){
            int dec_num = n;         // OPTIONAL
            int binary = 0;
            int pow = 0; 
            while(n>0){
                int rem = n % 2;
                binary = (int) (binary + rem * Math.pow(10, pow));
                n = n/2;
                pow++;
            }
            System.out.println("Binary number of "+dec_num+" is "+binary);
        }



        // QUESTIONS 1 AVERAGE 

        public static void averageNumber(int a , int b , int c){
            int average = (a + b + c)/3;

            System.out.println(average);
        }


        // 2 isEven 

        public static boolean isEven(int n){
            if(n % 2 ==0){
                return true;
            }
            else{
                return false;
            }
        }

        // 3 palindrome

        public static void isPalindrome(int n){
            int original = n;
            int reverse = 0;
            while(n>0){
                int lastdigit = n % 10;
                reverse = reverse*10 + lastdigit;
                n = n/10;
            }
            if (original == reverse){
                System.out.println("IT IS A PALINDROME");
            }
            else{
                System.out.println("IT IS NOT A PALINDROME");
            }

            }


            // 4 METHODS OF MATH

            public static void methodOfMath(int a , int b , int c, int n , int k){
                int minimum = Math.min(a, b);
                System.out.println("MINIMUM OF "+a+ " AND "+b+" IS "+minimum);
                int maximum = Math.max(a, b);
                System.out.println("MAXIMUM OF "+a+" AND "+b+" IS "+maximum);
                double squareroot = Math.sqrt(c);
                System.out.println("SQUAREROOT OF "+c+" IS "+squareroot);
                double powerofnum = Math.pow(n, 2);
                System.out.println("POWER(2) OF "+n+" IS "+powerofnum);
                int abstractnum = Math.abs(k);
                System.out.println("ABSTRACT VALUE OF "+k+" IS "+abstractnum);
            }


            // 5 SUM OF THE DIGITS

            public static void sumOfDigits(int n){
                int sum = 0;
                while(n>0){
                    int lastdigit = n % 10;
                    sum = sum + lastdigit;
                    n = n/10;
                }
                System.out.println("SUM OF DIGITS IS "+sum);
            }
        
        



            // MAIN FUNCTION
    public static void main(String[] args) {
        System.out.println("SUM OF TWO : "+sum(4,6));
        System.out.println("SUM OF THREE : "+sum(2,6,12));

        System.out.println("SUM OF TWO FLOAT NUMBERS : "+sum(2.3f, 2.7f));
        System.out.println("SUM OF TWO DOUBLE NUMBERS : "+sum(14.5,15.5));

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER YOUR NUMBER : ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        rangePrime(100);
        binaryToDecimal(1000);
        decimalToBinary(8);
        averageNumber(10, 10, 10);
        System.out.println(isEven(6));
        isPalindrome(321);
        methodOfMath(15, 12, 4, 3, -17);
        sumOfDigits(145);
        
        
    }
}
