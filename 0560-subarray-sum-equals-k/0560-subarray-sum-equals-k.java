class Solution {
    public int subarraySum(int[] nums, int k) {
        int l=nums.length;
        for(int i=1;i<l;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        int count=0;
        for(int i=0;i<l;i++){
            for(int j=i;j<l;j++){
                if(i==0){
                    if(nums[j]==k){
                        count++;
                    }
                }
                else{
                    if((nums[j]-nums[i-1])==k){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}