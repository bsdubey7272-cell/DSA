class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int result[]=new int[20001];
        for(int x:arr){
            result[x+1000]++;
        }
        Arrays.sort(result);
        for(int i=1;i<result.length;i++){
            if(result[i]!=0 && result[i]==result[i-1]){
                return false;
            }
        }
        return true;
        
    }
}