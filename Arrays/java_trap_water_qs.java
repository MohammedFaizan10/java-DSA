public class java_trap_water_qs {
    
    public static int trapWater(int height[]){
        int n = height.length;
        // calculate left max boundary - array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i = 1 ; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        } 
        // calculate right max boundary - array
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i = n-2 ; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int trap_water = 0;                             // loop
        for(int i = 1 ; i< n ; i++){
            //waterlevel = min(leftmax bound , rightmax bound)
            int water_level = Math.min(leftmax[i], rightmax[i]);

            //trapped water = waterlevel - height[i]  
            trap_water += water_level - height[i];
        }

        return trap_water;
    }


    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};

        System.out.println(trapWater(height));
        System.out.println(trapWaterCal(height));

        int price[] = {7 , 1 , 5 , 3 , 6 , 4};
        System.out.println(sellAndBuy(price));
    }
}
