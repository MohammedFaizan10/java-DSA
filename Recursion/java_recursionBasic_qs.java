public class java_recursionBasic_qs {

    //PROBLEM 1 : NO OF OCCURANCE INDEXES :
    public static void occurance(int arr[] , int key , int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key ){
            System.out.print(i+" ");
        }
        occurance(arr, key, i+1);
    }

    //PROBLEM 2 : CONVERT NUMBER INTO LETTER : 
    
    public static void convert(int n , String[] words){
        if(n == 0){
            return;
        }

        int digit = n % 10;                              
        convert(n/10, words);
        System.out.print(words[digit]+" ");

        }

        // PROBLEM 3 : LENGTH OF STRING : 
    public static int findLength(String str, int i) {
        if (i == str.length()) {                                // BASE CASE
            return 0;
        }
        int fplusone = findLength(str, i+1);                // CALLING RECURSIVE
        return 1 + fplusone;                  // WORK
    }

    // PROBLEM 4 : COUNT SUBSTRING STARTING AND ENDING OF SUBSTRING IS SAME :
    public static int subStringCount(String str, int start , int end){
        if(start == str.length()){      // BASE CASE 
            return 0;
        }
        if( end == str.length()){                                     // BASE CASE 2
            return subStringCount(str, start+1, start+1);          // CALLING RECURSIVE
        }
        int count = 0;    
        if(str.charAt(start) == str.charAt(end)){                          // WORK
            count +=1 ;
        }
        
        return count + subStringCount(str, start, end+1);       // RETURNING WITH CALL
    }


    // PROBLEM 5 : TOWER OF HONAI :
    public static void towerOfHonai(int n , String src , String helper , String dest){
        if( n == 1){
            System.out.println("Transfer Disk "+n+" From "+src+" To "+dest);
            return;
        }
        towerOfHonai(n-1, src, dest, helper);
        System.out.println("Transfer Disk "+n+" From "+src+" To "+dest);
        towerOfHonai(n-1, helper, src, dest);
    } 

        
    
    public static void main(String[] args) {
        int arr[] = {3 , 2 , 4 , 5 , 6 , 2 , 7 , 2 , 2};
        occurance(arr, 2, 0);
        System.out.println();
        String words[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        convert(1975, words);
        System.out.println();
        String str = "aba";
        System.out.println(findLength(str, 0));
        System.out.println(subStringCount(str, 0,0));
        towerOfHonai(3, "source", "helper", "destination");
    }
}
