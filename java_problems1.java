import java.util.*;
public class java_problems1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // problem 1

        System.out.println("ENTER A:");
        int a = sc.nextInt();

        System.out.println("ENTER B:");
        int b = sc.nextInt();

        System.out.println("ENTER C:");
        int c = sc.nextInt();

        float ave = (a+b+c)/3;

        System.out.println("THE AVERAGE OF A,B,C IS : "+ave);


        // 2

        System.out.println("ENTER THE SIDE OF A SQUARE:");

        int side = sc.nextInt();

        int area_sq = side*side;

        System.out.println("THE AREA OF SQUARE IS : "+area_sq);


        // 3 Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
//  an eraser. You have to output the total cost of the items back to the user as their bill.

        System.out.println("ENTER COST OF PENCIL");
        float pencil = sc.nextInt();

        System.out.println("ENTER COST OF PEN");
        float pen = sc.nextInt();

        System.out.println("ENTER COST OF ERASER");
        float eraser = sc.nextInt();

        float total = pencil+pen+eraser;

        System.out.println("TOTAL COST OF ITEMS WITHOUT GST : "+total);

        double gst_total = (total)*0.18;

        double bill = total + gst_total;

        System.out.println("BILL : "+bill);


        // 4   What will be the type of result in the following Java code

        
     //     ANS : A DATATYPE WHICH HAS HIGHER CAPACITY (BYTE) IN EXPRESSION WILL HAS SAME DATATYPE OF RESULT 


       //  5 DOES IT GIVE ERROR : 

       int $ = 4;
       System.out.println($);
        


        
    }
}

