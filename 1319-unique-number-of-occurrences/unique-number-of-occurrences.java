class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int result[]=new int[2001];
        for(int n:arr){
            result[n+1000]++;
        }
        Arrays.sort(result);
        for(int i=1;i<2001;i++){
            if(result[i]!=0&&result[i]==result[i-1]){
                return false;
            }
        }
        return true;

        
    }
}