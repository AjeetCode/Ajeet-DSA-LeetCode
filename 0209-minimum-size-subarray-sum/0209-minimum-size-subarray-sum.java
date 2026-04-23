class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int length=nums.length;
        int i=0;
        int j=0;
        int ans=Integer.MAX_VALUE;
        int sum=0;
        while(j<length){
            int jiv=nums[j];
            sum+=jiv;
            if(sum<target){
                j++;
            }
            else if(sum>=target){
                ans=Math.min(ans,(j-i+1));
                while(sum>=target){
                    ans=Math.min(ans,(j-i+1));
                    int iiv=nums[i];
                    sum-=iiv;
                    i++;
                }
                j++;
            }
        }

        return ans!=Integer.MAX_VALUE?ans:0;
    }
}