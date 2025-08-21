public class java_ArrayBinarysearch {

    public static int binarySearch(int arr[], int key){
        int start =  0;
        int end = arr.length-1;
        while(start<= end){
           int mid = (start + end)/2;
           if(arr[mid] == key){
            return mid;
           }
           if(arr[mid] < key){                   // right
            start = mid+1;
           }
           else{               // arr[mid] > key                  // left
            end = mid - 1;
           }
        }
        return -1;
    }

    public static void reverseOfArray(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {

            // swapping classic code
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;




            
        }
    }


    public static void pairOfArray(int arr[]){
        int tp = 0;
        for(int i = 0 ; i< arr.length ; i++){
            int current = arr[i];
            for(int j = i+1 ; j<arr.length ; j++){
                System.out.print("("+current+","+j+")"+" ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("TOTAL PAIRS : "+tp);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int key = 6;
        int index = binarySearch(arr, key);

        System.out.println("KEY FOUND AT : "+index);

        reverseOfArray(arr);
        for(int i =0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("PAIRS OF ARRAY : ");
        pairOfArray(arr);
    }
}
