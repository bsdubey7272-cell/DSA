class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char CharArray[]=str.toCharArray();
            Arrays.sort(CharArray);
             String sortedStr = new String(CharArray);
             if (!map.containsKey(sortedStr)){
                map.put(sortedStr,new ArrayList<>());
             }
             map.get(sortedStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}