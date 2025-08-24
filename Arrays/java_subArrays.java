public class java_subArrays {
    public static void subArray(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        
        for(int i = 0; i< arr.length ; i++){
            for(int j = i ; j< arr.length ; j++){
                int sum = 0;
                for(int k = i ; k<=j ; k++){
                    System.out.print(arr[k]+" ");
                    sum = sum + arr[k];
                }
                System.out.println("sum : "+sum);
                if(maxSum<sum){
                    maxSum = sum;
                }
                if(minSum>sum){
                    minSum = sum;
                }
                
            }
            System.out.println();
        }
        System.out.println("MINIMUM OF SUM OF SUBARRAY : "+minSum);
        System.out.println("MAXIMUM OF SUM OF SUBARRAY : "+maxSum);

    }

    public static void kadanes(int arr[]){
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length ; i++){
            if(arr[i] < 0){
                arr[i] = 0;
            }
            current_sum += arr[i];
            max_sum = Math.max(max_sum, current_sum);
        }

        System.out.println("MAX SUM : "+max_sum);
    }

    public static void main(String[] args) {
        int arr[] = {-1 ,-2 ,-3, 4};
        subArray(arr);
        kadanes(arr);
    }
}
