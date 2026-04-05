class Solution {
    public int[] singleNumber(int[] nums) {
        int ans[]=new int[2];
        Map<Integer,Integer> mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int s=0;
        for(int n:nums){
            if(mp.get(n)==1){
                ans[s++]=n;
                if(s==2) break;
               
            }
        }
        return ans;
        
    }
}