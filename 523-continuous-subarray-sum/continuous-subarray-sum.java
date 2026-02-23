class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> mp=new HashMap<>();
       mp.put(0,-1);
       int prefixsum=0;
       for(int i=0;i<nums.length;i++){
        prefixsum+=nums[i];
        int rem=prefixsum%k;
       if(mp.containsKey(rem)){
        int previndx=mp.get(rem);
        if(i-previndx>=2){
            return true;
        }
       
       }
        else mp.put(rem,i);
       }
       return false;
      

    }
}