import java.util.*;
public class loops_problems {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        // problem 1 :CHECK WHETHER THE NUMBER IS PRIME OR NOT 

        System.out.println("ENTER YOUR NUMBER : ");
        int n = sc.nextInt();

        if(n == 2){
            System.out.println("IT IS A PRIME NUMBER");
        }
        else{
            boolean isprime = true;
            for(int i = 2 ; i <= Math.sqrt(n) ; i++){      // ROOT N TAK HI FACTORS UNIQUE REHTE HAI USKE BAAD REPEATS HOTE HAI I<=ROOT N (FAST) OR I<=N-1 (SLOW)  DONO BHI CORRECT HAI
                if (n % i==0) {
                    isprime = false;
                }
            }
            if(isprime == true){
                System.out.println("IT IS A PRIME NUMBER");
            }
            else{
                System.out.println("IT IS NOT A PRIME NUMBER");
            }
        }


        // problem : 2  HOW MANY TIMES HELLO WILL BE PRINTED 

        for(int i = 0 ; i < 5 ; i++){
            System.out.println("hello");

            i+=2;
            
        }

        //  problem 3 : Write a program that reads a set of integers, and then prints the sum of the 
// even and odd integers.

        int number;
        int choice = 1;
        int even_num=0;
        int odd_num=0;

        while(choice==1){
            System.out.println("ENTER YOUR NUMBER  : ");
            number = sc.nextInt();
            if(number % 2 == 0){
                even_num+=number;
            }
            else{
                odd_num+=number;
            }
            System.out.println("IF YOU WANT TO CONTINUE PRESS 1 OR ELSE PRESS 0");
            choice = sc.nextInt();

        }

        System.out.println("SUM OF EVEN NUMBERS : "+even_num);
        System.out.println("SUM OF ODD NUMBERS : "+odd_num);


        // 3 Write a program to find the factorial of any number entered by the user. 

        System.out.println("ENTER YOUR NUMBER : ");
        int num = sc.nextInt();

        int factorial = 1;

        if(num>=0){
            for(int i = 1; i <= num ; i++){
                factorial *=i;
            }
        }
        else{
            System.out.println("INVALID NUMBER");
        }

        System.out.println(factorial);


        //  Write a program to print the multiplication table of a number N, entered by the 
// user.

        System.out.println("ENTER THE FOR MULTIPLICATION TABLE OF IT : ");
        int numx = sc.nextInt();
        int i = 1;
        while (i<=10) {

            System.out.println(numx +" X "+i+" = "+numx*i);
            i++;
            
        }


        
        
    }
    
}



