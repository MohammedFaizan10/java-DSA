import java.util.*;
public class container_pr {

    public static int storeWater(ArrayList<Integer> containers){
        int maxWater = 0;
        for(int i = 0 ; i < containers.size(); i++){
            for(int j = i + 1; j < containers.size() ; j++){
                int height = Math.min(containers.get(i),containers.get(j));
                int width = j - i;
                int currWater = height * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }


    public static int optimizeStoreWater(ArrayList<Integer> containers){
        int lp = 0;
        int rp = containers.size()-1;
        int maxWater = 0;
        while(lp < rp){
            int height = Math.min(containers.get(lp),containers.get(rp));
            int width = rp - lp;
            int currWater = height * width;
            maxWater = Math.max(maxWater, currWater);

            if(containers.get(lp) < containers.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }

        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> containers = new ArrayList<>();
        containers.add(1);
        containers.add(8);
        containers.add(6);
        containers.add(2);
        containers.add(5);
        containers.add(4);
        containers.add(8);
        containers.add(3);
        containers.add(7);

        System.out.println(storeWater(containers));
        System.out.println(optimizeStoreWater(containers));
    }
}
