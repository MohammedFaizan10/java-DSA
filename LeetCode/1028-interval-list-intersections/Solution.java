class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int n = firstList.length;
        int m = secondList.length;
        ArrayList<int[]> res = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i < n && j < m){
            int start1 = firstList[i][0];
            int start2 = secondList[j][0];
            int end1 = firstList[i][1];
            int end2 = secondList[j][1];
            if(start1 < start2){
                if(end1 >= start2){
                    int s = Math.max(start1,start2);
                    int e = Math.min(end1, end2);
                    res.add(new int[]{s,e});
                }
            }
            else{
                if(end2 >= start1){
                    int s = Math.max(start1,start2);
                    int e = Math.min(end1,end2);
                    res.add(new int[]{s,e});
                }
            }
            if(end1 <= end2){
                i++;
            }
            else{
                j++;
            }
        }
        return res.toArray(new int[res.size()][]);

    }
}