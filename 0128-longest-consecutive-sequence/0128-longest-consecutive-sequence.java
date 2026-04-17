class Solution {
    public int longestConsecutive(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:nums){
            pq.offer(num);
        }
        if(pq.isEmpty()) return 0;
        int count=1;
        int longest=1;
        int prev=pq.poll();
        while(!pq.isEmpty()){
            int ele=pq.poll();
            if((prev+1)==ele){
                count++;
                prev=ele;
                longest=Math.max(longest,count);
            }
            else if(prev==ele){
                continue;
            }
            else{
                count=1;
                prev=ele;
            }
        }
        return longest;
    }
}