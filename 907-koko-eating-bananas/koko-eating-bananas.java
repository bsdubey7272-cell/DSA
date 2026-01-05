class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int low=0;
       int high=findmax(piles);
       int ans=-1;
       while(low<=high){
        int mid=(low+high)/2;
        long timereq=totalhours(piles,mid);
        if(timereq<=h){
            ans=mid;
            high=mid-1;
        }else{
            low=mid+1;
        }
        
       } 
       return ans;
    }
    private int findmax(int piles[]){
        int maximum=Integer.MIN_VALUE;
        int n=piles.length;
        for(int i=0;i<n;i++){
            maximum=Math.max(maximum,piles[i]);
        }
        return maximum;
    }
    private int totalhours(int piles[],int h){
        int totalh=0;
        for(int i=0;i<piles.length;i++){
            totalh+=Math.ceil((double)piles[i]/(double)h);
        }
        return totalh;
    }
}