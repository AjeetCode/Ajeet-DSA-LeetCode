class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int pile:piles){
            high=Math.max(high,pile);
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            // coco ko mid ke speed se kitna hour lag rahe hy?
            long mh=0;
            for(int pile:piles){
                mh+=(pile+mid-1)/mid;
            }
            if(mh<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}