class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int result[] = new int[n + 1];
        result[0] = 0;
        result[1] = gain[0];
        for(int i = 1; i <= gain.length;i++){
            result[i] = result[i-1] + gain[i-1];
        }

        int ans = Integer.MIN_VALUE;
        for(int i : result){
            ans = Math.max(ans,i);
        }
        return ans;
    }
}