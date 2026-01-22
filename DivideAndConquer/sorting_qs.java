public class sorting_qs {

    // public static void mergeArr(String arr[] , int si , int ei){
    //     if(si >= ei){
    //         return;
    //     }
    //     int mid = si + (ei - si)/2;
    //     mergeArr(arr, si, mid);
    //     mergeArr(arr, mid+1, ei);
    //     merge(arr,si, mid,ei);
    // }

    // public static void merge(String arr[], int si , int mid , int ei){
    //     String temp[] = new String[ei - si + 1];
    //     int i = si;
    //     int j = mid+1;
    //     int k = 0;
    //     while(i <= mid && j <= ei){
    //         if(arr[i].compareTo(arr[j])<0){
    //             temp[k] = arr[i];
    //             i++;
    //         }
    //         else{
    //             temp[k] = arr[j];
    //             j++;
                
    //         }
    //         k++;
    //     }

    //     // left part
    //     while(i <= mid){
    //         temp[k++] = arr[i++];
    //     }
    //     // right part
    //     while(j <= ei){
    //         temp[k++] = arr[j++];
    //     }

    //     // copy temp to my original array
    //     for(k = 0 , i = si ; k < temp.length ; k++ , i++){
    //         arr[i] = temp[k];
    //     }
    // }

    // public static void printarr(String arr[]){
    //     for(int i = 0 ; i < arr.length ; i++){
    //         System.out.print("'"+arr[i]+"'" +" ");
    //     }
    //     System.out.println();
    // }

    // 2. Given an array nums of size n , return the majority element:

    public static int majorityElement(int[] nums) {
        return majority(nums ,0 ,nums.length-1);
        
    }
    private static int majority(int[] nums , int si , int ei){
        if(si >= ei){
            return nums[si];
        }
        int mid = si + (ei - si)/2;
        int leftMajor = majority(nums,si,mid);
        int rightMajor = majority(nums,mid+1,ei);
        if(leftMajor == rightMajor){
            return leftMajor;
        }
        
        int leftCount = count(nums,leftMajor,si,ei);
        int rightCount = count(nums,rightMajor,si,ei);
        if(leftCount > rightCount){
            return leftMajor;
        }
        return rightMajor;
        
    }

    private static int count(int[] nums , int number, int si, int ei){
        int count = 0;
        for(int i = si; i <= ei ; i++){
            if(nums[i] == number){
                count++;
            }
        }
        return count;
    }

    
    // 3. INVERSION COUNT :
    public static int inversion(int arr[] , int si , int ei){
        if(si >= ei){
            return 0;
        }

        int ans = 0;
        
        int mid = si + (ei - si)/2;

        ans += inversion(arr, si, mid);
        ans += inversion(arr, mid+1, ei);
        ans += mergeAndCount(arr,si, mid,ei);

        return ans;
        
    }

    public static int mergeAndCount(int arr[], int si , int mid , int ei){
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid+1;
        int k = 0;
        int pair = 0;
        while(i <= mid && j <= ei){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                pair += (mid - i + 1);
                temp[k] = arr[j];
                j++;
                
            }
            k++;
        }

        // left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        // right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        // copy temp to my original array
        for(k = 0 , i = si ; k < temp.length ; k++ , i++){
            arr[i] = temp[k];
        }

        return pair;
        
    }
    
    
    public static void main(String[] args) {

        // String arr[] = {"sun","earth","mars","mercury"};
        // mergeArr(arr, 0, arr.length-1);
        // printarr(arr);

        int nums[] = {3,2,3};
        System.out.println(majorityElement(nums));

        int arr[] = {1,4,2,3,5,6};
        inversion(arr, 0, arr.length-1);
        



        
    }
}
