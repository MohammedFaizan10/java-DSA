import java.util.*;
public class Pair_Sum_2 {

    // PAIRSUM IN ROTATED SORTED ARRAYLIST :

    public static boolean pairSum2(ArrayList<Integer> list, int target){

        // BREAKING POINT PIVOT 
        int n = list.size();
        int bp = -1;
        for(int i = 0 ; i < n ; i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }

        int lp = bp + 1;
        int rp = bp;

        // SUM :
        while (lp != rp) {
            if( list.get(lp) + list.get(rp) == target){
                return true;
            }

            if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1) % n;                            // MODULAR ARTHMETIC ROTAION
            }

            else{
                rp = (n+rp-1) % n;                          // MODULAR ARTHMETIC ROTAION
            }
        }

        return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairSum2(list, target));


    }
}
