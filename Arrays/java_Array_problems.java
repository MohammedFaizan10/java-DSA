package Arrays;

import java.util.*;
public class java_Array_problems {

    // 1 repeatition 
    public static boolean repeat(int arr[]){
        for(int i = 0 ; i< arr.length ; i++){
            for(int j = i+1 ; j<arr.length ; j++){
                 if(arr[i] == arr[j]){
                 return true;
                 }
            }
           
        }
        return false;
    }

    public static int binary(int num[] , int target){
        int start = 0;
        int end = num.length -1;
        while(start<=end){
            int mid = (start + end)/2;
            if(num[mid] == target){
                return mid;
            }
            // case 1 left array sort check
            if(num[start] <= num[mid]){
                if(num[start] <= target && target < num[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{          // case 2 right array sort check
                if(num[mid] < target && target<= num[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return-1;
    }

    public static int stocks(int price[]){
        int max_profit = 0;
        int buy_price = Integer.MAX_VALUE;
        for(int i = 0 ; i < price.length ; i++){
            if(buy_price < price[i]){
                int profit = price[i] - buy_price;
                max_profit = Math.max(profit,max_profit);
            }
            else{
                buy_price = price[i];
            }
        }
        return max_profit;
    }


    public static int trap(int array[]){
        
        int n = array.length;

        // left array max
        int leftMax[] = new int[array.length];
        leftMax[0] = array[0];
        for(int i = 1 ; i<array.length ; i++){
            leftMax[i] = Math.max(array[i], leftMax[i-1]);
        }
        // right array max 
        int rightMax[] = new int[array.length];
        rightMax[n-1] = array[n-1];
        for(int i = n-2; i>=0 ; i--){
            rightMax[i] = Math.max(array[i] ,rightMax[i+1]);
        }

        int trap_water = 0;
        for(int i = 0 ; i < n; i++){
            int water_level = Math.min(leftMax[i], rightMax[i]);
            trap_water += water_level - array[i];
        }
        return trap_water;
    }

    // 5 three sum

    public static void threeSum(int arrays[]){
        Arrays.sort(arrays);

        for(int i = 0 ; i<arrays.length ; i++){
            if(i>0 && arrays[i] == arrays[i-1]){
                continue;
            }
            for(int j = i+1; j < arrays.length ; j++){
                if(j>i+1 && arrays[j] == arrays[j-1]){
                    continue;
                }
                for(int k = j + 1; k < arrays.length ; k++){
                    if(k>j+1 && arrays[k] == arrays[k-1]){
                        continue;
                    }
                    if((arrays[i] + arrays[j] + arrays[k]) == 0){
                        System.out.println("{"+arrays[i]+","+arrays[j]+","+arrays[k]+"}");
                    }
                }
            }
        }
    }


    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 3 , 4, 5};
        System.out.println(repeat(arr));

        int num[] = {4,5,6,7,1,2,3};
        int target = 2;
        System.out.println(binary(num, target));

        int price[] = {7,1,3,5,6,2};
        System.out.println(stocks(price));

        int array[] = {4,2,1,5,6,2,4};
        System.out.println(trap(array));

        int arrays[] = {-1, 0, 1, 2, -1, -4};
        threeSum(arrays);
    }
}
