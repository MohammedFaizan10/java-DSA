class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int maxLocation = 0;
        for(int i = 0 ; i < trips.length ; i++){
            maxLocation = Math.max(maxLocation,trips[i][2]);
        }
        int diff[] = new int[maxLocation+1];
        int sum = 0;

        for(int i = 0; i < trips.length; i++){
            int passenger = trips[i][0];
            int from = trips[i][1];
            int to = trips[i][2];
            diff[from] += passenger;
            diff[to] -= passenger;

        }

        for(int i = 0 ; i < diff.length ; i++ ){
            sum += diff[i];
            if(sum > capacity){
                return false;
            }
        }



        return true;

    }
}