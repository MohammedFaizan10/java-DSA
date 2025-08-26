public class java_TwoDArray {

    public static int diagonalSum(int matrix[][]){
        // int sum = 0;

        // for(int i = 0 ;i < matrix.length ; i++){
        //     for(int j = 0 ; j < matrix[0].length; j++){
        //         if(i == j){
        //             sum += matrix[i][j];   // primary diagonal 
        //         }
        //         else if(i + j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // return sum;

        // OPTIMIZED

        int sum = 0 ;
        for(int i = 0 ; i < matrix.length ; i++){
            // primary diagonal 
            sum += matrix[i][i];

            // secondary diagonal 
            if(i != matrix.length-i-1){
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }

    public static void spiralMatrix(int matrix[][]){
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while(startrow<= endrow && startcol <= endcol){
            for(int j = startcol; j <=endcol; j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            for(int i = startrow + 1; i <= endrow; i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            for(int j = endcol - 1 ; j >= startcol ; j--){
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            for(int i = endrow - 1; i >= startrow+1; i--){
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }

            startrow++;
            startcol++;
            endcol--;
            endrow--;
        }
        System.out.println();
    }

    public static boolean stairCase(int matrix[][], int key){
        int row = 0;
        int col = matrix[0].length-1;

        while(row <= matrix.length-1 && col >= 0){
            if(key == matrix[row][col]){
                System.out.println("KEY IS FOUND AT ("+row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;                            //left
            }
            else{
                row++;                 // key > matrix[row][col]
            }

        }
        System.out.println("KEY IS NOT FOUNDED");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};

        System.out.println(diagonalSum(matrix));

        spiralMatrix(matrix);

        int key = 10;
        stairCase(matrix, key);
                    }
}
