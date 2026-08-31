class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int answer[] = new int[n];
        int diff[] = new int[n+2];
        int sum = 0;
        for(int i = 0 ; i < bookings.length ; i++){
            int seats = bookings[i][2];
            int from = bookings[i][0];
            int to = bookings[i][1];
            diff[from] += seats;

            diff[to+1] -= seats;

        }

        for(int i = 1; i <= n; i++){
            sum += diff[i];
            answer[i - 1] = sum;
        }

        return answer;
    }
}