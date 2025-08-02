import java.util.*;
public class java_conditional {

    public static void main(String[] args) {
        int a = 1;
        int b = 3;

        if (a>b){
            System.out.println("A IS GREATER AMONG TWO  " +a);

        } else {
            System.out.println("B IS GREATER AMONF TWO "+b);
        }

        // 2
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER :");
        int c = sc.nextInt();

        if (c % 2 == 0){
             System.out.println("IT IS A EVEN NUMBER");
       } else {
            System.out.println("IT IS AN ODD NUMBER");
        }


        // // 3

        // System.out.println("ENTER YOUR INCOME :");

        // int inc = sc.nextInt();
        // int tax = 0;

        // if (inc < 500000) {
        //     tax = 0;
        // }

        // else if (inc >= 500000 && inc <= 100000){
        //     tax = (int)(inc * 0.2);
        // }

        // else if (inc > 100000){
        //     tax = (int)(inc * 0.3);
        // }

        // else{
        //     System.out.println("INVALID INCOME");
        // }

        // System.out.println("YOUR TAX IS : "+ tax);



        // // LARGEST AMONG THREE 

        // int num1 = 1;
        // int num2 = 8;
        // int num3 = 6;

        // if (num1 >= num2 && num1 >= num3) {

        //     System.out.println("LARGEST IS NUM 1");
            
        // }

        // else if (num2 >= num1 && num2 >= num3) {

        //     System.out.println("LARGEST IS NUM2");
            
        // }

        // else{
        //     System.out.println("LARGEST IS NUM3");
        // }
            
        // // Ternary Operator 

        // System.out.println("ENTER STUDENT MARKS : ");
        
        // int marks = sc.nextInt();

        // String result = (marks >= 33)? "PASS" : "FAIL";

        // System.out.println("YOUR RESULT IS : "+result);


        // // SWITCH STATEMENT

        // System.out.println("ENTER YOUR CHOICE: ");

        // int choice = sc.nextInt();

        // switch (choice) {
        //     case 1: System.out.println("ARTIFICIAL INTELLIGENCE");
        //         break;
        //     case 2: System.out.println("FULL STACK DEVELOPMENT");
        //         break;
        //     case 3: System.out.println("CYBER SECURITY");
        //         break;
        //     case 4: System.out.println("DEEP LEARNING");
        //         break;
        //     default: System.out.println("INVALID CHOICE");
        //         break;
        // }


        // // CALCULATOR :

        // System.out.println("ENTER YOUR VALUES A AND B");

        // System.out.println("ENTER A: ");
        // int a1 = sc.nextInt();

        // System.out.println("ENTER B: ");
        // int b1 = sc.nextInt();

        // System.out.println("ENTER OPERATOR: ");
        // char operator = sc.next().charAt(0);

        // switch (operator) {
        //     case '+' : System.out.println(a1+b1);
        //         break;
        //     case '-' : System.out.println(a1-b1);
        //         break;
        //     case '*' : System.out.println(a1*b1);
        //         break;
        //     case '/' : System.out.println(a1/b1);
        //         break;
        //     case '%' : System.out.println(a1%b1);
        //         break;
        //     default:System.out.println("INVALID OPERATOR");
        //         break;
        // }


        // 1  Write a Java program to get a number from the user and print whether it is 
            // positive or negative.

        System.out.println("ENTER YOUR NUMBER : ");

        int num_1 = sc.nextInt();

        if(num_1>0){
            System.out.println("NUMBER IS POSITIVE");
        }
        else if (num_1 == 0) {
            System.out.println("NUMBER IS ZERO");
        }

        else{
            System.out.println("NUMBER IS NEGATIVE");
        }

        //  CHECK FEVER OR NOT 

        System.out.println("ENTER YOUR TEMPERATURE : ");

        double temp = sc.nextDouble();

        // ternary

        String status = (temp>100)? "YOU HAVE FEVER" : "YOU DONT ANY FEVER";

        System.out.println(status);


        //  Write a Java program to input week number(1-7) and print day of week name 
        // using switch case. 
         

        System.out.println("ENTER YOUR WEEK DAY : ");

        int week_day = sc.nextInt();

        switch (week_day) {
            case 1: System.out.println("MONDAY");
                break;
            case 2: System.out.println("TUESDAY");
                break;
            case 3: System.out.println("WEDNESDAY");
                break;
            case 4: System.out.println("THURSDAY");
                break;
            case 5: System.out.println("FRIDAY");
                break;
            case 6: System.out.println("SATURDAY");
                break;
            case 7: System.out.println("SUNDAY");
                break;
        
            default: System.out.println("INVALID DAY NUMBER");
                break;
        }
        
        // 4

        int a2 = 63, b2 = 36; 
        boolean x1 = (a2 < b2 ) ? true : false; 
        int y1 = (a2 > b2 ) ? a2 : b2;  
        System.out.println(x1);
        System.out.println(y1);


        // 5 LEAP YEAR OR NOT 

        System.out.println("ENTER YOR YEAR : ");

        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0  || year % 400 == 0) {

            System.out.println(+year+" IS A LEAP YEAR");
            
        }else {
            System.out.println("NOT A LEAP YEAR");
        }


    }

}
