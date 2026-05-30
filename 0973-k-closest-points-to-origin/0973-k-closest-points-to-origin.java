class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // no of points= no of rows, points.length;points[0].length
        // pair class?
        // hashmap
        int l=points.length;
        HashMap<Integer, Double> hm=new HashMap<>();

        PriorityQueue<Double> pq=new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        for(int[] point : points){
            Double distance=(Double)Math.sqrt(Math.pow(point[0],2)+Math.pow(point[1],2));
            pq.add(distance);
            if(pq.size()>k){
                pq.poll();
            }
            hm.put(i,distance);
            i++;
        }
        int j =0;
        int[][] ans =  new int[k][2];
        for (Integer key : hm.keySet()) {
            if(pq.contains(hm.get(key))){
                ans[j] = points[key];
                j++;
            }
        }   
        return ans;
    }
}