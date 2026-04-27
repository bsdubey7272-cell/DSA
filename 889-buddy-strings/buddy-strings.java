class Solution {
    public boolean checkfrq(String s){
        int arr[]=new int [26];
        for( char ch:s.toCharArray()){
            arr[ch-'a']++;
            if(arr[ch-'a']>1){
                return true;
            }
        }

        return false;
    }
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        if(s.equals(goal)){
            return checkfrq(s);
        }
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)!=goal.charAt(i)){
                ans.add(i);
            }

        }
         if (ans.size() != 2)
            return false;
        
        int first = ans.get(0);
        int second = ans.get(1);
        
        
        char[] sArr = s.toCharArray();
        char temp = sArr[first];
        sArr[first] = sArr[second];
        sArr[second] = temp;
        
        return new String(sArr).equals(goal);
        
    }
}