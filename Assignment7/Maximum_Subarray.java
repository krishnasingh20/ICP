class Solution {
    public int maxSubArray(int[] nums) {
        // int ans = Integer.MIN_VALUE;
        // int sum = 0;
        // for(int i = 0; i < nums.length; i++) {
        //     sum += nums[i];
        //     ans = Math.max(ans, sum);
        //     if(sum < 0) {
        //         sum = 0;
        //     }
        // }
        // return ans;
        return dpBasedKadanes(nums);
    }
    public int dpBasedKadanes(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], nums[i]+dp[i-1]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
// kadanes Algo
// TC--> O(n)
// SC--> O(1)

// dp based kadanes
// TC--> O(n)
// SC--> O(n)
