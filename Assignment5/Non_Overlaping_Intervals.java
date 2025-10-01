class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b)-> Integer.compare(a[1], b[1]));
        int ans = 0;
        int end = intervals[0][1];
        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] < end) {
                ans++;
                continue;
            }
            end = intervals[i][1];
        }
        return ans;
    }
}
// TC--> O(nlogn)
// SC--> O(1)
