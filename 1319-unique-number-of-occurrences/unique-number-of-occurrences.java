class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int num:arr){
            ans.put(num,ans.getOrDefault(num,0)+1);

        }
        Set<Integer> result=new HashSet<>();
        for(int n:ans.values()){
           if(result.contains(n)){
            return false;
           }
           result.add(n);
        }
        return true;

        
    }
}