class Solution {
    public int findNumbers(int[] nums) {
        // do it using bit manipulation....
        int ans=0;
        for(int num:nums){
            int temp=num;
            int count=0;
            while(temp!=0){
                count++;
                temp=temp/10;
            }
            if(count%2==0) ans++;
            }
            return ans;
        }
    }
