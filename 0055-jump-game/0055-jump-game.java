class Solution {
    public boolean canJump(int[] nums) {
        int l=nums.length;
        int maxSoFar=0;
        for(int i=0;i<l;i++){
            if(maxSoFar<i){
                return false;
            }
            maxSoFar=Math.max(maxSoFar,i+nums[i]);
        }
        return true;
    }
}