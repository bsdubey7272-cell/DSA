class Solution {
    public int firstUniqChar(String s) {
        int ans[]=new int[26];
        int n=s.length();
        for(int ch:s.toCharArray()){
            ans[ch-'a']++;

        }
        for(int i=0;i<n;i++){
            if(ans[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
        
        
    }
}