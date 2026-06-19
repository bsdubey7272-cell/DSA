class Solution {
    public int largestAltitude(int[] gain) {
        int crr=0;
        int max=0;
        for(int g:gain){
            crr+=g;
            max=Math.max(crr,max);
        }
        return max;
        
    }
}