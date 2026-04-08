class Solution {
    public void moveZeroes(int[] nums) {
       int a=0;

       for (int num:nums){
        if (num!=0){
            nums[a++]=num;
        }
       }

       while(a<nums.length){
        nums[a++]=0;
       }
    }
}

// the correct approach to this question is to bring all the non-zero element to the begining and after that converting all next element to zero. 