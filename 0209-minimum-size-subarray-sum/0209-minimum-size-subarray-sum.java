class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //SlidingWindow
        int i=0;
        int j=0;
        int l=nums.length;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        while(j<l) {
            sum+=nums[j];
            if(sum<target) {
                j++;
            }
            else if(sum>=target) {
                ans=Math.min(ans,(j-i+1));
                while(sum>target){
                    sum-=nums[i];
                    i++;
                    if(sum>=target) {
                        ans=Math.min(ans,(j-i+1));
                    }
                }
                j++;
            }
        }
        if(ans==Integer.MAX_VALUE) return 0;
        else return ans;
    }
}