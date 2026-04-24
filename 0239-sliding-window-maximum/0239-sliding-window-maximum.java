    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int l=nums.length;
            int i=0;
            int j=0;
            Deque<Integer> tans = new LinkedList<>();
            List<Integer> ans=new ArrayList<>();
            while(j<l){
                int cie=nums[j];
                while(!tans.isEmpty() && tans.peekLast()<cie){
                    tans.removeLast();
                }
                tans.addLast(cie);
                if((j-i+1)<k){
                    j++;
                    }
                else if((j-i+1)==k){
                    int iie=tans.peekFirst();
                    ans.add(iie);
                    if(nums[i]==iie){
                        tans.removeFirst();
                    }
                    i++;
                    j++;
                }
            }
            int[] result = new int[ans.size()];
            for (int idx = 0; idx < ans.size(); idx++) {
            result[idx] = ans.get(idx);
            }

        return result;
        }
    }