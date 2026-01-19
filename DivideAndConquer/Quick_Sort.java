public class Quick_Sort {

    public static void quickSort(int arr[], int si , int ei){
        if(si >= ei){
            return;
        }
        int p_idx = partition(arr, si , ei);    // To get proper pivot index

        quickSort(arr, si, p_idx - 1);   // left part

        quickSort(arr, p_idx + 1, ei);   // right part

    }

    public static int partition( int arr[], int si , int ei){
        int pivot = arr[ei];
        int i = si - 1;
        for(int j = si ; j < ei ; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void printarr(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printarr(arr);

    }
}
