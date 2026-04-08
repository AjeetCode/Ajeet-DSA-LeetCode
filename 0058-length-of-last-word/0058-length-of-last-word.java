class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int k=s.lastIndexOf(' ');
        int l=s.length();
        return(l-k-1);
    }
}