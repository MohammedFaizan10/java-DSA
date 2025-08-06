import java.util.*;
public class java_patterns {
    public static void main(String[] args) {
        
        // PATTERNS WITH NESTED LOOPS 

        // PATTERN 1 :

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int n = sc.nextInt();

        for(int line = 1; line<=n ; line++){           // 1  --> 4  UNTIL CONDITION FAILS
            for(int star=1; star<=line; star++){           // 2
                System.out.print("*");                         // 3
            }
            System.out.println();                   // 4
        }


        // PATTERN 2 :

        // System.out.println("ENTER YOUR NUMBER : ");
        // int num = sc.nextInt();

        // for (int i = 1 ; i<=num ; i++){
        //     for(int j = 1; j<=num-i+1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // HALF-PYRAMID PATTERN

        // System.out.println("ENTER YOUR NUMBER : ");
        // int numb = sc.nextInt();

        // for(int i = 1 ; i<=numb ; i++){
        //         for(int j = 1; j<=i ; j++){
        //             System.out.print(j);
        //         }
        //         System.out.println();
        // }

        // CHARACTER PATTERN 

        System.out.println("ENTER YOUR NUMBER : ");
        int numx = sc.nextInt();
        char ch = 'A';
        for(int i = 1; i<=numx; i++ ){
            for(int j = 1; j <=i ; j++){
                
                System.out.print(ch);
                ch++;                       // INCREMENTING CH VALUE
            }
            System.out.println();
        }
    }
}


