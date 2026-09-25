class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
       for(String s : sentences) {
        int count = 1;
        int l = s.length();
        for(int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            if(ch == ' ') {
                count ++;
            }
        }
        if(count > ans) {
            ans = count;
        }
       } 
       return ans;
    }
}