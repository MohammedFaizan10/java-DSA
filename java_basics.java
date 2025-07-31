import java.util.*;
public class java_basics {

    static int add(int a, int b){
        return a+b;
    }


    public static void main(String[] args) {
        System.out.println("faizan");
        System.out.println("hi");
        System.out.println("Addition of two : " +add(10, 250));
        System.out.println("\n");
        
        System.out.println("PATTERN PRINTING");  // BASIC PATTERN

        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
          
        System.out.println("Data Types:");
        System.out.println("\n");
        byte f = 8;
        System.out.println(f);
        char ch = 'd';
        System.out.println(ch);
        boolean var = true;
        System.out.println(var);
        float fl =  (float) 1.0;
        System.out.println(fl);
        int number = 100;
        System.out.println(number);
        long big_no = 10000;
        System.out.println(big_no);
        double big_float = 10.67677;
        System.out.println(big_float);
        short sh = 120;
        System.out.println(sh);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Comment:");

        String Comm = sc.nextLine();
        System.out.println("Comment: "+Comm);


        int product = a*b;
        int sum = a+b;
        System.out.println("Sum :"+sum);
        System.out.println("Prodect of A and B : "+product);


        System.out.println("AREA OF CIRCLE");

        System.out.println("Enter Radius:");
        float rd = sc.nextFloat();
        
        double area_circle = (3.14)*(rd)*(rd);

        System.out.println("The Area of circle : "+area_circle);


        // TYPE CONVERSION                       SMALL DATATYPES CONVERTED IN LARGE DATATYPES 

        int num3 = 33;
        long num4 = num3;


        // TYPE CASTING 

        float num1 = 25.74f;
        int num2 = (int)num1;
        System.out.println(num2);



    }


        



}
