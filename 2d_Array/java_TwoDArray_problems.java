import java.util.*;
public class java_TwoDArray_problems {
    //1 

    public static void numberofnum(int array[][] , int key){
        int row = 0 ;
        int col = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == key) {
                    sum++;
                }
            }
        }

        System.out.println("No of times the key is available is : "+sum);
    }

    // 2  sum of specific row

    public static void sumOfRow(int nums[][], int row){
        int sum = 0;
        for(int i = 0; i<nums.length ; i++){
            for(int j = 0 ; j<nums[0].length; j++){
                if( i == row){
                    sum += nums[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    // TRANSPOSE OF MATRIX

    public static void transpose(int array[][]){

        int row = array.length;
        int col = array[0].length;
        int transpose[][] = new int[col][row];
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j< array[0].length; j++){
                transpose[j][i] = array[i][j];
            }
        }

        for(int i = 0 ; i < transpose.length ; i++){
            for(int j = 0 ; j< transpose[0].length; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
         int array[][] = { {4,7,8},{8,8,7} };
         Scanner sc = new Scanner(System.in);
         System.out.println("ENTER KEY : ");
         int key = sc.nextInt();
         numberofnum(array, key);

        int nums[][] = { {1,4,9},{11,4,3},{2,2,3} };
        System.out.println("ENTER ROW : ");
        int row = sc.nextInt();                   // NOTE : ROWS ARE START FROM 0
        sumOfRow(nums, row);

        transpose(array);
    }
}
