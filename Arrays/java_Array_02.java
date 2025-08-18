public class java_Array_02 {
    
    public static int linearSearch(int num[], int key){
        for(int i = 0; i<num.length ; i++){
            if(num[i] == key){
                return i;
            }
        }

        return -1;
    }


    public static int linearSearchString(String menu[] , String key){
        for(int i =0 ; i<menu.length; i++){
            if(menu[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int largest(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i<num.length ; i++){
            if(largest < num[i]){
                largest = num[i];
            }
        }
        return largest;
        
    }

    public static int smallest(int num[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<num.length ; i++){
            if(smallest > num[i]){
                smallest = num[i];
            }
        }
        return smallest;
    }

    


    public static void main(String[] args) {
        int num[] = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
        int key = 10;

        int index = linearSearch(num, key);
        if(index == -1){
            System.out.println("KEY IS NOT FOUND ");
        }
        else{
            System.out.println("KEY IS FOUNDED AT INDEX "+index);
        }


        String menu[] = {"DOSA" ,"IDLY" ,"WADA" ,"MYSOREBAJHI" ,"UPMA"};
        String key1 = "WADA";

        int index1 = linearSearchString(menu, key1);
         if(index1 == -1){
            System.out.println("KEY IS NOT FOUND ");
        }
        else{
            System.out.println("KEY IS FOUNDED AT INDEX "+index1);
        }


        // MAXIMUM OF ARRAY

        System.out.println("MAXIMUM OF ARRAY IS : "+largest(num));

        // MINIMUM OF ARRAY

        System.out.println("MINIMUM OF ARRAY IS : "+smallest(num));


    }
}
