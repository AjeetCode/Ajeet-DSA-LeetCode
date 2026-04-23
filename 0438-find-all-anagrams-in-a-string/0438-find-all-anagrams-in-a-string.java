class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int ls=s.length();
        int lp=p.length();
        int i=0;
        int j=0;
        List<Integer> ans=new ArrayList<>();
        // finding the frequency of each character in p
        Map<Character, Integer> map=new HashMap<>();
        for(char ch:p.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int count=map.size();
        while(j<ls){
            char jic=s.charAt(j);
            if(map.containsKey(jic)){
               map.put(jic, map.get(jic)-1);
               if(map.get(jic)==0){
                count--;
               } 
            }
            if((j-i+1)<lp){
                j++;
            }else if((j-i+1)==lp){
                if(count==0){
                    ans.add(i);
                }
                char iic=s.charAt(i);
                if(map.containsKey(iic)){
                    if(map.get(iic)==0){
                        count++;
                    }
                    map.put(iic, map.get(iic)+1);
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}