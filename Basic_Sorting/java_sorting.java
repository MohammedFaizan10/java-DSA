import java.util.*;
public class java_sorting {

    public static void bubbleSort(Integer arr[]){
        int n = arr.length;
        
        for(int turn = 0 ; turn < n-1 ; turn++){
            boolean swap = false;
            for(int j = 0 ; j < n - 1 - turn ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                    swap = true;
                }
            }
            if(!swap){
                System.out.println("Bubble sort is already sorted");
                break;
            }
         }
        }

    public static void printArr(Integer arr[]){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void selectionSort(Integer arr[]){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){
            int minPos = i; 
            
            for(int j = i+1; j < n; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }

            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(Integer arr[]){
        int n = arr.length;
        for(int i = 1; i < n-1 ; i++){
            int curr = arr[i];
            int prev = i - 1;
            while(prev >=0 && arr[prev] > arr[curr]){
                arr[prev+1] = arr[prev];  // shift
                prev--;
            }
            // insertion 
            arr[prev+1] = curr;   // updating current value
        }
    }

    public static void countSort(Integer arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            largest = Math.max(largest,arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i = 0 ; i < arr.length ; i++){
            count[arr[i]]++;
        }

        int j = 0 ;
        for(int i = 0 ; i<count.length ; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        Integer arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        printArr(arr);
        selectionSort(arr);
        printArr(arr);
        insertionSort(arr);
        printArr(arr);
        Arrays.sort(arr);
        printArr(arr);
        Arrays.sort(arr,0,3);
        printArr(arr);
        Arrays.sort(arr,Collections.reverseOrder());   // same for particular index sorting include starting index and ending index
        printArr(arr);
        countSort(arr);
        printArr(arr);

    }
}
