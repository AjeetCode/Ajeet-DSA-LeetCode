class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        double currentSum=0;
        double maxSum=Integer.MIN_VALUE;
        while(j < n) {
            int kkk=nums[j];
            currentSum+=kkk;
            if((j-i+1)<k){
                j++;
            }
            else if(k==(j-i+1)){
                maxSum=Math.max(maxSum,currentSum/k);
                int kk=nums[i];
                currentSum-=kk;
                i++;
                j++;
            }
        }
        return maxSum;
    }
}