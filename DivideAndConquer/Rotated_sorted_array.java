public class Rotated_sorted_array {

    public static int searchIdx(int arr[] , int target , int si , int ei){

        // BASE CASE : 1 :
        if( si > ei){
            return -1;
        }

        // Finding MID :
        int mid = si + (ei - si)/2;  // Alternative to (si + ei)/2

        // Best Case : 1
        if(arr[mid] == target){
            return mid;
        }

        // IF MID IS ON LINE 1
        if(arr[si] <= arr[mid]){
            
            // LEFT CHECK FROM MID             - CASE -A
            if(arr[si] <= target && target <= arr[mid]){
                return searchIdx(arr, target, si, mid-1);
            }
            
            // ESLE RIGHT CHECK                 - CASE - B
            else{
                return searchIdx(arr, target, mid+ 1, ei);
            }
        }

        // ELSE MID ON LINE 2
        else{                        // if(arr[mid] <= arr[ei])

            // CHECK RIGHT                       - CASE C
            if(arr[mid] <= target && target <= arr[ei]){
                return searchIdx(arr, target, mid + 1, ei);
            }
            
            // ELSE CHECK LEFT                   - CASE D
            else{
                return searchIdx(arr, target, si, mid-1);
            }
        }
    }



    // IN ITERATION : 
    public int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    // Continue the loop as long as the search space is valid
    while (left <= right) {
        // Calculate mid to prevent potential integer overflow
        int mid = left + (right - left) / 2;

        // Case 1: Target found at mid
        if (nums[mid] == target) {
            return mid;
        }

        // Case 2: The left subarray [left...mid] is sorted
        if (nums[left] <= nums[mid]) {
            // Check if the target is within the sorted left subarray
            if (target >= nums[left] && target < nums[mid]) {
                // If so, discard the right half
                right = mid - 1;
            } else {
                // Otherwise, the target must be in the right half
                left = mid + 1;
            }
        } 
        
        // Case 3: The right subarray [mid...right] is sorted
        else {
            // Check if the target is within the sorted right subarray
            if (target > nums[mid] && target <= nums[right]) {
                // If so, discard the left half
                left = mid + 1;
            } else {
                // Otherwise, the target must be in the left half
                right = mid - 1;
            }
        }
    }

    // Target was not found in the array
    return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(searchIdx(arr, target, 0, arr.length-1));

    }
}
