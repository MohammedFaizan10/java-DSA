1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int result[] = new int[2];
4        int i = 0;
5        int j = numbers.length-1;
6        while(i < j){
7            if(numbers[i] + numbers[j] == target){
8                result[0] = i+1;
9                result[1] = j+1;
10                break;
11            }
12            else if(numbers[i] + numbers[j] < target){
13                i++;
14            }
15            else{
16                j--;
17            }
18
19            
20        }
21        return result;
22    }
23}