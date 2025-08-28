import java.util.*;
public class java_bitwise {

    // CHECK EVEN OR ODD
    public static void oddEven(int n){
        int bitwise = n;
        if((n & 1) == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }

    } 

    // GET ITH BIT
    public static void getIth(int n1, int i){
        int bitmask = (1 << i);
        if((n1 & bitmask) != 0){
            System.out.println("ith position has 1 bit");
        }
        else{
            System.out.println("ith position has 0 bit");
        }
    }

    // SET ITH BIT
    public static int setIthbit(int n2,int k){
        int bitmask = 1<<k;
        return ( n2 | bitmask);
    }

    //CLEAR ITH BIT
    public static int clearith(int n3 , int j){
        int bitmask = ~(1<<j);
        return (n3 & bitmask);
    }


    // UPDATE ITH BIT
    public static int updateith(int n4, int p, int newbit){
        n4 =  clearith(n4, p);
        int bitmask =  newbit << p;
        return bitmask | n4;                      // 0 | 0  ==> 0 or else 1
    }

    // CLEAR ITH BITS
    public static int clearithbits(int n5 , int z){
        int bitmask = ~(0) << z;
        return bitmask & n5;
    }



    // CLEAR ITH BITS IN RANGE
    public static int clearinRangebits(int n7, int p1 , int p2){
        int a = (~(0)<<(p2+1));
        int b = (1<<p1)-1;
        int bitmask = a | b;
        return n7 & bitmask;
    }



    // IsPrimeOfTwo
    public static boolean isPrimeOfTwo(int n8){
        if( (n8 & ( n8 - 1)) == 0){
            return true;
        }
        return false;
    }

    // COUNT SET BITS
    public static int countsetithbits(int n9){
        int count = 0;
        while(n9 > 0){
            if((n9 & 1) != 0){      // check LEAST SOIGNIFICANT BIT
                count ++;
            }
            n9 = n9 >> 1;
        }
        return count;
    }


    // FAST EXPONENTIATION
    public static int fastExp(int base , int pow){
        int ans = 1;
        while(pow > 0){
            if((pow & 1) != 0){
                ans = ans*base;
            }
            else{
                ans = ans*1;
            }
            base *=base;
            pow = pow >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println((5 & 6));
        System.out.println((5 | 6));
        System.out.println((5 ^ 6));
        System.out.println((~5));
        System.out.println((5<<2));
        System.out.println((6>>1));


        // CHECK EVEN OR ODD
        System.out.println("Even or Odd");
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        oddEven(n);

        // GET ITH BIT
        System.out.println("GET ITH BIT");
        System.out.println("Enter your number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter your i position : ");
        int i = sc.nextInt();
        getIth(n1, i);

        // SET ITH BIT
        System.out.println("SET ITH BIT");
        System.out.println("Enter your number : ");
        int n2 = sc.nextInt();
        System.out.println("Enter your position k : ");
        int k = sc.nextInt();
        System.out.println(setIthbit(n2, k));

        //CLEAR ITH BIT
        System.out.println("CLEAR ITH BIT");
        System.out.println("Enter your number : ");
        int n3 = sc.nextInt();
        System.out.println("Enter your position j : ");
        int j = sc.nextInt();
        System.out.println(clearith(n3, j));

        // UPDATE ITH BIT
        System.out.println("UPDATE ITH BIT");
        System.out.println("Enter your number n4 : ");
        int n4 = sc.nextInt();
        System.out.println("Enter your position p : ");
        int p = sc.nextInt();
        System.out.println("Enter your new bit : ");
        int newbit = sc.nextInt();
        System.out.println(updateith(n4, p, newbit));


        // CLEAR ITH BITS
        System.out.println("CLEAR ITH BITS");
        System.out.println("Enter your number : ");
        int n5 = sc.nextInt();
        System.out.println("Enter your position z : ");
        int z = sc.nextInt();
        System.out.println(clearithbits(n5, z));

        // CLEAR ITH BITS IN RANGE 
        System.out.println("CLEAR ITH BIT IN RANGE ");
        System.out.println("ENTER YOUR NUMBER : ");
        int n7 = sc.nextInt();
        System.out.println("Enter first posaition p1 : ");
        int p1 = sc.nextInt();
        System.out.println("Enter second position p2 : ");
        int p2 = sc.nextInt();
        System.out.println(clearinRangebits(n7, p1, p2));


        // IsPrimeOfTwo
        System.out.println("IS PRIME OOF TWO");
        System.out.println("ENTER YOUR NUMBER : ");
        int n8 = sc.nextInt();
        System.out.println(isPrimeOfTwo(n8));


        // COUNT SET BITS 

        System.out.println("COUNT SET BITS ");
        System.out.println("ENTER YOUR NUMBER : ");
        int n9 = sc.nextInt();
        System.out.println(countsetithbits(n9));



        // FAST EXPONENTIATION 
        System.out.println("FAST EXPONENTIATION");
        System.out.println("Enter your base : ");
        int base = sc.nextInt();
        System.out.println("Enter your power : ");
        int pow = sc.nextInt();
        System.out.println(fastExp(base, pow));


    
    }   
}
