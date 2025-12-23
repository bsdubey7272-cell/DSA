class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int x=text1.length()-1;
        int y=text2.length()-1;
        int[][]dp=new int[x+1][y+1];
        for(int i=0;i<x+1;i++){
            for(int j=0;j<y+1;j++){
                dp[i][j]=-1;
            }
        }

        return ans(x,y,text1,text2,dp);

        
    }

    public int ans(int x,int y,String text1,String text2,int[][] dp){
        if(x<0||y<0){
            return 0;
        }
        if(text1.charAt(x)==text2.charAt(y)){
           dp[x][y]= 1+ ans(x-1,y-1,text1,text2,dp);
        }
        if(dp[x][y]!=-1) return dp[x][y];


        return dp[x][y]=Math.max(ans(x,y-1,text1,text2,dp),ans(x-1,y,text1,text2,dp));

    }
}