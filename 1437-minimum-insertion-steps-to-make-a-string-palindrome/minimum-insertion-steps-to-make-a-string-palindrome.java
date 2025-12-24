class Solution {
    int dp[][];
    public int minInsertions(String s) {
        int n=s.length();
         dp=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        
        return ans(s,0,s.length()-1);

        
    }
    private int ans(String s,int i,int j){
        if(i>=j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)==s.charAt(j)){
            
           dp[i][j]=  ans(s,i+1,j-1);
        }
       else {
        dp[i][j]= 1+Math.min(ans(s,i+1,j),ans(s,i,j-1));

       }
       return dp[i][j];
        
    }
}