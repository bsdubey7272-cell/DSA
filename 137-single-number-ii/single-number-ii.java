class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(int n:nums){
            if(mp.get(n)==1){
                return n;
            }
        }
        return -1;
        
    }
}