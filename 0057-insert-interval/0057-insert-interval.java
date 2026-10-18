class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length == 0){
            return new int[][]{newInterval};
        }

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        int start = intervals[0][0];

        ArrayList<int[]> ans = new ArrayList<>();
        boolean isInserted = false;
        for(int i = 0 ; i < intervals.length ; i++){
            start = intervals[i][0];
            if(isInserted == false && start >= newInterval[0]){
                ans.add(newInterval);
                isInserted = true;
            }
            ans.add(intervals[i]);
        }
        if(!isInserted){
            ans.add(newInterval);
        }
        int[][] res = ans.toArray(new int[ans.size()][]);

        ArrayList<int[]> list = new ArrayList<>();



        start = res[0][0];
        int end = res[0][1];

        for(int i = 1; i < res.length ; i++){
            int s = res[i][0];
            int e = res[i][1];

            if(end >= s){
                end = Math.max(e,end);
                continue;
            }
            list.add(new int[]{start , end});

            start = s;
            end = e;
        }

        list.add(new int[]{start , end});

        return list.toArray(new int[list.size()][]);
    }
}