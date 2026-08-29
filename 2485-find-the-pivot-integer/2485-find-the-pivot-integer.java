class Solution {
    public int pivotInteger(int n) {
        int totalsum = 0;
        for(int i = 1 ; i <= n ; i++){
            totalsum += i;
        }


        int leftsum = 0;
        for(int i = 1 ; i <= n ; i++){

            leftsum += i;
            int rightsum = totalsum - leftsum +i;
            if(leftsum == rightsum){
                return i;
            }
        }

        return -1;
    }
}