class Solution {
    public int numSpecial(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1 ){
                    int rowcnt=0;
                    int colcnt=0;
                    for(int k=0;k<m;k++){
                        if(mat[i][k]==1){
                            rowcnt++;
                        }

                    }

                    for(int k=0;k<n;k++){
                        if(mat[k][j]==1){
                            colcnt++;
                        }
                    }
                    if(rowcnt==1&&colcnt==1){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
        
    }
}