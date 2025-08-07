public class java_patterns_02 {

    public static void hollow_Rectagle(int total_rows, int total_cols){

        // OUTER LOOP
        for(int i = 1 ; i<=total_rows ; i++){
            for(int j = 1 ; j<=total_cols; j++){              // INNER LOOP    // CELL (I,J)   
                
                //BOUNDRY CONDITION
                if(i == 1 || i == total_rows || j == 1 || j == total_cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

// halfPyramid pattern
    public static void halfPyramid(int n){            // n is for lines/rows
        for(int i = 1; i<=n ; i++){
            for(int j = 1 ; j <= n-i; j++){            // spaces
                System.out.print(" ");
                }
            for(int k = 1; k<=i ; k++){              // stars
                System.out.print("*");
            }
            System.out.println();
        }

            System.out.println();
        }

        public static void numHalfPyramid(int n){
            
            for(int i = 1 ; i<=n ; i++){
                for(int j = 1; j<=n-i+1 ; j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

// Floyd Triangle
        public static void floydTriangle(int n){
            int num = 0;
            for(int i = 1 ; i<=n ; i++){
                for(int j = 1; j<=i; j++){
                    num++;
                    System.out.print(num+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

// ZeroOne Pattern
        public static void zeroOne(int n){
            for(int i = 1 ; i<=n ; i++){
                for(int j = 1; j<=i ; j++){
                    if((i+j) % 2 == 0){                 // even check
                        System.out.print(1+" ");
                    }
                    else{
                        System.out.print(0+" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }


// ButterFly Pattern
        public static void butterfly(int n){
            for(int i = 1; i<=n ; i++){
                for(int j = 1; j<=i ; j++){
                    System.out.print("*");
                }
                for(int k = 1; k<=2*(n-i) ; k++){
                    System.out.print(" ");
                }
                for(int j = 1; j<=i ; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i = n; i>=1 ; i--){
                for(int j = 1; j<=i ; j++){
                    System.out.print("*");
                }
                for(int k = 1; k<=2*(n-i) ; k++){
                    System.out.print(" ");
                }
                for(int j = 1; j<=i ; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }

        public static void solidRhombus(int n){
            for(int i = 1; i<=n ; i++){
                for(int j = 1 ; j<= n-i ; j++){
                    System.out.print(" ");
                }
                for(int k = 1; k<=n ; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }


        public static void hollowRhombus(int n){
            for(int i = 1; i<=n ; i++){
                for(int j = 1; j<=n-i ; j++){
                    System.out.print(" ");
                }
                for(int k = 1; k<=n ; k++){
                    if(i == 1 || i == n || k == 1 || k == n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                    }
                    System.out.println();
                }
                System.out.println();
            }

            public static void diamond(int n){
                for(int i = 1; i<=n ; i++){
                    for(int j = 1; j<=n-i;j++){
                        System.out.print(" ");
                    }
                    for(int k = 1 ; k<= 2*(i-1)+1 ;k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for(int i = n ; i >=1 ; i--){
                    for(int j = 1; j<=n-i;j++){
                        System.out.print(" ");
                    }
                    for(int k = 1 ; k<= 2*(i-1)+1 ;k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        
    
    

    public static void main(String[] args) {
        
        hollow_Rectagle(10, 10);
        halfPyramid(4);
        numHalfPyramid(5);
        floydTriangle(5);
        zeroOne(5);
        butterfly(4);
        solidRhombus(5);
        hollowRhombus(5);
        diamond(4);
    }


}




