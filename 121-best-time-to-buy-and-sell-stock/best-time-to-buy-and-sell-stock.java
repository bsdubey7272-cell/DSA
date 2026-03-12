class Solution {
    public int maxProfit(int[] arr) {
        int maxprofit=0;
        int cost=arr[0];
        for(int i=1;i<arr.length;i++){
            int crrfayada=arr[i]-cost;
            maxprofit=Math.max(crrfayada,maxprofit);
            cost=Math.min(cost,arr[i]);
        }
        return maxprofit;
       
    }
}