import java.util.*;
public class java_bitwise_sol {

    public static void xorOpertator(int n){
        System.out.println(n = n ^ n);                  // ALWAYS GIVES ZERO
        System.out.println("IT ALWAYS GIVES THE ZERO ANSWER ");
    }

    public static void swappingTech(int x , int y){
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("the swapped values are X = "+x+" Y = "+y);
    }


    public static void addone(int a){
        System.out.println("THE VALUE OF INTEGER AFTER ADDING ONE IN IT : "+ -(~a));
    }

    public static void convertUpperToLow(){
        for(char ch = 'A' ; ch <= 'Z' ; ch++){
            System.out.print((char)(ch | ' '));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR N : ");
        int n = sc.nextInt();
        xorOpertator(n);
        System.out.println("enter x value : ");
        int x = sc.nextInt();
        System.out.println("enter y value : ");
        int y = sc.nextInt();
        swappingTech(x, y);
        System.out.println("enter your number : ");
        int a = sc.nextInt();
        addone(a);
        convertUpperToLow();
    }
}
