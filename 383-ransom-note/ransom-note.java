class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> ans=new HashMap<>();
        Map<Character,Integer> result=new HashMap<>();
        for(char ch:ransomNote.toCharArray()){
            ans.put(ch, ans.getOrDefault(ch, 0) + 1);
        }
        for(char ch:magazine.toCharArray()){
            result.put(ch,result.getOrDefault(ch,0)+1);
        }
        for(char ch:ans.keySet()){
            if(result.getOrDefault(ch,0)<ans.get(ch)){
                return false;
            }
        }
        return true;
    }
}