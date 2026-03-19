class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        int n=nums.length;
        int k=1<<n;
        for(int i=0;i<k;i++){
            List<Integer> tList=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    tList.add(nums[j]);
                }
            } 
            list.add(tList);
        }
        return list;
        }
}