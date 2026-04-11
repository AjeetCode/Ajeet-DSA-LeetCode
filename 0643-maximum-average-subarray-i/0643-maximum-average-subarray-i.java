class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // sliding window!
        int l=nums.length;
        int i=0;
        int j=0;
        double ans=Integer.MIN_VALUE;
        double sum=0;
        while(j<l){
            sum+=nums[j];

            if((j-i+1)<k){
                j++;
            }
            else if((j-i+1)==k){
                ans=Math.max(ans,(sum/k));
                sum-=nums[i];
                i++;
                j++;
            }
        }
        return ans;
    }
}