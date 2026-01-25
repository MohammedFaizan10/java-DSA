public class grid_ways {

    public static int gridWays(int i , int j , int n , int m){
        if(i == n-1 && j == m-1){
            return 1;
        }
        if(i == n || j == m){
            return 0;
        }
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1 + w2;
    }

    // second way : best way
    public static int factorial(int num){
        int fact = 1;
        for(int i = 1 ; i <= num ; i++){
            fact *= i;
        }
        return fact;
    }

    public static int npr(int n , int m){
        return (factorial(n+m-2))/(factorial(n-1)*factorial(m-1));
    }
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        System.out.println(gridWays(0, 0, n, m));
        System.out.println(npr(n, m));
    }
}


