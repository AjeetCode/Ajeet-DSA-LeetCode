class Solution {
    public String minWindow(String s, String t) {
        int sl=s.length();
        int tl=t.length();
        HashMap<Character, Integer> map=new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int size=map.size();
        String ans="";
        int i=0;
        int j=0;
        while(j<sl){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
                if(map.get(ch)==0){
                    size--;
                }
            }
            if((size>0)){
                j++;
            }
            else if(size==0){
                while(size==0){
                    String currString=s.substring(i,j+1);
                    ans=ans.length()==0?currString:ans;
                    ans=ans.length()<(j-i+1)?ans:currString;

                    char iic=s.charAt(i);
                    if(map.containsKey(iic)){
                        if(map.get(iic)==0){
                        size++;
                        }
                        map.put(iic,map.get(iic)+1);
                    }
                    i++;
                }
                j++;
            }
        }
        return ans;
    }
}