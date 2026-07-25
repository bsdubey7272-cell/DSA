class Solution {
    public int maxProduct(int n) {
        int maxproduct=Integer.MIN_VALUE;
        ArrayList<Integer> ans=new ArrayList<>();
        while(n>=1){
            ans.add(n%10);
            n=n/10;
        }
        //int maxproduct=Integer.MIN_VALUE;
        for(int i=0;i<ans.size();i++){
            for(int j=i+1;j<ans.size();j++){
                maxproduct=Math.max(maxproduct,ans.get(i)*ans.get(j));
            }
        }
        return maxproduct;
        
    }
}