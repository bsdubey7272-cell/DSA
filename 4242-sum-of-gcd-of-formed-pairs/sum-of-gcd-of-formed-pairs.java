class Solution {
    public long gcdSum(int[] nums) {

       int n=nums.length;
       int prefixgcd[]=new int[n];
       int mx=0;
       for(int i=0;i<n;i++){
        mx=Math.max(nums[i],mx);
        prefixgcd[i]=gcd(nums[i],mx);
       }
       Arrays.sort(prefixgcd);
       long ans=0;
       int left=0;
       int right=nums.length-1;
       while(left<right){
         ans+=gcd(prefixgcd[left],prefixgcd[right]);
         left++;
         right--;

       }
       return ans;
      
        
    }
    public int gcd(int a,int b){
        while(b!=0){
        int rem=a%b;
        a=b;
        b=rem;
       

        }
         return a;
        
    }
}