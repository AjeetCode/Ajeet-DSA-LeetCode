class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int l=s.length();
        int ans=0;
        Map<Character,Integer> hm=new HashMap<>();
        int size=hm.size();
        while(j<l){
            char ch=s.charAt(j);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            if(hm.size()==(j-i+1)){
                ans=Math.max(ans,(j-i+1));
                j++;
            }
            else if(hm.size()<(j-i+1)){
                while(hm.size()<(j-i+1)){
                    char ich=s.charAt(i);
                    hm.put(ich,hm.get(ich)-1);

                    if(hm.get(ich)==0){
                        hm.remove(ich);
                    }
                    i++;
                }
                j++;
            }
        }
        return ans;
    }
}