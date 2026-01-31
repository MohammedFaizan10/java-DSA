import java.util.*;
public class pair_sum {

    public static void pairSum(ArrayList<Integer> nums , int target){
        for(int i = 0 ; i < nums.size() ; i++){
            for(int j = i+1 ; j < nums.size() ; j++){
                if(nums.get(i) + nums.get(j) == target){
                    System.out.println("("+nums.get(i)+","+nums.get(j)+")");
                }
            }
        }
    }

    // OPTIMIZE CODE   - TWO POINTER APPROACH 

    public static boolean pairSumOPT(ArrayList<Integer> nums , int target){
        int lp = 0;
        int rp = nums.size()-1;
        while(lp<rp){

            // case 1

            if((nums.get(lp) + nums.get(rp)) == target){
                return true;
            }

            //case 2

            else if((nums.get(lp) + nums.get(rp)) < target){
                lp++;
            } 
            
            // case 3
            
            else if((nums.get(lp) + nums.get(rp)) > target){
                rp--;
            }
        }

        return false;
        
    }
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        int target = 5;

        pairSum(nums, target);
        System.out.println(pairSumOPT(nums, target));
    }
}
