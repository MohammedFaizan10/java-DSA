import java.util.*;
public class java_loops {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // while loop
        int counter = 0;

        while (counter < 31) {

            System.out.println("Java is my favourite language.");

            counter++;
            
        }

        // 1 PRINT NUMBER 1 TO 10

        int number = 1;

        while (number<=10) {
            System.out.print(number+" ");
            number++;
            
        }
        System.out.println();


        // 2 PRINT TILL 1 TO  N

        System.out.println("ENTER N VALUE : ");

        int range = sc.nextInt();

        int num = 1;

        while (num <= range) {
            System.out.print(num+" ");
            num++;
        }
        System.out.println();



        // problem : SUM OF N NATURAL NUMBERS 

        System.out.println("ENTER N VALUE: ");
        int range1 = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= range1) {

            sum = sum + i;
            i++;
            
        }

        System.out.println("SUM IS : "+sum);


        // FOR LOOP 

        for(int k = 1; k<=10 ; k++){
            System.out.println("Hello world");
        }


        // problem 1 : 

        for(int s=1; s<=4; s++){
            System.out.println("****");
        }

        // problem 2 : REVERSE OF NUMBER 

        System.out.println("ENTER NUMBER : ");
        int numr = sc.nextInt();
        


        for(int r=1; numr>0; r++){
            r = numr % 10;

            numr = numr/10;

            System.out.print(r);
            
            

        }
        System.out.println();


        // REVERSE A ORIGINAL NUMBER 

        System.out.println("ENTER NUMBER : ");
        int numb = sc.nextInt();
        
        int reverse = 0;

        while (numb>0) {

            int last_digit = numb%10;
            numb = numb/10;
            reverse = (reverse*10) + last_digit;
            
            
        }

        System.out.println(reverse);

        // BREAK KEYWORD  DISPLAY ALL NUMBERS FROM USER BREAK IF IT IS A MULTIPLE OF 10
        
        while (true) {

            System.out.print("ENTER YOUR NUMBER : ");
            int numbr1 = sc.nextInt();
            if (numbr1 % 10 == 0) {

                break;
                
            }
            System.out.println(numbr1);
            

            
        }
        System.out.println("OUT OF LOOP");


        // CONTINUE KEYWORD      SKIPING A ITERATION

        for(int k = 1; k<=5 ; k++){
            if(k==3){
                continue;
            }
            System.out.println(k);
        }


        // QUESTION ON CONTINUE KEYWORD     DISPLAY ALL NUMBERS FROM USER SKIP IF IT IS A MULTIPLE OF 10

        while(true){
            System.out.println("ENTER YOUR NUMBER : ");
            int numbx = sc.nextInt();
            if(numbx % 10 ==0){
                continue;
            }
            System.out.println(numbx);
        }


       




        
        
        

        


        
        

    }
}



