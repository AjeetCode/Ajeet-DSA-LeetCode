class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // no of points= no of rows, points.length;points[0].length
        // pair class?
        // hashmap
        int l=points.length;
        HashMap<Integer, Double> hm=new HashMap<>();
        // PriorityQueue<Double> pq=new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        for(int[] point : points){
            Double distance=(Double)Math.sqrt(Math.pow(point[0],2)+Math.pow(point[1],2));
            // pq.add(distance);
            // if(pq.size()>k){
            //     pq.poll();
            // }
            hm.put(i,distance);
            i++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Double.compare(hm.get(b), hm.get(a)));
        for(int j=0;j<l;j++){
            pq.add(j);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int ans[][] = new int[k][2];
        // for(int j=0;j<k;j++){
        //     int e=pq.poll();
        //     int arr[]=points[e];
        //     ans[j]=arr;
        // }
        int j = 0;
        while(!pq.isEmpty()){
            int e=pq.poll();
            ans[j]=points[e];
            j++;

        }
        return ans;
    }
}