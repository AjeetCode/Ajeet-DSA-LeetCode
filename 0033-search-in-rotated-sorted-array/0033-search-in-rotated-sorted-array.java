class Solution {
    public int search(int[] nums, int target) {
        int ind=minInd(nums);
        int x=bs(nums,0,ind-1,target);
        if(x!=-1) return x;
        else return(bs(nums,ind,nums.length-1,target));
    }
    // find the index of minimum element
    public int minInd(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[end]) start=mid+1;
            else end=mid;
        }
        return start;
    }
    public int bs(int[] nums, int start, int end,int target){
       
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}