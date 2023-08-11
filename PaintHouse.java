// Time Complexity : O(mn)
// Space Complexity : O(mn)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

class Solution {
    public int minCost(int[][] costs) {

        if(costs==null || costs.length==0) return -1;
     
        int m = costs.length;
       int[][] dp = new int[m][3];
        dp[m-1][0]=costs[m-1][0] ;dp[m-1][1]=costs[m-1][1]; dp[m-1][2]=costs[m-1][2];
        for(int i=m-2;i>=0;i--)
        {
            dp[i][0]= costs[i][0]+ Math.min(dp[i+1][1],dp[i+1][2]);
            dp[i][1]= costs[i][1]+ Math.min(dp[i+1][0],dp[i+1][2]);
            dp[i][2]= costs[i][2]+ Math.min(dp[i+1][1],dp[i+1][0]);
        }
        return Math.min(dp[0][0], Math.min(dp[0][1], dp[0][2]));

        
    }
}