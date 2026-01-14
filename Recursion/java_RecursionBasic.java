

public class java_RecursionBasic {

    // PROBLEM 1 : PRINT DECREASING ORDER
    public static void decrease(int n){
                                
        if(n == 1){                      // BASE CASE
            System.out.print(n);   
            return;                                         
        }

        System.out.print(n + " ");                                      // WORK
        decrease(n-1);                      // CALLING INNER FUNC

        System.out.println();
    
    }


    // PROBLEM 2 : PRINT IN INCREASING ORDER 
    public static void increase(int a){
        if(a == 1){                                            // BASE CASE
            System.out.print(a + " ");   
            return;
        }
        increase(a-1);                        // CALLING INNER FINC
        System.out.print(a + " ");  
    }


    // PROBLEM 3 : FACTORIAL OF NUMBER 
    public static int factorial(int b){
        if( b == 0){                              // BASE CASE
            return 1;
        }
        int fnm1 = factorial(b-1);         // CALLING INNER FUNC
        int fn = b*factorial(b-1);                                     // WORK 
        return  fn;                         
    }

    // PROBLEM 4 : SUM OF NATURAL NUMBERS :
    public static int sumNatural(int s){
        int sum = 0;
        if(s == 1){                                  // BASE CASE
            return 1;
        }
        int fnm1 = sumNatural(s-1);                           // CALLING INNER FUNC
        sum = s + sumNatural(s-1);       // WORK
        
        return sum;
        
    }

    // PROBLEM 5 : FIBONACCI OF NTH NUMBER :
    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fibonacci = fnm1 + fnm2;
        return fibonacci;
    }

    // PROBLEM 6 : ARRAY IS SORTED OR NOT :
    public static boolean isSort(int arr[], int i){
        if( i == arr.length - 1){                                // BASE CASE
            return true;
        }
        if(arr[i] > arr[i+1]){                                 // WORK
            return false;
        }
        return isSort(arr, i+1);                                    // CALLING INNER FUNC
    }

    // PROBLEM 7 : FIRST OCCURANCE IN ARRAY
    public static int firstOccurance(int arr[], int key ,int i){
        if(i == arr.length){                                               // BASE CASE
            return -1;
        }
        if(arr[i] == key){                                           // WORK   
            return i;
        }
        return firstOccurance(arr, key, i+1);                    // CALLING INNER FUNC
        
    }


    // PROBLEM 8 : LAST OCCURANCE IN ARRAY :
    public static int lastOccurance(int arr[], int key , int i){
        
        if(i == arr.length){                        // BASE CASE
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);           // CALLING RECURSION I+1

        if(isFound == -1 && arr[i] == key){               // WORK
            return i;
        }

        return isFound;
    }

    // PROBLEM 9 : POWER OF X^N :
    public static int pow(int x , int n){
        if(n == 0){                             // BASE CASE
            return 1;
        }
        int pMinus1 = pow(x, n-1);          // CALLING RECURSIVE
        int xn = x * pow(x, n-1);           // WORK
        return xn;
    }

    // PROBLEM 10 : POWER OF X^N (OPTIMIZED) :
    public static long power(long x , long n){
        if(n == 0){                                  // BASE CASE
            return 1;
        }
        long powerByTwo = power(x, n/2);         // CALLING RECURSIVE
        long powerbyTwosq = powerByTwo * powerByTwo;         // OPTIMIZED
        if(n % 2 == 0){
            return powerbyTwosq;                                                // WORK
        }
        return x * powerbyTwosq;
    }

    // PROBLEM 11 : TILING PROBLEM :  (MOST IMPORTANT)
    public static int tilingProblem(int n){
        if(n == 0 || n == 1){                                     // BASE CASE
            return 1;
        }
        // choice : vertical 
        int vertical = tilingProblem(n-1);                 // CALLING RECURSIVE
        // choice : horizontal 
        int horizontal = tilingProblem(n-2);               // CALLING RECURSIVE

        int ways = vertical + horizontal;                  // WORK
        return ways;
    }


    // PROBLEM 12 : REMOVE DUPLICATES FROM STRING :
    public static void removeDup(String str1, int i , StringBuilder sb , boolean[] map){
        if( i == str1.length()){
            System.out.println(sb);               // BASE CASE
            return;
        }
        char currentchar = str1.charAt(i);
        if(map[currentchar - 'a'] == true){ 
            removeDup(str1, i+1, sb, map);                         // CALL RECURSIVE
        }
        else{
            map[currentchar - 'a'] = true;
            removeDup(str1, i+1, sb.append(currentchar), map);        // WORK + CALL RECURSIVE
        }
    }

    // PROBLEM 13 : FRIENDS PAIRING PROBLEM :
    public static int friendsPair(int n ){
        if(n == 1 || n == 2){
            return n;
        }
        int single = friendsPair(n-1);
        int paired = friendsPair(n-2) * (n-1);   // paired and in their one more choice of whom to be paired so (n-1)
        int ways = single + paired;
        return ways;
    }

    // PROBLEM 14 : PRINT BINARY STRING PROBLEM :
    public static void generateString(int n , int lastdigit , String str){
        if( n == 0){                        // BASE CASE
            System.out.println(str);
            return;
        }
        // always add 0 :
        generateString(n-1, 0, str+"0");        // CALLING RECURSIVE

        // if lastgigit is 0 : 
        if(lastdigit == 0){
            generateString(n-1,1, str+"1");         // WORK + CALLING RECURSIVE
        }
    }



    public static void main(String[] args) {
        decrease(10);
        increase(10);
        System.out.println();
        System.out.println(factorial(5));
        System.out.println(sumNatural(5));
        System.out.println(fib(4));
        int arr[] = {1,2,3,4,3,5};
        System.out.println(isSort(arr, 0));
        System.out.println(firstOccurance(arr, 3, 0));
        System.out.println(lastOccurance(arr, 3, 0));
        System.out.println(pow(2, 4));
        System.out.println(power(2, 4));
        System.out.println(tilingProblem(4));
        String str1 = "appnnacollege";
        removeDup(str1, 0, new StringBuilder(""), new boolean[26]);
        System.out.println(friendsPair(3));
        generateString(3, 0, "");
    }

}







