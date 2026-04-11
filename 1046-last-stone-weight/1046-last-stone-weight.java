class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            minHeap.add(stone);
        }
        while(minHeap.size()>=2){
        int x=minHeap.poll();
        int y=minHeap.poll();
        if(x<y){
            minHeap.add(y-x);
        }else if(y<x){
            minHeap.add(x-y);
        }
    }
    if(!minHeap.isEmpty()){
        return minHeap.poll();
    }else{
        return 0;
    }
    }
}