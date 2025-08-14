import java.util.*;
public class java_Arrays {
    
    public static void update(int marks[] , int unchange){
        unchange = 10;

        for(int i = 0; i<marks.length ;i++){
            marks[i] = marks[i] + 1;
        }
    }



    public static void main(String[] args) {

        // // method 1
        // int num1[]=  new int[50];

        // //method 2
        // int num[] = {1 , 2 ,3};

        // String fruits[] = {"mango" , "apple" , "orange"};

        // int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // int Percentage = (marks[0] + marks[1] + marks[2])/3;

        // System.out.println("Percentage : "+Percentage+"%");

        // System.out.println("Array length : "+marks.length);


        int marks[] = new int[50];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        int unchange = 5;

        update(marks,unchange);

        System.out.println("unchange : "+unchange);

        System.out.println("marks 1 : "+marks[0]);
        System.out.println("marks 2 : "+marks[1]);
        System.out.println("marks 3 : "+marks[2]);
        


    }
}

